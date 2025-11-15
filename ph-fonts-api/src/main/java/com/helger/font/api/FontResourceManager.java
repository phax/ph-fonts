/*
 * Copyright (C) 2014-2025 Philip Helger (www.helger.com)
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

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.annotation.Nonnegative;
import com.helger.annotation.concurrent.GuardedBy;
import com.helger.annotation.concurrent.ThreadSafe;
import com.helger.annotation.style.ReturnsMutableCopy;
import com.helger.base.classloader.ClassLoaderHelper;
import com.helger.base.concurrent.SimpleReadWriteLock;
import com.helger.base.spi.ServiceLoaderHelper;
import com.helger.base.string.StringHelper;
import com.helger.collection.commons.CommonsLinkedHashSet;
import com.helger.collection.commons.ICommonsOrderedSet;

/**
 * A global manager keeping all available {@link IFontResource} objects.
 *
 * @author Philip Helger
 */
@ThreadSafe
public final class FontResourceManager
{
  private static final Logger LOGGER = LoggerFactory.getLogger (FontResourceManager.class);
  private static final SimpleReadWriteLock RW_LOCK = new SimpleReadWriteLock ();
  @GuardedBy ("s_aRWLock")
  private static final ICommonsOrderedSet <IFontResource> ITEMS = new CommonsLinkedHashSet <> ();

  static
  {
    reInit (null);
  }

  private FontResourceManager ()
  {}

  public static void reInit (@Nullable final ClassLoader aClassLoader)
  {
    RW_LOCK.writeLocked ( () -> {
      // Remove all existing font resources
      ITEMS.clear ();

      final ClassLoader aRealClassLoader = aClassLoader != null ? aClassLoader : ClassLoaderHelper
                                                                                                  .getDefaultClassLoader ();

      // Load all SPI resources
      for (final IFontResourceProviderSPI aProvider : ServiceLoaderHelper.getAllSPIImplementations (IFontResourceProviderSPI.class,
                                                                                                    aRealClassLoader))
      {
        // Register all font resources of the current provider
        for (final IFontResource aFontResource : aProvider.getAllFontResources ())
          if (!ITEMS.add (aFontResource))
            LOGGER.warn ("Failed to register font resource " +
                         aFontResource +
                         " because this resource is already contained!");
      }

      if (ITEMS.isEmpty ())
        LOGGER.info ("No font resources available for registration!");
      else
        LOGGER.info ("Successfully registered " + ITEMS.size () + " font resources!");
    });
  }

  /**
   * @return The number of registered font resources. Always &ge; 0.
   */
  @Nonnegative
  public static int getRegisteredResourceCount ()
  {
    return RW_LOCK.readLockedInt (ITEMS::size);
  }

  /**
   * @return An ordered set with all contained font resources. Never <code>null</code> but maybe
   *         empty.
   */
  @NonNull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResources ()
  {
    return RW_LOCK.readLockedGet (ITEMS::getClone);
  }

  /**
   * @param aFilter
   *        An optional filter to be used. May be <code>null</code> to indicate to return all
   *        resources.
   * @return An ordered set with all matching contained font resources. Never <code>null</code> but
   *         maybe empty.
   */
  @NonNull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResources (@Nullable final Predicate <? super IFontResource> aFilter)
  {
    if (aFilter == null)
      return getAllResources ();

    return RW_LOCK.readLockedGet ( () -> CommonsLinkedHashSet.createFiltered (ITEMS, aFilter));
  }

  @NonNull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResourcesOfFontType (@Nullable final String sFontName)
  {
    if (StringHelper.isEmpty (sFontName))
      return new CommonsLinkedHashSet <> ();

    return getAllResources (f -> f.getFontName ().equals (sFontName));
  }

  @NonNull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResourcesOfFontType (@Nullable final EFontType eFontType)
  {
    if (eFontType == null)
      return new CommonsLinkedHashSet <> ();

    return getAllResources (f -> f.getFontType ().equals (eFontType));
  }

  @NonNull
  @ReturnsMutableCopy
  public static ICommonsOrderedSet <IFontResource> getAllResourcesOfFontWeight (@Nullable final IFontWeight aFontWeight)
  {
    if (aFontWeight == null)
      return new CommonsLinkedHashSet <> ();

    return getAllResources (f -> f.getFontWeight ().equals (aFontWeight));
  }
}
