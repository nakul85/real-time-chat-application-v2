# Real-Time Chat Application

A real-time chat application built using Java, Spring Boot, WebSocket, JWT Authentication, and MySQL.

## Features

- User Registration and Login
- JWT-based Authentication
- Real-Time Messaging using WebSocket
- One-to-One Chat Functionality
- Message Persistence with MySQL
- Spring Security Integration
- REST APIs for Authentication

## Technologies Used

* Java
* Spring Boot
* Spring Security
* WebSocket (STOMP)
* JWT (JSON Web Tokens)
* MySQL
* Maven
* Lombok

## Project Structure

```
src/main/java/com/nakul/chatapp
├── config
├── controller
├── dto
├── entity
├── repository
├── security
└── service
```

## How to Run

1. Clone the repository.
2. Configure MySQL in `application.properties`.
3. Create a database named `chatapp`.
4. Run the application using IntelliJ IDEA or:

```
mvn spring-boot:run
```

5. Access the application on:

```
http://localhost:8080
```

## API Endpoints

### Register

```
POST /auth/register
```

### Login

```
POST /auth/login
```

### WebSocket Endpoint

```
/chat
```

## Future Enhancements

* Group Chats
* Online/Offline User Status
* Read Receipts
* Frontend Integration using React
* Docker Deployment

## Author

**Nakul Firodiya**
