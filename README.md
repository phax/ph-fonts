# ph-fonts

A set of TTF/OTF OSS fonts to be used in PDF creation or any other use case.
It wraps the TTF/OTF files in a Java resource and provides reasonable APIs.

The original use case was the easy support of fonts for https://github.com/phax/ph-pdf-layout/

# Usage with Maven

Add the following to your pom.xml to use this project, replacing `x.y.z` with the real version number: 

```xml
<dependency>
  <groupId>com.helger.font</groupId>
  <artifactId>ph-fonts-api</artifactId>
  <version>x.y.z</version>
</dependency>

<dependency>
  <groupId>com.helger.font</groupId>
  <!-- replace XXX with one of the list below --> 
  <artifactId>XXX</artifactId>
  <version>x.y.z</version>
</dependency>
```

Note: prior to v4.1.0 the Maven groupId was `com.helger`.

Available artefacts including the fonts are:
  * ph-fonts-alegreya-sans
  * ph-fonts-anaheim
  * ph-fonts-exo2
  * ph-fonts-lato2
  * ph-fonts-kurinto-mono (since v5.0.2)
  * ph-fonts-kurinto-sans (since v5.0.2)
  * ph-fonts-markazi (since v4.1.1)
  * ph-fonts-noto-sans-hk (since v4.1.2)
  * ph-fonts-noto-sans-sc (since v4.1.2)
  * ph-fonts-open-sans
  * ph-fonts-roboto
  * ph-fonts-source-sans-pro (since v4.0.1)
  * ph-fonts-source-sans3 (since v5.0.2)

To add a different font using ph-fonts-api just use one of the above mentioned projects.
Should be quite self explanatory.

# News and noteworthy

* v5.0.3 - 2023-09-19
    * Reverted to the `Anaheim` TTF from v5.0.1 as the new TTF was not compatible with PDFBox
    * Added unit tests to make sure all contained TTFs/OTFs are processable by PDFBox to avoid such error in the future
    * Created the new internal test-only submodule `ph-fonts-test` for the specific tests 
* v5.0.2 - 2023-09-17
    * Added support for `Kurinto Sans` and `Kurinto Mono`. See [#3](https://github.com/phax/ph-fonts/issues/3) - thx @erdincay
    * Updated `Anaheim` TTFs
    * Updated `Open Sans` TTFs
    * Removed `Open Sans` Medium TTFs again
    * Added support for `Source Sans3` as the successor font of `Source Sans Pro`
* v5.0.1 - 2023-04-27
    * Updated `Alegreya Sans` TTFs. See [#2](https://github.com/phax/ph-fonts/issues/2) - thx @fheldt
    * Updated `Anaheim` TTFs
    * Updated `Exo2` TTFs
    * Updated `Markazi Text` TTFs
    * Updated `Noto Sans HK` TTFs
    * Updated `Noto Sans SC` TTFs
    * Updated `Open Sans` TTFs
    * Added `Open Sans` Medium TTFs
    * Updated `Roboto` TTFs
    * Updated `Roboto Condensed` TTFs
    * Updated `Source Sans Pro` TTFs
* v5.0.0 - 2022-09-13
    * Requires Java 11 as the minimum version
    * Updated to ph-commons 11
* v4.2.0 - 2021-03-21
    * Updated to ph-commons 10
* v4.1.2 - 2020-11-19
    * Added new fonts `Noto Sans SC` and `Noto Sans HK` for Chinese characters. see [ph-pdf-layout#19](https://github.com/phax/ph-pdf-layout/issues/19)
* v4.1.1 - 2020-06-15
    * Added new font `Markazi Text` for Arabic characters. See [issue #1](https://github.com/phax/ph-fonts/issues/1) - thx @Sasan-Yavari
* v4.1.0 - 2020-05-26
    * Changed the "groupId" of the Maven artefacts to `com.helger.font`
* v4.0.2 - 2020-03-28
    * Updated to ph-commons 9.4.0
* v4.0.1 - 2018-08-22
    * Really fixed OSGI ServiceProvider configuration
    * Fixed OSGI ServiceProvider configuration
    * Added new font `Source Sans Pro` in artefact `ph-fonts-source-sans-pro`
    * Updated `Roboto` TTFs
    * Updated `Open Sans` TTFs
    * Updated `Lato2` OTFs to v2.015
    * Updated `Exo2` to use TTF
    * Updated `Anaheim` TTFs
    * Updated `Alegreya Sans` TTFs
* v4.0.0 - 2017-11-05
    * Updated to ph-commons 9.0.0
* v3.1.1 - 2016-07-26
    * Updated to ph-commons 8.2.x
* v3.1.0 - 2016-06-29
    * Updated to ph-commons 8.1.x
* v3.0.0 - 2016-06-10
    * Requires JDK 8
* v2.1.0 - 2015-12-01
    * Introducing a completely new layout so there is a common "ph-fonts-api" project and per font a sub-project so that the amount of loaded data can be kept quite small.

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
It is appreciated if you star the GitHub project if you like it.