# 🔐 JWT Security with Spring Boot

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Java](https://img.shields.io/badge/Java-17+-blue.svg)](https://adoptopenjdk.net/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)
[![Build with Maven](https://img.shields.io/badge/Build-Maven-orange.svg)](https://maven.apache.org/)

A fully functional **JWT (JSON Web Token)** authentication and authorization system built with **Spring Boot**.  
It secures REST APIs with **role-based access control** and demonstrates best practices for **token generation, validation, and exception handling**.

---

## 🚀 Features

- 📝 **User Registration** (Sign up with email & password)
- 🔑 **JWT Authentication** (Login & token-based access)
- 🛡 **Role-Based Access Control** (`USER` & `ADMIN`)
- ⚠ **Global Exception Handling** for common scenarios
- 🌍 **CORS Support** for cross-origin requests
- 💾 **SQL Database** for persistent data storage
- 🔄 **ModelMapper** integration for DTO handling

---

## 🛠 Technologies

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **SQL Database** 
- **Lombok**
- **ModelMapper**
- **JWT (JSON Web Token)**

---

## 📦 Getting Started

### ✅ Prerequisites

- [Java 17+](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)

---

## ⚙️ Configuration
Before running the application, configure your database connection in src/main/resources/application.properties (or application.yml):

```bash
# Application Name
spring.application.name=happypet

# MySQL Database Configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/jwtTest?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=your_password_here

# JPA / Hibernate Settings
spring.jpa.show-sql=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.jpa.properties.hibernate.format_sql=true

# Multipart file upload limits
spring.servlet.multipart.max-file-size=20MB
spring.servlet.multipart.max-request-size=20MB

# Note:
- Replace your_password_here with your actual MySQL root password or preferred user credentials.
- Make sure your MySQL server is running and accessible on localhost:3306.
```

---

### 🔧 Installation & Setup

```bash
# 1️⃣ Clone the repository
git clone https://github.com/yourusername/JWT-Security-with-Spring-Boot.git
cd JWT-Security-with-Spring-Boot

# 2️⃣ Build the project
mvn clean install

# 3️⃣ Run the application
mvn spring-boot:run

```

---


## The application will start at :
- http://localhost:8080

---

## 🔄 Authentication Flow
<img width="3840" height="2285" alt="Mermaid Chart - Create complex, visual diagrams with text  A smarter way of creating diagrams -2025-08-09-195736" src="https://github.com/user-attachments/assets/86d54538-5c52-4348-b108-e2d4c6ce8338" />

---

## 📡 API Endpoints

| Endpoint                  | HTTP Method | Description               | Example Request Body                                      |
|---------------------------|-------------|---------------------------|----------------------------------------------------------|
| `/api/auth/register`       | POST        | Register a new user        | `{ "firstName": "John", "lastName": "Doe", "email": "john.doe@example.com", "password": "password" }` |
| `/api/auth/authenticate`   | POST        | Authenticate (login)      | `{ "email": "john.doe@example.com", "password": "password" }`               |
| `/api/auth/register-admin` | POST        | Register new admin (with `secretKey` query param) | `{ "firstName": "Admin", "lastName": "User", "email": "admin@example.com", "password": "adminPassword" }` |
| `/api/demo-controller`     | GET         | Secured demo endpoint      | *No request body*                                         |



---

```bash
Requires: Valid JWT token in Authorization header.
Example:
Authorization: Bearer <your_token>
```
---

## ⚠ Exception Handling
| Exception               | HTTP Status | Description                  |
| ----------------------- | ----------- | ---------------------------- |
| `NotFoundException`     | `404`       | Resource not found           |
| `UnauthorizedException` | `401`       | Invalid credentials or token |
| `DuplicateKeyException` | `409`       | Resource already exists      |

---

## 🧪 Testing
Run tests with:

```bash
mvn test
```
---

## 📜 License
- This project is licensed under the MIT License.
- © 2025 Vihanga Jayasuriya. All Rights Reserved.

---




