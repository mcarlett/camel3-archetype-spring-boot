## camel3-archetype-spring-boot

Generate project

```
mvn archetype:generate \
-DarchetypeGroupId=software.tnb \
-DarchetypeArtifactId=camel3-archetype-spring-boot \
-DarchetypeVersion=0.1.4 \
-DgroupId=test.group \
-DartifactId=build-it \
-Dversion=0.0.1 \
-Dpackage=org.apache.camel.archetypes.archetypeIT \
-Dmaven-compiler-plugin-version=3.8.1 \
-Dspring-boot-version=2.7.8 \
-Dcamel-version=3.20.1 \
-Dcamel-spring-boot-version=3.20.1.redhat-00023 \
-B
```
