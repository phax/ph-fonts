/*
 * Copyright (C) 2014-2024 Philip Helger (www.helger.com)
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
package com.helger.font.source_sans3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.collection.impl.CommonsHashSet;
import com.helger.commons.collection.impl.ICommonsSet;
import com.helger.font.test.FontTester;

/**
 * Test class for class {@link EFontResourceSourceSans3}.
 *
 * @author Philip Helger
 */
public final class EFontResourceSourceSans3Test
{
  @Test
  public void testBasic ()
  {
    final ICommonsSet <String> aUniquePaths = new CommonsHashSet <> ();
    for (final EFontResourceSourceSans3 e : EFontResourceSourceSans3.values ())
    {
      assertTrue (e.name (), e.getFontResource ().getResource ().exists ());
      assertTrue (e.name (), aUniquePaths.add (e.getFontResource ().getResource ().getPath ()));

      FontTester.testFontResourcePDFBoxCompatibility (e.getFontResource ());
    }
  }
}
