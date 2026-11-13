# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build

- Java 17 (from `com.helger:parent-pom`); CI also builds on 21 and 25.
- The font modules are huge (Noto Sans SC ~107 MB, HK/TC ~72 MB each, Kurinto 13-21 MB). Build only the
  modules touched: `mvn -pl <module> -am install`. Run a full root build only when asked.
- Never read or grep the binary font files under `src/main/resources/fonts/` or `src/test/resources/fonts/`.
- Releases are done manually by the maintainer - do not attempt a release or deploy.

## Structure

- `ph-fonts-api` (`com.helger.font.api`): `IFontResource`, `FontResource`, the `EFontType`/`EFontStyle`/`EFontWeight`
  enums and `FontResourceManager`, which collects all fonts via the `IFontResourceProviderSPI` ServiceLoader.
- `ph-fonts-test`: internal test helper; `FontTester` checks that PDFBox can parse each font (an upstream font once
  broke PDFBox, so this test matters).
- `ph-fonts-bom`: Bill of Materials for all artifacts. It uses `com.helger:parent-pom` directly, not the project root.
- One module per font family, all with the same layout:
  - `EFontResource<Name>` enum implementing `IHasFontResource`, one constant per file, with the classpath path
    `fonts/<ttf|otf>/<Dir>/<File>`
  - `FontResourceProviderSPI` (`@IsSPIImplementation`) plus
    `src/main/resources/META-INF/services/com.helger.font.api.IFontResourceProviderSPI`
  - `src/main/resources/LICENSE` and `NOTICE`, `docs/readme.txt` with the upstream source URL and version
  - tests `SPITest` and `EFontResource<Name>Test`

## Adding a new font module

Copy an existing module, rename the package and enum, update the services file, then register the module in all of:
root `<modules>`, root `<dependencyManagement>`, `ph-fonts-bom` `<dependencyManagement>`, and the README artefact
list (with "(since vX.Y.Z)").

## Conventions

- Every pom/java/sh file needs the Apache 2.0 licence header from `src/etc/license-template.txt` (checked by the
  license-maven-plugin during the build).
- Test sources are deliberately not attached (`attach-test-sources` is disabled in the root pom), because the Noto
  OTF originals in `src/test/resources` would bloat the Maven Central bundle. The shipped TTFs are produced from them
  with `otf2ttf-all.sh`.
- Release notes go into the `# News and noteworthy` section of `README.md` (there is no wiki).
