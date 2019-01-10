/**
 * Copyright (C) 2014-2019 Philip Helger (www.helger.com)
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
  EXO2_THIN ("Exo 2.0", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Exo2/Exo2-Thin.ttf"),
  EXO2_THIN_ITALIC ("Exo 2.0",
                    EFontType.TTF,
                    EFontStyle.ITALIC,
                    EFontWeight.THIN,
                    "fonts/ttf/Exo2/Exo2-ThinItalic.ttf"),
  EXO2_EXTRA_LIGHT ("Exo 2.0",
                    EFontType.TTF,
                    EFontStyle.REGULAR,
                    EFontWeight.EXTRA_LIGHT,
                    "fonts/ttf/Exo2/Exo2-ExtraLight.ttf"),
  EXO2_EXTRA_LIGHT_ITALIC ("Exo 2.0",
                           EFontType.TTF,
                           EFontStyle.ITALIC,
                           EFontWeight.EXTRA_LIGHT,
                           "fonts/ttf/Exo2/Exo2-ExtraLightItalic.ttf"),
  EXO2_LIGHT ("Exo 2.0", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Exo2/Exo2-Light.ttf"),
  EXO2_LIGHT_ITALIC ("Exo 2.0",
                     EFontType.TTF,
                     EFontStyle.ITALIC,
                     EFontWeight.LIGHT,
                     "fonts/ttf/Exo2/Exo2-LightItalic.ttf"),
  EXO2_NORMAL ("Exo 2.0", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Exo2/Exo2-Regular.ttf"),
  EXO2_NORMAL_ITALIC ("Exo 2.0",
                      EFontType.TTF,
                      EFontStyle.ITALIC,
                      EFontWeight.REGULAR,
                      "fonts/ttf/Exo2/Exo2-Italic.ttf"),
  EXO2_MEDIUM ("Exo 2.0", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Exo2/Exo2-Medium.ttf"),
  EXO2_MEDIUM_ITALIC ("Exo 2.0",
                      EFontType.TTF,
                      EFontStyle.ITALIC,
                      EFontWeight.MEDIUM,
                      "fonts/ttf/Exo2/Exo2-MediumItalic.ttf"),
  EXO2_SEMI_BOLD ("Exo 2.0",
                  EFontType.TTF,
                  EFontStyle.REGULAR,
                  EFontWeight.SEMI_BOLD,
                  "fonts/ttf/Exo2/Exo2-SemiBold.ttf"),
  EXO2_SEMI_BOLD_ITALIC ("Exo 2.0",
                         EFontType.TTF,
                         EFontStyle.ITALIC,
                         EFontWeight.SEMI_BOLD,
                         "fonts/ttf/Exo2/Exo2-SemiBoldItalic.ttf"),
  EXO2_BOLD ("Exo 2.0", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Exo2/Exo2-Bold.ttf"),
  EXO2_BOLD_ITALIC ("Exo 2.0",
                    EFontType.TTF,
                    EFontStyle.ITALIC,
                    EFontWeight.BOLD,
                    "fonts/ttf/Exo2/Exo2-BoldItalic.ttf"),
  EXO2_EXTRA_BOLD ("Exo 2.0",
                   EFontType.TTF,
                   EFontStyle.REGULAR,
                   EFontWeight.EXTRA_BOLD,
                   "fonts/ttf/Exo2/Exo2-ExtraBold.ttf"),
  EXO2_EXTRA_BOLD_ITALIC ("Exo 2.0",
                          EFontType.TTF,
                          EFontStyle.ITALIC,
                          EFontWeight.EXTRA_BOLD,
                          "fonts/ttf/Exo2/Exo2-ExtraBoldItalic.ttf"),
  EXO2_BLACK ("Exo 2.0", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Exo2/Exo2-Black.ttf"),
  EXO2_BLACK_ITALIC ("Exo 2.0",
                     EFontType.TTF,
                     EFontStyle.ITALIC,
                     EFontWeight.BLACK,
                     "fonts/ttf/Exo2/Exo2-BlackItalic.ttf");

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
