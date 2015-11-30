package com.helger.font.lato2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.helger.font.api.IFontResource;
import com.helger.font.api.IFontResourceProviderSPI;

/**
 * The implementation of {@link IFontResourceProviderSPI} for this project.
 *
 * @author Philip Helger
 */
public final class FontResourceProviderSPI implements IFontResourceProviderSPI
{
  @Nonnull
  public Iterable <? extends IFontResource> getAllFontResources ()
  {
    final List <IFontResource> ret = new ArrayList <IFontResource> ();
    for (final EFontResource e : EFontResource.values ())
      ret.add (e.getFontResource ());
    return ret;
  }
}
