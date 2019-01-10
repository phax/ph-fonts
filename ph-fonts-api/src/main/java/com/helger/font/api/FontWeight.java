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
package com.helger.font.api;

import javax.annotation.Nonnegative;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.hashcode.HashCodeGenerator;
import com.helger.commons.string.ToStringGenerator;

/**
 * Weight of a font.
 *
 * @author Philip Helger
 */
public class FontWeight implements IFontWeight
{
  private final int m_nWeight;

  public FontWeight (@Nonnegative final int nWeight)
  {
    m_nWeight = ValueEnforcer.isGE0 (nWeight, "Weight");
  }

  @Nonnegative
  public int getWeight ()
  {
    return m_nWeight;
  }

  @Override
  public boolean equals (final Object o)
  {
    if (o == this)
      return true;
    if (o == null || !getClass ().equals (o.getClass ()))
      return false;
    final FontWeight rhs = (FontWeight) o;
    return m_nWeight == rhs.m_nWeight;
  }

  @Override
  public int hashCode ()
  {
    return new HashCodeGenerator (this).append (m_nWeight).getHashCode ();
  }

  @Override
  public String toString ()
  {
    return new ToStringGenerator (this).append ("Weight", m_nWeight).getToString ();
  }
}
