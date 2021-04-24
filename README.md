**quick-run-jar**

Generates simple executable jar files with dependencies.

- Logback 1.2.3
- Junit 4.13
- AssertJ


**Install archetype in local repo**

```sh
mvn clean install 
```

**Generate new project**

```sh
mvn -DarchetypeCatalog=local archetype:generate
```

**Package and run**

```sh
mvn package
```

```sh
java -jar target/my-quick-app.jar
```
