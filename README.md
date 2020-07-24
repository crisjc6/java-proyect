## Maven built and java project with unit test in a one calculator with 6 operations

3. Nuevo proyecto en java

```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

```
1. build java program
> mvn package
2. Ejecutar jar de calculadora de operaciones
> java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App