# ph-fonts

A set of TTF/OTF OSS fonts to be used in PDF creation or any other use case.
It wraps the TTF/OTF files in a Java resource and provides reasonable APIs.

# News and noteworthy

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

# Usage with Maven
```xml
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-fonts-api</artifactId>
  <version>4.0.1</version>
</dependency>

<dependency>
  <groupId>com.helger</groupId>
  <!-- replace XXX with one of the list below --> 
  <artifactId>XXX</artifactId>
  <version>4.0.1</version>
</dependency>
```

Available artefacts including the fonts are:
  * ph-fonts-alegreya-sans
  * ph-fonts-anaheim
  * ph-fonts-exo2
  * ph-fonts-lato2
  * ph-fonts-open-sans
  * ph-fonts-roboto
  * ph-fonts-source-sans-pro (since v4.0.1)

To add a different font using ph-fonts-api just use one of the above mentioned projects.
Should be quite self explanatory.

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
On Twitter: <a href="https://twitter.com/philiphelger">@philiphelger</a>
