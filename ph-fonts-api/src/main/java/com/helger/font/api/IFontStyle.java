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
package com.helger.font.api;

import java.io.Serializable;

import com.helger.commons.id.IHasID;

/**
 * Base interface for a font style.
 *
 * @author Philip Helger
 */
public interface IFontStyle extends IHasID <String>, Serializable
{
  /**
   * @return <code>true</code> if it is regular, <code>false</code> if not (if
   *         it is bold or italic).
   */
  boolean isRegular ();

  /**
   * @return <code>true</code> if it is bold, <code>false</code> if not.
   */
  boolean isBold ();

  /**
   * @return <code>true</code> if it is italic, <code>false</code> if not.
   */
  boolean isItalic ();
}
