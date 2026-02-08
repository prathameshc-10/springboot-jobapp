# Spring Boot Job Application

A RESTful backend application built using Spring Boot for managing job postings.
This project focuses on clean architecture, REST APIs, and database integration.

---

## Features
- Create, update, and delete job postings
- Fetch all jobs and job details by ID
- RESTful API design
- Layered architecture (Controller, Service, Repository)
- Centralized exception handling

---

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

---

## Project Structure

```text
src/main/java
└── com.example.jobapp
├── controller
├── service
├── repository
└── model
```

---

## 📌 API Endpoints

| Method | Endpoint        | Description          |
|--------|-----------------|----------------------|
| GET    | /jobs           | Get all jobs         |
| GET    | /jobs/{id}      | Get job by ID        |
| POST   | /jobs           | Create a new job     |
| PUT    | /jobs/{id}      | Update job details   |
| DELETE | /jobs/{id}      | Delete a job         |

---

## ⚙️ How to Run Locally

1. Clone the repository
   ```bash
   git clone https://github.com/prathameshc-10/springboot-jobapp.git
2. Configure database in application.properties
3. Build the project
   ```bash
   mvn clean install
4. Run the application
   ```bash
   mvn spring-boot:run
5. The application will start at:
   ```bash
   http://localhost:8080

---
## Future Enhancements

1. JWT-based authentication
2. Pagination and filtering
3. Swagger/OpenAPI documentation
4. Role-based access control

---
## License

This project is licensed under the MIT License.

---
## Author

Prathamesh Chaudhari
Java Backend Developer | Spring Boot
   
