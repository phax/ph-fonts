package com.helger.font.api;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for class {@link EFontWeight}.
 *
 * @author Philip Helger
 */
public final class EFontWeightTest
{
  @Test
  public void testBasic ()
  {
    for (final EFontWeight e : EFontWeight.values ())
    {
      assertTrue (e.getWeight () > 0);
      assertSame (e, EFontWeight.getFromWeightOrNull (e.getWeight ()));
    }
  }
}
