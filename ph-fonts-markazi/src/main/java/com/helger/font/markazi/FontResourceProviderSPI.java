/*
 * Copyright (C) 2014-2025 Philip Helger (www.helger.com)
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
package com.helger.font.markazi;

import javax.annotation.Nonnull;

import com.helger.commons.annotation.IsSPIImplementation;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.font.api.IFontResource;
import com.helger.font.api.IFontResourceProviderSPI;

/**
 * The implementation of {@link IFontResourceProviderSPI} for this project.
 *
 * @author Philip Helger
 */
@IsSPIImplementation
public final class FontResourceProviderSPI implements IFontResourceProviderSPI
{
  @Nonnull
  public Iterable <? extends IFontResource> getAllFontResources ()
  {
    return new CommonsArrayList <> (EFontResourceMarkazi.values (), EFontResourceMarkazi::getFontResource);
  }
}
