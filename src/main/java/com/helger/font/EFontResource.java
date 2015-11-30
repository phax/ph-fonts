/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
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
package com.helger.font;

import java.io.InputStream;
import java.util.EnumSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.annotation.Nonempty;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.io.resource.ClassPathResource;

/**
 * Defines the available font resources available in this library.
 *
 * @author Philip Helger
 */
public enum EFontResource implements IFontResource
{
  // Algrey Sans (SIL Open Font License, 1.1)
  ALGREYA_SANS_THIN (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/AlegreyaSans/AlegreyaSans-Thin.ttf"),
  ALGREYA_SANS_THIN_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/AlegreyaSans/AlegreyaSans-ThinItalic.ttf"),
  ALGREYA_SANS_LIGHT (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/AlegreyaSans/AlegreyaSans-Light.ttf"),
  ALGREYA_SANS_LIGHT_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/AlegreyaSans/AlegreyaSans-LightItalic.ttf"),
  ALGREYA_SANS_NORMAL (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/AlegreyaSans/AlegreyaSans-Regular.ttf"),
  ALGREYA_SANS_NORMAL_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/AlegreyaSans/AlegreyaSans-Italic.ttf"),
  ALGREYA_SANS_MEDIUM (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/AlegreyaSans/AlegreyaSans-Medium.ttf"),
  ALGREYA_SANS_MEDIUM_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/AlegreyaSans/AlegreyaSans-MediumItalic.ttf"),
  ALGREYA_SANS_BOLD (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-Bold.ttf"),
  ALGREYA_SANS_BOLD_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-BoldItalic.ttf"),
  ALGREYA_SANS_EXTRA_BOLD (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-ExtraBold.ttf"),
  ALGREYA_SANS_EXTRA_BOLD_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-ExtraBoldItalic.ttf"),
  ALGREYA_SANS_BLACK (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/AlegreyaSans/AlegreyaSans-Black.ttf"),
  ALGREYA_SANS_BLACK_ITALIC (EFontType.TTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/AlegreyaSans/AlegreyaSans-BlackItalic.ttf"),
  // Anaheim Regular (SIL Open Font License, 1.1)
  ANAHEIM_REGULAR (EFontType.TTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Anaheim/Anaheim-Regular.ttf"),
  // Lato2 (SIL Open Font License 1.1)
  LATO2_HAIRLINE (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.HAIRLINE, "fonts/ttf/Lato2/Lato-Hairline.ttf"),
  LATO2_HAIRLINE_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.HAIRLINE, "fonts/ttf/Lato2/Lato-HairlineItalic.ttf"),
  LATO2_THIN (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Lato2/Lato-Thin.ttf"),
  LATO2_THIN_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/Lato2/Lato-ThinItalic.ttf"),
  LATO2_LIGHT (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Lato2/Lato-Light.ttf"),
  LATO2_LIGHT_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/Lato2/Lato-LightItalic.ttf"),
  LATO2_NORMAL (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Lato2/Lato-Regular.ttf"),
  LATO2_NORMAL_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/Lato2/Lato-Italic.ttf"),
  LATO2_MEDIUM (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Lato2/Lato-Medium.ttf"),
  LATO2_MEDIUM_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/Lato2/Lato-MediumItalic.ttf"),
  LATO2_SEMI_BOLD (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.SEMI_BOLD, "fonts/ttf/Lato2/Lato-Semibold.ttf"),
  LATO2_SEMI_BOLD_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.SEMI_BOLD, "fonts/ttf/Lato2/Lato-SemiboldItalic.ttf"),
  LATO2_BOLD (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Lato2/Lato-Bold.ttf"),
  LATO2_BOLD_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/Lato2/Lato-BoldItalic.ttf"),
  LATO2_HEAVY (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/ttf/Lato2/Lato-Heavy.ttf"),
  LATO2_HEAVY_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/ttf/Lato2/Lato-HeavyItalic.ttf"),
  LATO2_BLACK (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Lato2/Lato-Black.ttf"),
  LATO2_BLACK_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/Lato2/Lato-BlackItalic.ttf"),
  // Exo 2.0 (SIL Open Font License, 1.1)
  EXO2_THIN (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Exo2/Exo2.0-Thin.otf"),
  EXO2_THIN_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/Exo2/Exo2.0-ThinItalic.otf"),
  EXO2_EXTRA_LIGHT (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_LIGHT, "fonts/ttf/Exo2/Exo2.0-ExtraLight.otf"),
  EXO2_EXTRA_LIGHT_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_LIGHT, "fonts/ttf/Exo2/Exo2.0-ExtraLightItalic.otf"),
  EXO2_LIGHT (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Exo2/Exo2.0-Light.otf"),
  EXO2_LIGHT_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/Exo2/Exo2.0-LightItalic.otf"),
  EXO2_NORMAL (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Exo2/Exo2.0-Regular.otf"),
  EXO2_NORMAL_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/Exo2/Exo2.0-Italic.otf"),
  EXO2_MEDIUM (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Exo2/Exo2.0-Medium.otf"),
  EXO2_MEDIUM_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/Exo2/Exo2.0-MediumItalic.otf"),
  EXO2_SEMI_BOLD (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.SEMI_BOLD, "fonts/ttf/Exo2/Exo2.0-SemiBold.otf"),
  EXO2_SEMI_BOLD_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.SEMI_BOLD, "fonts/ttf/Exo2/Exo2.0-SemiBoldItalic.otf"),
  EXO2_BOLD (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Exo2/Exo2.0-Bold.otf"),
  EXO2_BOLD_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/Exo2/Exo2.0-BoldItalic.otf"),
  EXO2_EXTRA_BOLD (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/ttf/Exo2/Exo2.0-ExtraBold.otf"),
  EXO2_EXTRA_BOLD_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/ttf/Exo2/Exo2.0-ExtraBoldItalic.otf"),
  EXO2_BLACK (EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Exo2/Exo2.0-Black.otf"),
  EXO2_BLACK_ITALIC (EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/Exo2/Exo2.0-BlackItalic.otf");

  private final EFontType m_eFontType;
  private final IFontStyle m_eFontStyle;
  private final IFontWeight m_eWeight;
  private final String m_sPath;

  private EFontResource (@Nonnull final EFontType eFontType,
                         @Nonnull final IFontStyle eFontStyle,
                         @Nonnull final IFontWeight eWeight,
                         @Nonnull @Nonempty final String sPath)
  {
    m_eFontType = eFontType;
    m_eFontStyle = eFontStyle;
    m_eWeight = eWeight;
    m_sPath = sPath;
  }

  @Nonnull
  public EFontType getFontType ()
  {
    return m_eFontType;
  }

  @Nonnull
  public IFontStyle getFontStyle ()
  {
    return m_eFontStyle;
  }

  @Nonnull
  public IFontWeight getFontWeight ()
  {
    return m_eWeight;
  }

  @Nonnull
  @Nonempty
  public String getPath ()
  {
    return m_sPath;
  }

  @Nonnull
  public ClassPathResource getResource ()
  {
    return new ClassPathResource (m_sPath);
  }

  @Nonnull
  public InputStream getInputStream ()
  {
    return ClassPathResource.getInputStream (m_sPath);
  }

  @Nonnull
  @ReturnsMutableCopy
  public static Set <EFontResource> getAllResourcesOfFontType (@Nullable final EFontType eFontType)
  {
    final Set <EFontResource> ret = EnumSet.noneOf (EFontResource.class);
    for (final EFontResource e : values ())
      if (e.getFontType ().equals (eFontType))
        ret.add (e);
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static Set <EFontResource> getAllResourcesOfFontWeight (@Nullable final IFontWeight eFontWeight)
  {
    final Set <EFontResource> ret = EnumSet.noneOf (EFontResource.class);
    for (final EFontResource e : values ())
      if (e.getFontWeight ().equals (eFontWeight))
        ret.add (e);
    return ret;
  }
}
