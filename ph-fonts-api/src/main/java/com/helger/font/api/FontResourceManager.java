/**
 * Copyright (C) 2014-2021 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.font.api;

import java.util.function.Predicate;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.CollectionHelper;
import com.helger.commons.collection.impl.CommonsLinkedHashSet;
import com.helger.commons.collection.impl.ICommonsOrderedSet;
import com.helger.commons.concurrent.SimpleReadWriteLock;
import com.helger.commons.lang.ClassLoaderHelper;
import com.helger.commons.lang.ServiceLoaderHelper;
import com.helger.commons.string.StringHelper;

/**
 * A global manager keeping all available {@link IFontResource} objects.
 *
 * @author Philip Helger
 */
@ThreadSafe
public final class FontResourceManager
{
  private static final Logger LOGGER = LoggerFactory.getLogger (FontResourceManager.class);
  private static final SimpleReadWriteLock s_aRWLock = new SimpleReadWriteLock ();
  @GuardedBy ("s_aRWLock")
  private static final ICommonsOrderedSet <IFontResource> s_aItems = new CommonsLinkedHashSet <> ();

  static
  {
    reInit (null);
  }

  private FontResourceManager ()
  {}

  public static void reInit (@Nullable final ClassLoader aClassLoader)
  {
    s_aRWLock.writeLocked ( () -> {
      // Remove all existing font resources
      s_aItems.clear ();

      final ClassLoader aRealClassLoader = aClassLoader != null ? aClassLoader
                                                                : ClassLoaderHelper.getDefaultClassLoader ();

      // Load all SPI resources
      for (final IFontResourceProviderSPI aProvider : ServiceLoaderHelper.getAllSPIImplementations (IFontResourceProviderSPI.class,
                                                                                                    aRealClassLoader))
      {
        // Register all font resources of the current provider
        for (final IFontResource aFontResource : aProvider.getAllFontResources ())
          if (!s_aItems.add (aFontResource))
            LOGGER.warn ("Failed to register font resource " +
                         aFontResource +
                         " because this resource is already contained!");
      }

      if (s_aItems.isEmpty ())
        LOGGER.info ("No font resources available for registration!");
      else
        LOGGER.info ("Successfully registered " + s_aItems.size () + " font resources!");
    });
  }

  /**
   * @return The number of registered font resources. Always &ge; 0.
   */
  @Nonnegative
  public static int getRegisteredResourceCount ()
  {
    return s_aRWLock.readLockedInt (s_aItems::size);
  }

  /**
   * @return An ordered set with all contained font resources. Never
   *         <code>null</code> but maybe empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResources ()
  {
    return s_aRWLock.readLockedGet (s_aItems::getClone);
  }

  /**
   * @param aFilter
   *        An optional filter to be used. May be <code>null</code> to indicate
   *        to return all resources.
   * @return An ordered set with all matching contained font resources. Never
   *         <code>null</code> but maybe empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResources (@Nullable final Predicate <? super IFontResource> aFilter)
  {
    if (aFilter == null)
      return getAllResources ();

    return s_aRWLock.readLockedGet ( () -> CollectionHelper.newOrderedSet (s_aItems, aFilter));
  }

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResourcesOfFontType (@Nullable final String sFontName)
  {
    if (StringHelper.hasNoText (sFontName))
      return new CommonsLinkedHashSet <> ();

    return getAllResources (f -> f.getFontName ().equals (sFontName));
  }

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResourcesOfFontType (@Nullable final EFontType eFontType)
  {
    if (eFontType == null)
      return new CommonsLinkedHashSet <> ();

    return getAllResources (f -> f.getFontType ().equals (eFontType));
  }

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResourcesOfFontWeight (@Nullable final IFontWeight aFontWeight)
  {
    if (aFontWeight == null)
      return new CommonsLinkedHashSet <> ();

    return getAllResources (f -> f.getFontWeight ().equals (aFontWeight));
  }
}
