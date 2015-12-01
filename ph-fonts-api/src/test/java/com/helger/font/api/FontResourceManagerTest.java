package com.helger.font.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Test class for class {@link FontResourceManager}.
 *
 * @author Philip Helger
 */
public final class FontResourceManagerTest
{
  @Test
  public void testEmpty ()
  {
    assertEquals (0, FontResourceManager.getRegisteredResourceCount ());
    assertNotNull (FontResourceManager.getAllResources ());
    assertTrue (FontResourceManager.getAllResources ().isEmpty ());
  }
}
