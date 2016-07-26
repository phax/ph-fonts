/**
 * Copyright (C) 2014-2016 Philip Helger (www.helger.com)
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
package com.helger.font.exo2;

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
public enum EFontResourceExo2 implements IHasFontResource
{
  // Exo 2.0 (SIL Open Font License, 1.1)
  EXO2_THIN ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/otf/Exo2/Exo2.0-Thin.otf"),
  EXO2_THIN_ITALIC ("Exo 2.0",
                    EFontType.OTF,
                    EFontStyle.ITALIC,
                    EFontWeight.THIN,
                    "fonts/otf/Exo2/Exo2.0-ThinItalic.otf"),
  EXO2_EXTRA_LIGHT ("Exo 2.0",
                    EFontType.OTF,
                    EFontStyle.REGULAR,
                    EFontWeight.EXTRA_LIGHT,
                    "fonts/otf/Exo2/Exo2.0-ExtraLight.otf"),
  EXO2_EXTRA_LIGHT_ITALIC ("Exo 2.0",
                           EFontType.OTF,
                           EFontStyle.ITALIC,
                           EFontWeight.EXTRA_LIGHT,
                           "fonts/otf/Exo2/Exo2.0-ExtraLightItalic.otf"),
  EXO2_LIGHT ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/otf/Exo2/Exo2.0-Light.otf"),
  EXO2_LIGHT_ITALIC ("Exo 2.0",
                     EFontType.OTF,
                     EFontStyle.ITALIC,
                     EFontWeight.LIGHT,
                     "fonts/otf/Exo2/Exo2.0-LightItalic.otf"),
  EXO2_NORMAL ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/otf/Exo2/Exo2.0-Regular.otf"),
  EXO2_NORMAL_ITALIC ("Exo 2.0",
                      EFontType.OTF,
                      EFontStyle.ITALIC,
                      EFontWeight.REGULAR,
                      "fonts/otf/Exo2/Exo2.0-Italic.otf"),
  EXO2_MEDIUM ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/otf/Exo2/Exo2.0-Medium.otf"),
  EXO2_MEDIUM_ITALIC ("Exo 2.0",
                      EFontType.OTF,
                      EFontStyle.ITALIC,
                      EFontWeight.MEDIUM,
                      "fonts/otf/Exo2/Exo2.0-MediumItalic.otf"),
  EXO2_SEMI_BOLD ("Exo 2.0",
                  EFontType.OTF,
                  EFontStyle.REGULAR,
                  EFontWeight.SEMI_BOLD,
                  "fonts/otf/Exo2/Exo2.0-SemiBold.otf"),
  EXO2_SEMI_BOLD_ITALIC ("Exo 2.0",
                         EFontType.OTF,
                         EFontStyle.ITALIC,
                         EFontWeight.SEMI_BOLD,
                         "fonts/otf/Exo2/Exo2.0-SemiBoldItalic.otf"),
  EXO2_BOLD ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/otf/Exo2/Exo2.0-Bold.otf"),
  EXO2_BOLD_ITALIC ("Exo 2.0",
                    EFontType.OTF,
                    EFontStyle.ITALIC,
                    EFontWeight.BOLD,
                    "fonts/otf/Exo2/Exo2.0-BoldItalic.otf"),
  EXO2_EXTRA_BOLD ("Exo 2.0",
                   EFontType.OTF,
                   EFontStyle.REGULAR,
                   EFontWeight.EXTRA_BOLD,
                   "fonts/otf/Exo2/Exo2.0-ExtraBold.otf"),
  EXO2_EXTRA_BOLD_ITALIC ("Exo 2.0",
                          EFontType.OTF,
                          EFontStyle.ITALIC,
                          EFontWeight.EXTRA_BOLD,
                          "fonts/otf/Exo2/Exo2.0-ExtraBoldItalic.otf"),
  EXO2_BLACK ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/otf/Exo2/Exo2.0-Black.otf"),
  EXO2_BLACK_ITALIC ("Exo 2.0",
                     EFontType.OTF,
                     EFontStyle.ITALIC,
                     EFontWeight.BLACK,
                     "fonts/otf/Exo2/Exo2.0-BlackItalic.otf");

  private final FontResource m_aRes;

  private EFontResourceExo2 (@Nonnull @Nonempty final String sFontName,
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
