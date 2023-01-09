/*
 * Copyright (C) 2014-2023 Philip Helger (www.helger.com)
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

import javax.annotation.Nonnegative;
import javax.annotation.Nullable;

import com.helger.commons.lang.EnumHelper;

/**
 * Weight of a font. Default values.
 *
 * @author Philip Helger
 */
public enum EFontWeight implements IFontWeight
{
  HAIRLINE (90),
  THIN (100),
  EXTRA_LIGHT (200),
  LIGHT (300),
  REGULAR (400),
  MEDIUM (500),
  SEMI_BOLD (600),
  BOLD (700),
  EXTRA_BOLD (800),
  BLACK (900);

  private final int m_nWeight;

  EFontWeight (@Nonnegative final int nWeight)
  {
    m_nWeight = nWeight;
  }

  @Nonnegative
  public int getWeight ()
  {
    return m_nWeight;
  }

  @Nullable
  public static EFontWeight getFromWeightOrNull (@Nonnegative final int nWeight)
  {
    return getFromWeightOrDefault (nWeight, null);
  }

  @Nullable
  public static EFontWeight getFromWeightOrDefault (@Nonnegative final int nWeight, @Nullable final EFontWeight eDefault)
  {
    return EnumHelper.findFirst (EFontWeight.class, x -> x.getWeight () == nWeight, eDefault);
  }
}
