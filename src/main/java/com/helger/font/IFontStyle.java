package com.helger.font;

import com.helger.commons.id.IHasID;

/**
 * Base interface for a font style.
 * 
 * @author Philip Helger
 */
public interface IFontStyle extends IHasID <String>
{
  boolean isRegular ();

  boolean isBold ();

  boolean isItalic ();
}
