/*
 * Copyright (C) 2024 Philip Helger (www.helger.com)
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
package com.helger.font.test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import org.apache.fontbox.ttf.OTFParser;
import org.apache.fontbox.ttf.TTFParser;
import org.apache.pdfbox.io.RandomAccessReadBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.helger.font.api.IFontResource;

/**
 * Font tester
 *
 * @author Philip Helger
 */
@Immutable
public final class FontTester
{
  private static final Logger LOGGER = LoggerFactory.getLogger (FontTester.class);

  private FontTester ()
  {}

  public static void testFontResourcePDFBoxCompatibility (@Nonnull final IFontResource aFontResource)
  {
    assertNotNull (aFontResource);

    Object aParsedFont = null;
    try
    {
      switch (aFontResource.getFontType ())
      {
        case TTF:
          LOGGER.info ("Reading TTF " + aFontResource.getFontName ());
          aParsedFont = new TTFParser ().parse (new RandomAccessReadBuffer (aFontResource.getInputStream ()));
          break;
        case OTF:
          LOGGER.info ("Reading OTF " + aFontResource.getFontName ());
          aParsedFont = new OTFParser ().parse (new RandomAccessReadBuffer (aFontResource.getInputStream ()));
          break;
        default:
          throw new IllegalArgumentException ("Cannot parse font resources of type " + aFontResource.getFontType ());
      }
    }
    catch (final IOException ex)
    {
      // Do we care? No
    }
    assertNotNull ("Cannot parse " + aFontResource, aParsedFont);
  }
}
