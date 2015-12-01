/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
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

import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.concurrent.SimpleReadWriteLock;
import com.helger.commons.filter.IFilter;
import com.helger.commons.lang.ClassLoaderHelper;
import com.helger.commons.lang.ServiceLoaderHelper;
import com.helger.commons.string.StringHelper;

/**
 * A global manager keeping all available {@link IFontResource} objects.
 *
 * @author Philip Helger
 */
public final class FontResourceManager
{
  private static final Logger s_aLogger = LoggerFactory.getLogger (FontResourceManager.class);
  private static final SimpleReadWriteLock s_aRWLock = new SimpleReadWriteLock ();
  private static final Set <IFontResource> s_aItems = new LinkedHashSet <IFontResource> ();

  static
  {
    reInit (null);
  }

  private FontResourceManager ()
  {}

  public static void reInit (@Nullable final ClassLoader aClassLoader)
  {
    s_aRWLock.writeLock ().lock ();
    try
    {
      // Remove all existing font resources
      s_aItems.clear ();

      final ClassLoader aRealClassLoader = aClassLoader != null ? aClassLoader : ClassLoaderHelper.getDefaultClassLoader ();

      // Load all SPI resources
      for (final IFontResourceProviderSPI aProvider : ServiceLoaderHelper.getAllSPIImplementations (IFontResourceProviderSPI.class, aRealClassLoader))
      {
        // Register all font resources of the current provider
        for (final IFontResource aFontResource : aProvider.getAllFontResources ())
          if (!s_aItems.add (aFontResource))
            s_aLogger.warn ("Failed to register font resource " + aFontResource + " because this resource is already contained!");
      }
      s_aLogger.info ("Successfully registered " + s_aItems.size () + " font resources!");
    }
    finally

    {
      s_aRWLock.writeLock ().unlock ();
    }
  }

  /**
   * @return The number of registered font resources. Always &ge; 0.
   */
  @Nonnegative
  public static int getRegisteredResourceCount ()
  {
    s_aRWLock.readLock ().lock ();
    try
    {
      return s_aItems.size ();
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
  }

  /**
   * @return An ordered set with all contained font resources. Never
   *         <code>null</code> but maybe empty.
   */
  @Nonnull
  @ReturnsMutableCopy
  public static Set <IFontResource> getAllResources ()
  {
    return getAllResources (null);
  }

  @Nonnull
  @ReturnsMutableCopy
  public static Set <IFontResource> getAllResources (@Nullable final IFilter <IFontResource> aFilter)
  {
    final Set <IFontResource> ret = new LinkedHashSet <IFontResource> ();
    s_aRWLock.readLock ().lock ();
    try
    {
      for (final IFontResource aRes : s_aItems)
        if (aFilter == null || aFilter.matchesFilter (aRes))
          ret.add (aRes);
    }
    finally
    {
      s_aRWLock.readLock ().unlock ();
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static Set <IFontResource> getAllResourcesOfFontType (@Nullable final String sFontName)
  {
    final Set <IFontResource> ret = new LinkedHashSet <IFontResource> ();
    if (StringHelper.hasText (sFontName))
    {
      s_aRWLock.readLock ().lock ();
      try
      {
        for (final IFontResource aRes : s_aItems)
          if (aRes.getFontName ().equals (sFontName))
            ret.add (aRes);
      }
      finally
      {
        s_aRWLock.readLock ().unlock ();
      }
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static Set <IFontResource> getAllResourcesOfFontType (@Nullable final EFontType eFontType)
  {
    final Set <IFontResource> ret = new LinkedHashSet <IFontResource> ();
    if (eFontType != null)
    {
      s_aRWLock.readLock ().lock ();
      try
      {
        for (final IFontResource aRes : s_aItems)
          if (aRes.getFontType ().equals (eFontType))
            ret.add (aRes);
      }
      finally
      {
        s_aRWLock.readLock ().unlock ();
      }
    }
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static Set <IFontResource> getAllResourcesOfFontWeight (@Nullable final IFontWeight aFontWeight)
  {
    final Set <IFontResource> ret = new LinkedHashSet <IFontResource> ();
    if (aFontWeight != null)
    {
      s_aRWLock.readLock ().lock ();
      try
      {
        for (final IFontResource aRes : s_aItems)
          if (aRes.getFontWeight ().equals (aFontWeight))
            ret.add (aRes);
      }
      finally
      {
        s_aRWLock.readLock ().unlock ();
      }
    }
    return ret;
  }
}
