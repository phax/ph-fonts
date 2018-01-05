/**
 * Copyright (C) 2014-2018 Philip Helger (www.helger.com)
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
package com.helger.font.alegreya_sans;

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
public enum EFontResourceAlegreyaSans implements IHasFontResource
{
  // Alegreya Sans (SIL Open Font License, 1.1)
  ALGREYA_SANS_THIN ("Alegreya Sans",
                     EFontType.TTF,
                     EFontStyle.REGULAR,
                     EFontWeight.THIN,
                     "fonts/ttf/AlegreyaSans/AlegreyaSans-Thin.ttf"),
  ALGREYA_SANS_THIN_ITALIC ("Alegreya Sans",
                            EFontType.TTF,
                            EFontStyle.ITALIC,
                            EFontWeight.THIN,
                            "fonts/ttf/AlegreyaSans/AlegreyaSans-ThinItalic.ttf"),
  ALGREYA_SANS_LIGHT ("Alegreya Sans",
                      EFontType.TTF,
                      EFontStyle.REGULAR,
                      EFontWeight.LIGHT,
                      "fonts/ttf/AlegreyaSans/AlegreyaSans-Light.ttf"),
  ALGREYA_SANS_LIGHT_ITALIC ("Alegreya Sans",
                             EFontType.TTF,
                             EFontStyle.ITALIC,
                             EFontWeight.LIGHT,
                             "fonts/ttf/AlegreyaSans/AlegreyaSans-LightItalic.ttf"),
  ALGREYA_SANS_NORMAL ("Alegreya Sans",
                       EFontType.TTF,
                       EFontStyle.REGULAR,
                       EFontWeight.REGULAR,
                       "fonts/ttf/AlegreyaSans/AlegreyaSans-Regular.ttf"),
  ALGREYA_SANS_NORMAL_ITALIC ("Alegreya Sans",
                              EFontType.TTF,
                              EFontStyle.ITALIC,
                              EFontWeight.REGULAR,
                              "fonts/ttf/AlegreyaSans/AlegreyaSans-Italic.ttf"),
  ALGREYA_SANS_MEDIUM ("Alegreya Sans",
                       EFontType.TTF,
                       EFontStyle.REGULAR,
                       EFontWeight.MEDIUM,
                       "fonts/ttf/AlegreyaSans/AlegreyaSans-Medium.ttf"),
  ALGREYA_SANS_MEDIUM_ITALIC ("Alegreya Sans",
                              EFontType.TTF,
                              EFontStyle.ITALIC,
                              EFontWeight.MEDIUM,
                              "fonts/ttf/AlegreyaSans/AlegreyaSans-MediumItalic.ttf"),
  ALGREYA_SANS_BOLD ("Alegreya Sans",
                     EFontType.TTF,
                     EFontStyle.REGULAR,
                     EFontWeight.BOLD,
                     "fonts/ttf/AlegreyaSans/AlegreyaSans-Bold.ttf"),
  ALGREYA_SANS_BOLD_ITALIC ("Alegreya Sans",
                            EFontType.TTF,
                            EFontStyle.ITALIC,
                            EFontWeight.BOLD,
                            "fonts/ttf/AlegreyaSans/AlegreyaSans-BoldItalic.ttf"),
  ALGREYA_SANS_EXTRA_BOLD ("Alegreya Sans",
                           EFontType.TTF,
                           EFontStyle.REGULAR,
                           EFontWeight.EXTRA_BOLD,
                           "fonts/ttf/AlegreyaSans/AlegreyaSans-ExtraBold.ttf"),
  ALGREYA_SANS_EXTRA_BOLD_ITALIC ("Alegreya Sans",
                                  EFontType.TTF,
                                  EFontStyle.ITALIC,
                                  EFontWeight.EXTRA_BOLD,
                                  "fonts/ttf/AlegreyaSans/AlegreyaSans-ExtraBoldItalic.ttf"),
  ALGREYA_SANS_BLACK ("Alegreya Sans",
                      EFontType.TTF,
                      EFontStyle.REGULAR,
                      EFontWeight.BLACK,
                      "fonts/ttf/AlegreyaSans/AlegreyaSans-Black.ttf"),
  ALGREYA_SANS_BLACK_ITALIC ("Alegreya Sans",
                             EFontType.TTF,
                             EFontStyle.ITALIC,
                             EFontWeight.BLACK,
                             "fonts/ttf/AlegreyaSans/AlegreyaSans-BlackItalic.ttf");

  private final FontResource m_aRes;

  private EFontResourceAlegreyaSans (@Nonnull @Nonempty final String sFontName,
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
