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
package com.helger.font.api;

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
  ALGREYA_SANS_THIN ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/AlegreyaSans/AlegreyaSans-Thin.ttf"),
  ALGREYA_SANS_THIN_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/AlegreyaSans/AlegreyaSans-ThinItalic.ttf"),
  ALGREYA_SANS_LIGHT ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/AlegreyaSans/AlegreyaSans-Light.ttf"),
  ALGREYA_SANS_LIGHT_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/AlegreyaSans/AlegreyaSans-LightItalic.ttf"),
  ALGREYA_SANS_NORMAL ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/AlegreyaSans/AlegreyaSans-Regular.ttf"),
  ALGREYA_SANS_NORMAL_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/AlegreyaSans/AlegreyaSans-Italic.ttf"),
  ALGREYA_SANS_MEDIUM ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/AlegreyaSans/AlegreyaSans-Medium.ttf"),
  ALGREYA_SANS_MEDIUM_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/AlegreyaSans/AlegreyaSans-MediumItalic.ttf"),
  ALGREYA_SANS_BOLD ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-Bold.ttf"),
  ALGREYA_SANS_BOLD_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-BoldItalic.ttf"),
  ALGREYA_SANS_EXTRA_BOLD ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-ExtraBold.ttf"),
  ALGREYA_SANS_EXTRA_BOLD_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/ttf/AlegreyaSans/AlegreyaSans-ExtraBoldItalic.ttf"),
  ALGREYA_SANS_BLACK ("Algrey Sans", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/AlegreyaSans/AlegreyaSans-Black.ttf"),
  ALGREYA_SANS_BLACK_ITALIC ("Algrey Sans", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/AlegreyaSans/AlegreyaSans-BlackItalic.ttf"),
  // Anaheim (SIL Open Font License, 1.1)
  ANAHEIM_REGULAR ("Anaheim", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Anaheim/Anaheim-Regular.ttf"),
  // Lato2 (SIL Open Font License 1.1)
  LATO2_HAIRLINE ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.HAIRLINE, "fonts/ttf/Lato2/Lato-Hairline.ttf"),
  LATO2_HAIRLINE_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.HAIRLINE, "fonts/ttf/Lato2/Lato-HairlineItalic.ttf"),
  LATO2_THIN ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Lato2/Lato-Thin.ttf"),
  LATO2_THIN_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/Lato2/Lato-ThinItalic.ttf"),
  LATO2_LIGHT ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Lato2/Lato-Light.ttf"),
  LATO2_LIGHT_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/Lato2/Lato-LightItalic.ttf"),
  LATO2_NORMAL ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Lato2/Lato-Regular.ttf"),
  LATO2_NORMAL_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/Lato2/Lato-Italic.ttf"),
  LATO2_MEDIUM ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Lato2/Lato-Medium.ttf"),
  LATO2_MEDIUM_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/Lato2/Lato-MediumItalic.ttf"),
  LATO2_SEMI_BOLD ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.SEMI_BOLD, "fonts/ttf/Lato2/Lato-Semibold.ttf"),
  LATO2_SEMI_BOLD_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.SEMI_BOLD, "fonts/ttf/Lato2/Lato-SemiboldItalic.ttf"),
  LATO2_BOLD ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Lato2/Lato-Bold.ttf"),
  LATO2_BOLD_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/Lato2/Lato-BoldItalic.ttf"),
  LATO2_HEAVY ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/ttf/Lato2/Lato-Heavy.ttf"),
  LATO2_HEAVY_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/ttf/Lato2/Lato-HeavyItalic.ttf"),
  LATO2_BLACK ("Lato2", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Lato2/Lato-Black.ttf"),
  LATO2_BLACK_ITALIC ("Lato2", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/Lato2/Lato-BlackItalic.ttf"),
  // Exo 2.0 (SIL Open Font License, 1.1)
  EXO2_THIN ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Exo2/Exo2.0-Thin.otf"),
  EXO2_THIN_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/Exo2/Exo2.0-ThinItalic.otf"),
  EXO2_EXTRA_LIGHT ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_LIGHT, "fonts/ttf/Exo2/Exo2.0-ExtraLight.otf"),
  EXO2_EXTRA_LIGHT_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_LIGHT, "fonts/ttf/Exo2/Exo2.0-ExtraLightItalic.otf"),
  EXO2_LIGHT ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Exo2/Exo2.0-Light.otf"),
  EXO2_LIGHT_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/Exo2/Exo2.0-LightItalic.otf"),
  EXO2_NORMAL ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Exo2/Exo2.0-Regular.otf"),
  EXO2_NORMAL_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/Exo2/Exo2.0-Italic.otf"),
  EXO2_MEDIUM ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Exo2/Exo2.0-Medium.otf"),
  EXO2_MEDIUM_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/Exo2/Exo2.0-MediumItalic.otf"),
  EXO2_SEMI_BOLD ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.SEMI_BOLD, "fonts/ttf/Exo2/Exo2.0-SemiBold.otf"),
  EXO2_SEMI_BOLD_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.SEMI_BOLD, "fonts/ttf/Exo2/Exo2.0-SemiBoldItalic.otf"),
  EXO2_BOLD ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Exo2/Exo2.0-Bold.otf"),
  EXO2_BOLD_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/Exo2/Exo2.0-BoldItalic.otf"),
  EXO2_EXTRA_BOLD ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.EXTRA_BOLD, "fonts/ttf/Exo2/Exo2.0-ExtraBold.otf"),
  EXO2_EXTRA_BOLD_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.EXTRA_BOLD, "fonts/ttf/Exo2/Exo2.0-ExtraBoldItalic.otf"),
  EXO2_BLACK ("Exo 2.0", EFontType.OTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Exo2/Exo2.0-Black.otf"),
  EXO2_BLACK_ITALIC ("Exo 2.0", EFontType.OTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/Exo2/Exo2.0-BlackItalic.otf"),
  // Roboto (Apache License v2.0)
  ROBOTO_THIN ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.THIN, "fonts/ttf/Roboto/Roboto-Thin.ttf"),
  ROBOTO_THIN_ITALIC ("Roboto", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.THIN, "fonts/ttf/Roboto/Roboto-ThinItalic.ttf"),
  ROBOTO_LIGHT ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.LIGHT, "fonts/ttf/Roboto/Roboto-Light.ttf"),
  ROBOTO_LIGHT_ITALIC ("Roboto", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.LIGHT, "fonts/ttf/Roboto/Roboto-LightItalic.ttf"),
  ROBOTO_NORMAL ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.REGULAR, "fonts/ttf/Roboto/Roboto-Regular.ttf"),
  ROBOTO_NORMAL_ITALIC ("Roboto", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.REGULAR, "fonts/ttf/Roboto/Roboto-Italic.ttf"),
  ROBOTO_MEDIUM ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.MEDIUM, "fonts/ttf/Roboto/Roboto-Medium.ttf"),
  ROBOTO_MEDIUM_ITALIC ("Roboto", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.MEDIUM, "fonts/ttf/Roboto/Roboto-MediumItalic.ttf"),
  ROBOTO_BOLD ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BOLD, "fonts/ttf/Roboto/Roboto-Bold.ttf"),
  ROBOTO_BOLD_ITALIC ("Roboto", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.BOLD, "fonts/ttf/Roboto/Roboto-BoldItalic.ttf"),
  ROBOTO_BLACK ("Roboto", EFontType.TTF, EFontStyle.REGULAR, EFontWeight.BLACK, "fonts/ttf/Roboto/Roboto-Black.ttf"),
  ROBOTO_BLACK_ITALIC ("Roboto", EFontType.TTF, EFontStyle.ITALIC, EFontWeight.BLACK, "fonts/ttf/Roboto/Roboto-BlackItalic.ttf");

  private final FontResource m_aRes;

  private EFontResource (@Nonnull @Nonempty final String sFontName,
                         @Nonnull final EFontType eFontType,
                         @Nonnull final IFontStyle aFontStyle,
                         @Nonnull final IFontWeight aFontWeight,
                         @Nonnull @Nonempty final String sPath)
  {
    m_aRes = new FontResource (sFontName, eFontType, aFontStyle, aFontWeight, sPath);
  }

  @Nonnull
  @Nonempty
  public String getFontName ()
  {
    return m_aRes.getFontName ();
  }

  @Nonnull
  public EFontType getFontType ()
  {
    return m_aRes.getFontType ();
  }

  @Nonnull
  public IFontStyle getFontStyle ()
  {
    return m_aRes.getFontStyle ();
  }

  @Nonnull
  public IFontWeight getFontWeight ()
  {
    return m_aRes.getFontWeight ();
  }

  @Nonnull
  @Nonempty
  public String getPath ()
  {
    return m_aRes.getPath ();
  }

  @Nonnull
  public ClassPathResource getResource ()
  {
    return m_aRes.getResource ();
  }

  @Nonnull
  public InputStream getInputStream ()
  {
    return m_aRes.getInputStream ();
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
