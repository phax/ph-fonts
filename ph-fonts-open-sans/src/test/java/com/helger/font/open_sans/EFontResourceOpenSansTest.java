/**
 * Copyright (C) 2014-2016 Philip Helger (www.helger.com)
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
package com.helger.font.open_sans;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.collection.ext.CommonsHashSet;
import com.helger.commons.collection.ext.ICommonsSet;

/**
 * Test class for class {@link EFontResourceOpenSans}.
 *
 * @author Philip Helger
 */
public final class EFontResourceOpenSansTest
{
  @Test
  public void testBasic ()
  {
    final ICommonsSet <String> aUniquePaths = new CommonsHashSet<> ();
    for (final EFontResourceOpenSans e : EFontResourceOpenSans.values ())
    {
      assertTrue (e.name (), e.getFontResource ().getResource ().exists ());
      assertTrue (e.name (), aUniquePaths.add (e.getFontResource ().getResource ().getPath ()));
    }
  }
}
