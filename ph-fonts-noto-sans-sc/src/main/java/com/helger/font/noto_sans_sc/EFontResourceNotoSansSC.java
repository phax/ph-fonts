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
package com.helger.font.noto_sans_sc;

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
public enum EFontResourceNotoSansSC implements IHasFontResource
{
  // Noto Sans SC (Open Font License)
  NOTO_SANS_SC_THIN ("Noto Sans SC", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/otf/NotoSansSC/NotoSansSC-Thin.otf"),
  NOTO_SANS_SC_LIGHT ("Noto Sans SC", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/otf/NotoSansSC/NotoSansSC-Light.otf"),
  NOTO_SANS_SC_REGULAR ("Noto Sans SC",
                        EFontType.OTF,
                        EFontStyle.REGULAR,
                        EFontWeight.REGULAR,
                        "fonts/otf/NotoSansSC/NotoSansSC-Regular.otf"),
  NOTO_SANS_SC_MEDIUM ("Noto Sans SC", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/otf/NotoSansSC/NotoSansSC-Medium.otf"),
  NOTO_SANS_SC_BOLD ("Noto Sans SC", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/otf/NotoSansSC/NotoSansSC-Bold.otf"),
  NOTO_SANS_SC_BLACK ("Noto Sans SC", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/otf/NotoSansSC/NotoSansSC-Black.otf");

  private final FontResource m_aRes;

  EFontResourceNotoSansSC (@Nonnull @Nonempty final String sFontName,
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
