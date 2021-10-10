/*
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
package com.helger.font.lato2;

import javax.annotation.Nonnull;

import com.helger.commons.annotation.Nonempty;
import com.helger.font.api.EFontStyle;
import com.helger.font.api.EFontType;
import com.helger.font.api.EFontWeight;
import com.helger.font.api.FontResource;
import com.helger.font.api.IFontResource;
import com.helger.font.api.IFontStyle;
import com.helger.font.api.IFontWeight;
import com.helger.font.api.IHasFontResource;

/**
 * Defines the available font resources available in this library.
 *
 * @author Philip Helger
 */
public enum EFontResourceLato2 implements IHasFontResource
{
  // Lato2 (SIL Open Font License 1.1)
  LATO2_HAIRLINE ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.HAIRLINE, "fonts/otf/Lato2/Lato-Hairline.ttf"),
  LATO2_HAIRLINE_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.HAIRLINE, "fonts/otf/Lato2/Lato-HairlineItalic.ttf"),
  LATO2_THIN ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/otf/Lato2/Lato-Thin.ttf"),
  LATO2_THIN_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/otf/Lato2/Lato-ThinItalic.ttf"),
  LATO2_LIGHT ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/otf/Lato2/Lato-Light.ttf"),
  LATO2_LIGHT_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/otf/Lato2/Lato-LightItalic.ttf"),
  LATO2_NORMAL ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/otf/Lato2/Lato-Regular.ttf"),
  LATO2_NORMAL_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/otf/Lato2/Lato-Italic.ttf"),
  LATO2_MEDIUM ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/otf/Lato2/Lato-Medium.ttf"),
  LATO2_MEDIUM_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/otf/Lato2/Lato-MediumItalic.ttf"),
  LATO2_SEMI_BOLD ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.SEMI_BOLD, "fonts/otf/Lato2/Lato-Semibold.ttf"),
  LATO2_SEMI_BOLD_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.SEMI_BOLD, "fonts/otf/Lato2/Lato-SemiboldItalic.ttf"),
  LATO2_BOLD ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/otf/Lato2/Lato-Bold.ttf"),
  LATO2_BOLD_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/otf/Lato2/Lato-BoldItalic.ttf"),
  LATO2_HEAVY ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/otf/Lato2/Lato-Heavy.ttf"),
  LATO2_HEAVY_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/otf/Lato2/Lato-HeavyItalic.ttf"),
  LATO2_BLACK ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/otf/Lato2/Lato-Black.ttf"),
  LATO2_BLACK_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/otf/Lato2/Lato-BlackItalic.ttf");

  private final FontResource m_aRes;

  EFontResourceLato2 (@Nonnull @Nonempty final String sFontName,
                      @Nonnull final EFontType eFontType,
                      @Nonnull final IFontStyle aFontStyle,
                      @Nonnull final IFontWeight aFontWeight,
                      @Nonnull @Nonempty final String sPath)
  {
    m_aRes = new FontResource (sFontName, eFontType, aFontStyle, aFontWeight, sPath);
  }

  @Nonnull
  public IFontResource getFontResource ()
  {
    return m_aRes;
  }
}
