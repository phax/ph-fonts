package com.helger.font.api;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.string.StringHelper;

/**
 * Test class for class {@link EFontStyle}.
 *
 * @author Philip Helger
 */
public final class EFontStyleTest
{
  @Test
  public void testBasic ()
  {
    for (final EFontStyle e : EFontStyle.values ())
    {
      assertTrue (StringHelper.hasText (e.getID ()));
      assertSame (e, EFontStyle.getFromIDOrNull (e.getID ()));
    }
  }
}
