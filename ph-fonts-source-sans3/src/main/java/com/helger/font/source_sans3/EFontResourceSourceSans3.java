/*
 * Copyright (C) 2014-2024 Philip Helger (www.helger.com)
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
package com.helger.font.source_sans3;

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
public enum EFontResourceSourceSans3 implements IHasFontResource
{
  // Source Sans3 (Open Font License )
  SOURCE_SANS3_EXTRA_LIGHT ("Source Sans3",
                            EFontType.TTF,
                            EFontStyle.REGULAR,
                            EFontWeight.EXTRA_LIGHT,
                            "fonts/ttf/SourceSans3/SourceSans3-ExtraLight.ttf"),
  SOURCE_SANS3_EXTRA_LIGHT_ITALIC ("Source Sans3",
                                   EFontType.TTF,
                                   EFontStyle.ITALIC,
                                   EFontWeight.EXTRA_LIGHT,
                                   "fonts/ttf/SourceSans3/SourceSans3-ExtraLightIt.ttf"),
  SOURCE_SANS3_LIGHT ("Source Sans3",
                      EFontType.TTF,
                      EFontStyle.REGULAR,
                      EFontWeight.LIGHT,
                      "fonts/ttf/SourceSans3/SourceSans3-Light.ttf"),
  SOURCE_SANS3_LIGHT_ITALIC ("Source Sans3",
                             EFontType.TTF,
                             EFontStyle.ITALIC,
                             EFontWeight.LIGHT,
                             "fonts/ttf/SourceSans3/SourceSans3-LightIt.ttf"),
  SOURCE_SANS3_NORMAL ("Source Sans3",
                       EFontType.TTF,
                       EFontStyle.REGULAR,
                       EFontWeight.REGULAR,
                       "fonts/ttf/SourceSans3/SourceSans3-Regular.ttf"),
  SOURCE_SANS3_NORMAL_ITALIC ("Source Sans3",
                              EFontType.TTF,
                              EFontStyle.ITALIC,
                              EFontWeight.REGULAR,
                              "fonts/ttf/SourceSans3/SourceSans3-It.ttf"),
  SOURCE_SANS3_MEDIUM ("Source Sans3",
                       EFontType.TTF,
                       EFontStyle.REGULAR,
                       EFontWeight.MEDIUM,
                       "fonts/ttf/SourceSans3/SourceSans3-Medium.ttf"),
  SOURCE_SANS3_MEDIUM_ITALIC ("Source Sans3",
                              EFontType.TTF,
                              EFontStyle.ITALIC,
                              EFontWeight.MEDIUM,
                              "fonts/ttf/SourceSans3/SourceSans3-MediumIt.ttf"),
  SOURCE_SANS3_SEMI_BOLD ("Source Sans3",
                          EFontType.TTF,
                          EFontStyle.REGULAR,
                          EFontWeight.SEMI_BOLD,
                          "fonts/ttf/SourceSans3/SourceSans3-Semibold.ttf"),
  SOURCE_SANS3_SEMI_BOLD_ITALIC ("Source Sans3",
                                 EFontType.TTF,
                                 EFontStyle.ITALIC,
                                 EFontWeight.SEMI_BOLD,
                                 "fonts/ttf/SourceSans3/SourceSans3-SemiboldIt.ttf"),
  SOURCE_SANS3_BOLD ("Source Sans3",
                     EFontType.TTF,
                     EFontStyle.REGULAR,
                     EFontWeight.BOLD,
                     "fonts/ttf/SourceSans3/SourceSans3-Bold.ttf"),
  SOURCE_SANS3_BOLD_ITALIC ("Source Sans3",
                            EFontType.TTF,
                            EFontStyle.ITALIC,
                            EFontWeight.BOLD,
                            "fonts/ttf/SourceSans3/SourceSans3-BoldIt.ttf"),
  SOURCE_SANS3_BLACK ("Source Sans3",
                      EFontType.TTF,
                      EFontStyle.REGULAR,
                      EFontWeight.BLACK,
                      "fonts/ttf/SourceSans3/SourceSans3-Black.ttf"),
  SOURCE_SANS3_BLACK_ITALIC ("Source Sans3",
                             EFontType.TTF,
                             EFontStyle.ITALIC,
                             EFontWeight.BLACK,
                             "fonts/ttf/SourceSans3/SourceSans3-BlackIt.ttf");

  private final FontResource m_aRes;

  EFontResourceSourceSans3 (@Nonnull @Nonempty final String sFontName,
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
