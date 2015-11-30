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

import java.io.Serializable;

import javax.annotation.Nonnull;

import com.helger.commons.annotation.Nonempty;
import com.helger.commons.io.IHasInputStream;
import com.helger.commons.io.resource.IReadableResource;

/**
 * Base interface for a single font resource.
 *
 * @author Philip Helger
 */
public interface IFontResource extends IHasInputStream, Serializable
{
  /**
   * @return The overall font name.
   */
  @Nonnull
  @Nonempty
  String getFontName ();

  /**
   * @return The type of font (otf, ttf, ...)
   */
  @Nonnull
  EFontType getFontType ();

  /**
   * @return The font style (combination of regular, bold and italic)
   */
  @Nonnull
  IFontStyle getFontStyle ();

  /**
   * @return The overall font weight.
   */
  @Nonnull
  IFontWeight getFontWeight ();

  /**
   * @return The path to the font resource. May be classpath relative or an
   *         absolute path.
   */
  @Nonnull
  @Nonempty
  String getPath ();

  /**
   * @return The readable resource to read the specified font resource. Never
   *         <code>null</code>.
   */
  @Nonnull
  IReadableResource getResource ();
}
