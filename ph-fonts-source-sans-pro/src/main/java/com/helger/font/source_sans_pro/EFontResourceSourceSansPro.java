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
package com.helger.font.source_sans_pro;

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
public enum EFontResourceSourceSansPro implements IHasFontResource
{
  // Source Sans Pro (Open Font License )
  SOURCE_SANS_PRO_EXTRA_LIGHT ("Source Sans Pro",
                               EFontType.TTF,
                               EFontStyle.REGULAR,
                               EFontWeight.EXTRA_LIGHT,
                               "fonts/ttf/SourceSansPro/SourceSansPro-ExtraLight.ttf"),
  SOURCE_SANS_PRO_EXTRA_LIGHT_ITALIC ("Source Sans Pro",
                                      EFontType.TTF,
                                      EFontStyle.ITALIC,
                                      EFontWeight.EXTRA_LIGHT,
                                      "fonts/ttf/SourceSansPro/SourceSansPro-ExtraLightItalic.ttf"),
  SOURCE_SANS_PRO_LIGHT ("Source Sans Pro",
                         EFontType.TTF,
                         EFontStyle.REGULAR,
                         EFontWeight.LIGHT,
                         "fonts/ttf/SourceSansPro/SourceSansPro-Light.ttf"),
  SOURCE_SANS_PRO_LIGHT_ITALIC ("Source Sans Pro",
                                EFontType.TTF,
                                EFontStyle.ITALIC,
                                EFontWeight.LIGHT,
                                "fonts/ttf/SourceSansPro/SourceSansPro-LightItalic.ttf"),
  SOURCE_SANS_PRO_NORMAL ("Source Sans Pro",
                          EFontType.TTF,
                          EFontStyle.REGULAR,
                          EFontWeight.REGULAR,
                          "fonts/ttf/SourceSansPro/SourceSansPro-Regular.ttf"),
  SOURCE_SANS_PRO_NORMAL_ITALIC ("Source Sans Pro",
                                 EFontType.TTF,
                                 EFontStyle.ITALIC,
                                 EFontWeight.REGULAR,
                                 "fonts/ttf/SourceSansPro/SourceSansPro-Italic.ttf"),
  SOURCE_SANS_PRO_SEMI_BOLD ("Source Sans Pro",
                             EFontType.TTF,
                             EFontStyle.REGULAR,
                             EFontWeight.SEMI_BOLD,
                             "fonts/ttf/SourceSansPro/SourceSansPro-SemiBold.ttf"),
  SOURCE_SANS_PRO_SEMI_BOLD_ITALIC ("Source Sans Pro",
                                    EFontType.TTF,
                                    EFontStyle.ITALIC,
                                    EFontWeight.SEMI_BOLD,
                                    "fonts/ttf/SourceSansPro/SourceSansPro-SemiBoldItalic.ttf"),
  SOURCE_SANS_PRO_BOLD ("Source Sans Pro",
                        EFontType.TTF,
                        EFontStyle.REGULAR,
                        EFontWeight.BOLD,
                        "fonts/ttf/SourceSansPro/SourceSansPro-Bold.ttf"),
  SOURCE_SANS_PRO_BOLD_ITALIC ("Source Sans Pro",
                               EFontType.TTF,
                               EFontStyle.ITALIC,
                               EFontWeight.BOLD,
                               "fonts/ttf/SourceSansPro/SourceSansPro-BoldItalic.ttf"),
  SOURCE_SANS_PRO_BLACK ("Source Sans Pro",
                         EFontType.TTF,
                         EFontStyle.REGULAR,
                         EFontWeight.BLACK,
                         "fonts/ttf/SourceSansPro/SourceSansPro-Black.ttf"),
  SOURCE_SANS_PRO_BLACK_ITALIC ("Source Sans Pro",
                                EFontType.TTF,
                                EFontStyle.ITALIC,
                                EFontWeight.BLACK,
                                "fonts/ttf/SourceSansPro/SourceSansPro-BlackItalic.ttf");

  private final FontResource m_aRes;

  EFontResourceSourceSansPro (@Nonnull @Nonempty final String sFontName,
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
