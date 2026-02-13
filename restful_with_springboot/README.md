# Spring Boot RESTful Employee Service

## Overview

This project is a simple RESTful web service built using **Spring Boot**.
It demonstrates CRUD operations, validation, exception handling, and application monitoring using Actuator.

The application manages Employee records and exposes REST APIs to create, read, update, and delete employees.

---

## Features

* Welcome endpoint
* Employee CRUD operations
* RESTful API design
* Path variable support
* Request body validation
* Global exception handling
* Spring Boot Actuator monitoring
* In-memory storage (Map-based, no database)

---

## Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Validation
* Spring Actuator
* Maven

---

## Project Structure

```text
src/main/java/com/assignment/restful_with_springboot
 ├── controller
 │    ├── WelcomeController
 │    └── EmployeeController
 │
 ├── service
 │    └── EmployeeService
 │
 ├── model
 │    └── Employee
 │
 ├── exception
 │    ├── ResourceNotFoundException
 │    └── GlobalExceptionHandler
 │
 └── Application main class
```

---

## Setup Instructions

### 1. Clone project

```bash
git clone <repository-url>
```

### 2. Build project

```bash
mvn clean install
```

### 3. Run application

```bash
mvn spring-boot:run
```

Server starts at:

```text
http://localhost:8080
```

---

## API Endpoints

### Welcome API

### GET /

Returns welcome message.

Response:

```text
Welcome to spring boot
```

---

## Employee APIs

### Get all employees

```http
GET /employees
```

---

### Get employee by id

```http
GET /employees/{id}
```

---

### Create employee

```http
POST /employees
```

Request body:

```json
{
  "id": 1,
  "name": "Dhruv",
  "age": 22
}
```

---

### Update employee

```http
PUT /employees/{id}
```

Request body:

```json
{
  "name": "Dhruv Updated",
  "age": 23
}
```

---

### Delete employee

```http
DELETE /employees/{id}
```

---

## Validation Rules

* Name cannot be empty
* Age must be >= 18

Invalid input returns HTTP 400.

---

## Exception Handling

If employee is not found:

Response:

```json
{
  "error": "Employee not found"
}
```

Status Code: 404

---

## Actuator Endpoints

Enable in `application.properties`:

```properties
management.endpoints.web.exposure.include=*
management.endpoint.health.show-details=always
```

Available endpoints:

```text
/actuator/health
/actuator/beans
/actuator/mappings
/actuator/info
```

---

## Testing with cURL

Create employee:

```bash
curl -X POST http://localhost:8080/employees \
-H "Content-Type: application/json" \
-d '{"id":1,"name":"Dhruv","age":22}'
```

Get employees:

```bash
curl http://localhost:8080/employees
```

---

## Notes

* Uses in-memory storage only (data resets on restart)
* Suitable for learning and demonstration
* Can be extended with JPA + Database for persistence

---

## Author

Dhruv Baghel
