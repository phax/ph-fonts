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

import java.io.InputStream;

import javax.annotation.Nonnull;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.string.ToStringGenerator;

/**
 * The default implementation of {@link IFontResource}.
 *
 * @author Philip Helger
 */
public class FontResource implements IFontResource
{
  private final String m_sID;
  private final String m_sFontName;
  private final EFontType m_eFontType;
  private final IFontStyle m_aFontStyle;
  private final IFontWeight m_aFontWeight;
  private final String m_sPath;

  public FontResource (@Nonnull @Nonempty final String sFontName,
                       @Nonnull final EFontType eFontType,
                       @Nonnull final IFontStyle aFontStyle,
                       @Nonnull final IFontWeight aFontWeight,
                       @Nonnull @Nonempty final String sPath)
  {
    m_sFontName = ValueEnforcer.notEmpty (sFontName, "FontName");
    m_eFontType = ValueEnforcer.notNull (eFontType, "FontType");
    m_aFontStyle = ValueEnforcer.notNull (aFontStyle, "FontStyle");
    m_aFontWeight = ValueEnforcer.notNull (aFontWeight, "FontWeight");
    m_sPath = ValueEnforcer.notEmpty (sPath, "Path");
    m_sID = sFontName + ":" + eFontType.getID () + ":" + aFontStyle.getID () + ":" + aFontWeight.getWeight ();
  }

  @Nonnull
  @Nonempty
  public String getID ()
  {
    return m_sID;
  }

  @Nonnull
  @Nonempty
  public String getFontName ()
  {
    return m_sFontName;
  }

  @Nonnull
  public EFontType getFontType ()
  {
    return m_eFontType;
  }

  @Nonnull
  public IFontStyle getFontStyle ()
  {
    return m_aFontStyle;
  }

  @Nonnull
  public IFontWeight getFontWeight ()
  {
    return m_aFontWeight;
  }

  @Nonnull
  @Nonempty
  public String getPath ()
  {
    return m_sPath;
  }

  @Nonnull
  public ClassPathResource getResource ()
  {
    return new ClassPathResource (m_sPath);
  }

  @Nonnull
  public InputStream getInputStream ()
  {
    return ClassPathResource.getInputStream (m_sPath);
  }

  public boolean isReadMultiple ()
  {
    return true;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final FontResource rhs = (FontResource) o;
    return m_sID.equals (rhs.m_sID) && m_sPath.equals (rhs.m_sPath);
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_sID).append (m_sPath).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("ID", m_sID)
                                       .append ("FontName", m_sFontName)
                                       .append ("FontType", m_eFontType)
                                       .append ("FontStyle", m_aFontStyle)
                                       .append ("FontWeight", m_aFontWeight)
                                       .append ("Path", m_sPath)
                                       .getToString ();
  }
}
