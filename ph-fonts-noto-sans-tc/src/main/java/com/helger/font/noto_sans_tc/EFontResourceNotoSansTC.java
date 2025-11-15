/*
 * Copyright (C) 2025 Philip Helger (www.helger.com)
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
package com.helger.font.noto_sans_tc;

import org.jspecify.annotations.NonNull;

import com.helger.annotation.Nonempty;
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
public enum EFontResourceNotoSansTC implements IHasFontResource
{
  // Noto Sans TC (Open Font License)
  NOTO_SANS_TC_THIN ("Noto Sans TC",
                     EFontType.TTF,
                     EFontStyle.REGULAR,
                     EFontWeight.THIN,
                     "fonts/ttf/NotoSansTC/NotoSansTC-Thin.ttf"),
  NOTO_SANS_TC_LIGHT ("Noto Sans TC",
                      EFontType.TTF,
                      EFontStyle.REGULAR,
                      EFontWeight.LIGHT,
                      "fonts/ttf/NotoSansTC/NotoSansTC-Light.ttf"),
  NOTO_SANS_TC_REGULAR ("Noto Sans TC",
                        EFontType.TTF,
                        EFontStyle.REGULAR,
                        EFontWeight.REGULAR,
                        "fonts/ttf/NotoSansTC/NotoSansTC-Regular.ttf"),
  NOTO_SANS_TC_MEDIUM ("Noto Sans TC",
                       EFontType.TTF,
                       EFontStyle.REGULAR,
                       EFontWeight.MEDIUM,
                       "fonts/ttf/NotoSansTC/NotoSansTC-Medium.ttf"),
  NOTO_SANS_TC_BOLD ("Noto Sans TC",
                     EFontType.TTF,
                     EFontStyle.REGULAR,
                     EFontWeight.BOLD,
                     "fonts/ttf/NotoSansTC/NotoSansTC-Bold.ttf"),
  NOTO_SANS_TC_BLACK ("Noto Sans TC",
                      EFontType.TTF,
                      EFontStyle.REGULAR,
                      EFontWeight.BLACK,
                      "fonts/ttf/NotoSansTC/NotoSansTC-Black.ttf");

  private final FontResource m_aRes;

  EFontResourceNotoSansTC (@NonNull @Nonempty final String sFontName,
                           @NonNull final EFontType eFontType,
                           @NonNull final IFontStyle aFontStyle,
                           @NonNull final IFontWeight aFontWeight,
                           @NonNull @Nonempty final String sPath)
  {
    m_aRes = new FontResource (sFontName, eFontType, aFontStyle, aFontWeight, sPath);
  }

  @NonNull
  public IFontResource getFontResource ()
  {
    return m_aRes;
  }
}
