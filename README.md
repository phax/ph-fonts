#ph-fonts

A set of TTF/OTF OSS fonts to be used in PDF creation or any other use case.

Version 2.1.0 introduced a completely new layout so there is a common "ph-fonts-api" project and per font a sub-project so that the amount of loaded data can be kept quite small.

Version >= 3 require JDK 8.

#Usage with Maven
```xml
<dependency>
  <groupId>com.helger</groupId>
  <artifactId>ph-fonts-api</artifactId>
  <version>2.1.0</version>
</dependency>

<dependency>
  <groupId>com.helger</groupId>
  <!-- replace XXX with one of the list below --> 
  <artifactId>XXX</artifactId>
  <version>2.1.0</version>
</dependency>

...
```

Available artefacts including the fonts are:
  * ph-fonts-alegreya-sans
  * ph-fonts-anaheim
  * ph-fonts-exo2
  * ph-fonts-lato2
  * ph-fonts-open-sans
  * ph-fonts-roboto

To add a different font using ph-fonts-api just use one of the above mentioned projects.
Should be quite self explanatory :)

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodeingStyleguide.md) |
On Twitter: <a href="https://twitter.com/philiphelger">@philiphelger</a>
