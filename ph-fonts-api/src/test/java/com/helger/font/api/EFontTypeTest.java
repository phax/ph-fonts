package com.helger.font.api;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.helger.commons.string.StringHelper;

/**
 * Test class for class {@link EFontType}.
 *
 * @author Philip Helger
 */
public final class EFontTypeTest
{
  @Test
  public void testBasic ()
  {
    for (final EFontType e : EFontType.values ())
    {
      assertTrue (StringHelper.hasText (e.getID ()));
      assertSame (e, EFontType.getFromIDOrNull (e.getID ()));
    }
  }
}
