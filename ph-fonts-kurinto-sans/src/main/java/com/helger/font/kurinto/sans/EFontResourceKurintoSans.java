/*
 * Copyright (C) 2014-2025 Philip Helger (www.helger.com)
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
package com.helger.font.kurinto.sans;

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
public enum EFontResourceKurintoSans implements IHasFontResource
{
  KURINTO_SANS_BOLD ("Kurinto Sans",
                     EFontType.TTF,
                     EFontStyle.BOLD,
                     EFontWeight.REGULAR,
                     "fonts/ttf/Kurinto/KurintoSans-Bd.ttf"),
  KURINTO_SANS_BOLD_ITALIC ("Kurinto Sans",
                            EFontType.TTF,
                            EFontStyle.BOLD_ITALIC,
                            EFontWeight.REGULAR,
                            "fonts/ttf/Kurinto/KurintoSans-BdIt.ttf"),
  KURINTO_SANS_ITALIC ("Kurinto Sans",
                       EFontType.TTF,
                       EFontStyle.ITALIC,
                       EFontWeight.REGULAR,
                       "fonts/ttf/Kurinto/KurintoSans-It.ttf"),
  KURINTO_SANS_REGULAR ("Kurinto Sans",
                        EFontType.TTF,
                        EFontStyle.REGULAR,
                        EFontWeight.REGULAR,
                        "fonts/ttf/Kurinto/KurintoSans-Rg.ttf");

  private final FontResource m_aRes;

  EFontResourceKurintoSans (@Nonnull @Nonempty final String sFontName,
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
