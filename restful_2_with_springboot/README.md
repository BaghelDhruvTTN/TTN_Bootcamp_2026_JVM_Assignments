# RESTful User Management API – Spring Boot

This project demonstrates core and advanced REST concepts using Spring Boot 3. It implements Internationalization, Content Negotiation, Swagger documentation, Static & Dynamic Filtering, API Versioning (multiple strategies), and HATEOAS.

## Tech Stack

- Java 21
- Spring Boot 3.3.x
- Spring Web
- Spring HATEOAS
- SpringDoc OpenAPI (Swagger)
- Jackson (JSON & XML)
- Maven

## How to Run

From the `restful_2_with_springboot` directory:

```bash
mvn clean install
mvn spring-boot:run
```

Application runs at: **http://localhost:8080**

Swagger UI: **http://localhost:8080/swagger-ui/index.html**

---

## Implemented Features

### 1. Internationalization (i18n)

- Default language: English
- Supported languages: German, Swedish
- Language switching via query parameter:

```http
GET /hello?username=Dhruv
GET /hello?username=Dhruv&lang=de
GET /hello?username=Dhruv&lang=sv
```

Uses `SessionLocaleResolver` and `LocaleChangeInterceptor`.

### 2. Content Negotiation (JSON & XML)

Spring returns the response format based on the `Accept` header.

**Create user (XML supported):**

```http
POST /users
Content-Type: application/xml
Accept: application/xml
```

**Fetch user:**

```http
GET /users/1
```

### 3. Swagger / OpenAPI Documentation

- Controller grouping using `@Tag`
- Method documentation using `@Operation`
- Model documentation using `@Schema`
- Interactive API testing via Swagger UI

### 4. Static & Dynamic Filtering

**Static filtering:** Implemented using `@JsonIgnore` — sensitive fields (e.g. password) are excluded from responses.

**Dynamic filtering:**

```http
GET /users/dynamic
```

Uses `@JsonFilter` and `MappingJacksonValue` for runtime field selection.

### 5. API Versioning (4 strategies)

Two API versions:

- **Version 1** → Basic details
- **Version 2** → Enhanced details

| Strategy | Example |
|----------|--------|
| **URI** | `GET /versioning/v1/user`, `GET /versioning/v2/user` |
| **Request parameter** | `GET /versioning/user?version=1`, `GET /versioning/user?version=2` |
| **Custom header** | `GET /versioning/user` with `X-API-VERSION: 1` or `2` |
| **MIME type** | `GET /versioning/user` with `Accept: application/vnd.company.app-v1+json` or `application/vnd.company.app-v2+json` |

### 6. HATEOAS

Hypermedia support using Spring HATEOAS.

```http
GET /users/hateoas/1
```

Example response with navigational links:

```json
{
  "id": 1,
  "name": "abc",
  "email": "abc@test.com",
  "_links": {
    "all-topics": {
      "href": "http://localhost:8080/users/topics"
    }
  }
}
```

---

## Project structure

```text
restful_2_with_springboot/
├── src/main/java/com/assignment/restful_2_with_springboot/
│   ├── controller/    # UserController, UserVersioningController, GreetingController
│   ├── service/
│   ├── model/
│   ├── versioning/     # UserV1, UserV2
│   └── config/         # LocaleConfig, SwaggerConfig, JacksonConfig
```

## Concepts demonstrated

- RESTful API design
- Hypermedia-driven APIs (HATEOAS)
- API evolution & versioning strategies
- Secure data exposure (filtering)
- Internationalized applications
- OpenAPI documentation
