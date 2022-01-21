## camel3-archetype-spring-boot

Generate project

```
mvn archetype:generate \
-DarchetypeGroupId=org.apache.camel.archetypes \
-DarchetypeArtifactId=camel3-archetype-spring-boot \
-DarchetypeVersion=1.0.1-SNAPSHOT \
-DgroupId=org.apache.camel.archetypes.archetypeIT.camel-archetype-spring-boot \
-DartifactId=build-it \
-Dversion=0.0.1 \
-Dpackage=org.apache.camel.archetypes.archetypeIT \
-Dmaven-compiler-plugin-version=3.8.1 \
-Dspring-boot-version=2.6.2 \
-Dcamel-version=3.14.0 \
-Dopenshift-maven-plugin-group-id=org.eclipse.jkube \
-Dopenshift-maven-plugin-version=1.5.1 \
-B
```