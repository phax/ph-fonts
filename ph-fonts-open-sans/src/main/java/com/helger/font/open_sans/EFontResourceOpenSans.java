/**
 * Copyright (C) 2014-2020 Philip Helger (www.helger.com)
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
package com.helger.font.open_sans;

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
public enum EFontResourceOpenSans implements IHasFontResource
{
  // Open Sans (Apache 2.0 License)
  OPEN_SANS_LIGHT ("Open Sans",
                   EFontType.TTF,
                   EFontStyle.REGULAR,
                   EFontWeight.LIGHT,
                   "fonts/ttf/OpenSans/OpenSans-Light.ttf"),
  OPEN_SANS_LIGHT_ITALIC ("Open Sans",
                          EFontType.TTF,
                          EFontStyle.ITALIC,
                          EFontWeight.LIGHT,
                          "fonts/ttf/OpenSans/OpenSans-LightItalic.ttf"),
  OPEN_SANS_NORMAL ("Open Sans",
                    EFontType.TTF,
                    EFontStyle.REGULAR,
                    EFontWeight.REGULAR,
                    "fonts/ttf/OpenSans/OpenSans-Regular.ttf"),
  OPEN_SANS_NORMAL_ITALIC ("Open Sans",
                           EFontType.TTF,
                           EFontStyle.ITALIC,
                           EFontWeight.REGULAR,
                           "fonts/ttf/OpenSans/OpenSans-Italic.ttf"),
  OPEN_SANS_SEMI_BOLD ("Open Sans",
                       EFontType.TTF,
                       EFontStyle.REGULAR,
                       EFontWeight.SEMI_BOLD,
                       "fonts/ttf/OpenSans/OpenSans-SemiBold.ttf"),
  OPEN_SANS_SEMI_BOLD_ITALIC ("Open Sans",
                              EFontType.TTF,
                              EFontStyle.ITALIC,
                              EFontWeight.SEMI_BOLD,
                              "fonts/ttf/OpenSans/OpenSans-SemiBoldItalic.ttf"),
  OPEN_SANS_BOLD ("Open Sans",
                  EFontType.TTF,
                  EFontStyle.REGULAR,
                  EFontWeight.BOLD,
                  "fonts/ttf/OpenSans/OpenSans-Bold.ttf"),
  OPEN_SANS_BOLD_ITALIC ("Open Sans",
                         EFontType.TTF,
                         EFontStyle.ITALIC,
                         EFontWeight.BOLD,
                         "fonts/ttf/OpenSans/OpenSans-BoldItalic.ttf"),
  OPEN_SANS_EXTRA_BOLD ("Open Sans",
                        EFontType.TTF,
                        EFontStyle.REGULAR,
                        EFontWeight.EXTRA_BOLD,
                        "fonts/ttf/OpenSans/OpenSans-ExtraBold.ttf"),
  OPEN_SANS_EXTRA_BOLD_ITALIC ("Open Sans",
                               EFontType.TTF,
                               EFontStyle.ITALIC,
                               EFontWeight.EXTRA_BOLD,
                               "fonts/ttf/OpenSans/OpenSans-ExtraBoldItalic.ttf");

  private final FontResource m_aRes;

  private EFontResourceOpenSans (@Nonnull @Nonempty final String sFontName,
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
