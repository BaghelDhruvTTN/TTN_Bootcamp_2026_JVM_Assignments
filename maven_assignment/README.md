# Maven Assignment

This repository contains the solution for the Maven session assignment.
It demonstrates core Maven concepts using both a single-module setup and a multi-module project.

---

## Project Structure

```
maven_assignment
└── multimodule
    └── multimodule-parent
        ├── module-a
        ├── module-b
        └── pom.xml
```

---

## Question 1: Project Submission Requirements

- Complete Maven project is submitted
- Generated directories such as `target/` and IDE files like `.idea/` are excluded using `.gitignore`
- This README file documents the assignment
- Relevant references are provided at the end

---

## Question 2: Add a Maven Dependency and Repository

Maven dependencies are added in `pom.xml` using Maven Central repository.

Example dependency:
- `org.apache.commons:commons-lang3`

The dependency is successfully resolved and used in the project.

---

## Question 3: Add a New Repository and Use Its Dependencies

An additional repository (JitPack) is configured in `pom.xml`.
Dependencies are resolved using the defined repositories.

---

## Question 4: Create an Executable JAR Using Maven JAR Plugin

The Maven JAR Plugin is configured to create an executable JAR.

Build command:
```bash
mvn clean package
```

Run command:
```bash
java -jar target/maven_assignment-1.0-SNAPSHOT.jar
```

Output:
```
Hello World
```

---

## Question 5: Dependency Scopes

Different Maven dependency scopes are demonstrated in `pom.xml`:

- **compile** – commons-lang3  
- **runtime** – mysql-connector-j  
- **test** – junit-jupiter  
- **provided** – jakarta.servlet-api  

---

## Question 6: Multi-Module Maven Project

A multi-module Maven project is created under the `multimodule` directory.

- `multimodule-parent` acts as the parent POM
- `module-a` and `module-b` are child modules

To build all modules from the parent directory:
```bash
mvn clean package
```

This command generates JAR files for both modules.

---

## References

- Maven Official Documentation: https://maven.apache.org/guides/index.html
- JitPack Repository: https://jitpack.io
