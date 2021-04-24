**quick-run-jar**

Generates simple executable jar files with dependencies.


- Logback 1.2.3
- Junit 4.13
- AssertJ
- Script startup.sh

Build and run.

mvn clean install 

sh startup.sh

Generates archetype from project.

mvn archetype:create-from-project

cd target/generated-sources/archetype/

mvn install


mvn -DarchetypeCatalog=local archetype:generate
