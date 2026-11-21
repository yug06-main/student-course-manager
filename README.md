# Student Course Management System

A backend REST API for managing students, courses, and enrollments, built with Spring Boot.

**Status:** In progress

## Tech Stack
* **Language:** Java 21
* **Framework:** Spring Boot, Spring Data JPA (Hibernate)
* **Database:** MySQL
* **Build Tool:** Maven

## Features
- [x] MySQL connection with JPA
- [x] Student entity and repository
- [x] Student CRUD endpoints
- [ ] Courses and enrollments
- [ ] Validation and global error handling
- [ ] Soft delete
- [ ] Audit logging
- [ ] Swagger API docs
- [ ] Tests

## Run Locally
1. Install Java 21, Maven, and MySQL.
2. Create a database: `CREATE DATABASE student_db;`
3. Set your MySQL username and password in `src/main/resources/application.properties`.
4. Run the application: `mvn spring-boot:run`
5. The API starts at `http://localhost:8080`.
