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
package com.helger.font.roboto;

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
public enum EFontResourceRoboto implements IHasFontResource
{
  // Roboto (Apache License v2.0)
  ROBOTO_THIN ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Roboto/Roboto-Thin.ttf"),
  ROBOTO_THIN_ITALIC ("Roboto",
                      EFontType.TTF,
                      EFontStyle.ITALIC,
                      EFontWeight.THIN,
                      "fonts/ttf/Roboto/Roboto-ThinItalic.ttf"),
  ROBOTO_LIGHT ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Roboto/Roboto-Light.ttf"),
  ROBOTO_LIGHT_ITALIC ("Roboto",
                       EFontType.TTF,
                       EFontStyle.ITALIC,
                       EFontWeight.LIGHT,
                       "fonts/ttf/Roboto/Roboto-LightItalic.ttf"),
  ROBOTO_NORMAL ("Roboto",
                 EFontType.TTF,
                 EFontStyle.REGULAR,
                 EFontWeight.REGULAR,
                 "fonts/ttf/Roboto/Roboto-Regular.ttf"),
  ROBOTO_NORMAL_ITALIC ("Roboto",
                        EFontType.TTF,
                        EFontStyle.ITALIC,
                        EFontWeight.REGULAR,
                        "fonts/ttf/Roboto/Roboto-Italic.ttf"),
  ROBOTO_MEDIUM ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Roboto/Roboto-Medium.ttf"),
  ROBOTO_MEDIUM_ITALIC ("Roboto",
                        EFontType.TTF,
                        EFontStyle.ITALIC,
                        EFontWeight.MEDIUM,
                        "fonts/ttf/Roboto/Roboto-MediumItalic.ttf"),
  ROBOTO_BOLD ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Roboto/Roboto-Bold.ttf"),
  ROBOTO_BOLD_ITALIC ("Roboto",
                      EFontType.TTF,
                      EFontStyle.ITALIC,
                      EFontWeight.BOLD,
                      "fonts/ttf/Roboto/Roboto-BoldItalic.ttf"),
  ROBOTO_BLACK ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Roboto/Roboto-Black.ttf"),
  ROBOTO_BLACK_ITALIC ("Roboto",
                       EFontType.TTF,
                       EFontStyle.ITALIC,
                       EFontWeight.BLACK,
                       "fonts/ttf/Roboto/Roboto-BlackItalic.ttf");

  private final FontResource m_aRes;

  private EFontResourceRoboto (@Nonnull @Nonempty final String sFontName,
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
