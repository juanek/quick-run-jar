**quick-run-jar**

Generates simple executable jar files with dependencies.

- Logback 1.4.7
- Junit 5.9.1
- AssertJ 3.24.2
- Java Version 11


**Install archetype in local repo**

```sh
mvn clean install 
```

**Generate new project**

```sh
cd new-directory
```

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
