# Spring Boot Assignment

A minimal Spring Boot application demonstrating core concepts of configuration, database integration, monitoring, and developer productivity tools.

This project intentionally avoids JPA to understand database fundamentals using plain SQL and H2.

---

## Objectives

### Q1 – H2 Database Setup

- Configure H2 database
- Enable H2 console
- Verify connection

### Q2 – Read Properties

- Define custom properties in `application.properties`
- Read values inside the application using Spring `Environment`

### Q3 – Employee Table & Sample Data

- Create table using `schema.sql`
- Insert records using `data.sql`
- Verify data via H2 console

### Q4 – Actuator

- Enable actuator endpoints
- Monitor application health and metrics

### Q5 – DevTools

- Enable automatic restart on code changes

---

## Tech Stack

- Java 25
- Spring Boot
- Spring Web
- H2 Database
- Spring Actuator
- Spring DevTools

---

## Dependencies Used

```xml
spring-boot-starter-web
spring-boot-starter-actuator
spring-boot-devtools (optional)
h2
Run Application
mvn spring-boot:run
App starts at:

http://localhost:8080

Database Configuration

application.properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
SQL Initialization
Spring automatically executes:

schema.sql
Creates tables

data.sql
Inserts sample records

H2 Console
Open:

http://localhost:8080/h2-console
Login:

JDBC URL : jdbc:h2:mem:testdb
User     : sa
Password : (empty)
Run:

SELECT * FROM employee;

Reading Properties Example
@Autowired
Environment env;

String name = env.getProperty("app.name");
Actuator Endpoints
Base URL:

/actuator
Examples:

/actuator/health
/actuator/metrics
/actuator/beans
/actuator/env
/actuator/mappings
DevTools
Automatically restarts application when files change.

Workflow:

Edit → Save → Restart happens automatically
Project Structure
src/main/java
src/main/resources
  ├─ application.properties
  ├─ schema.sql
  └─ data.sql

Outcome
This project demonstrates:

Spring Boot configuration

H2 integration

SQL-based schema management

Property injection

Actuator monitoring

Faster development with DevTools

Author

Dhruv

---
