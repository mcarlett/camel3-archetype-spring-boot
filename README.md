## camel3-archetype-spring-boot

Generate project

if you want to use Camel for Spring Boot dependencies
```
mvn archetype:generate \
-DarchetypeGroupId=software.tnb \
-DarchetypeArtifactId=camel3-archetype-spring-boot \
-DarchetypeVersion=0.1.8-SNAPSHOT \
-DgroupId=test.group \
-DartifactId=build-it \
-Dversion=0.0.1 \
-Dpackage=org.apache.camel.archetypes.archetypeIT \
-Ddefault-spring-boot-version=2.7.8 \
-Ddefault-camel-spring-boot-version=3.20.1 \
-B
```

if you want to use Red Hat platform dependencies add the parameter `-Ddependencies-resolution=redhat-platform` in this case the parameter `default-spring-boot-version` will be used only for `spring-boot-maven-plugin:repackage` maven goal, the Spring Boot version is resolved from the platform BOM 

```
mvn archetype:generate \
-DarchetypeGroupId=software.tnb \
-DarchetypeArtifactId=camel3-archetype-spring-boot \
-DarchetypeVersion=0.1.8-SNAPSHOT \
-DgroupId=test.group \
-DartifactId=build-it \
-Dversion=0.0.1 \
-Dpackage=org.apache.camel.archetypes.archetypeIT \
-Ddefault-spring-boot-version=2.7.8 \
-Ddefault-camel-spring-boot-version=3.20.1.redhat-00023 \
-Ddependencies-resolution=redhat-platform \
-B
```

it is also possible to generate maven module with specific:

- `maven-surefire-plugin-version`
- `maven-compiler-plugin-version`
- `java-version` (default 11)
- `encoding` (default UTF-8)
