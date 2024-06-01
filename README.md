# Hotel Booking Backend

Welcome to the Hotel Booking Backend! This backend application provides RESTful APIs for managing hotel data, including CRUD operations for hotels and retrieving lists of hotel names, room types, and board types.

## Technologies Used

- **Spring Boot**: Framework for building Java-based applications.
- **Spring Data JPA**: Simplifies data access for relational databases.
- **MySQL**: Database for storing hotel data.
- **JUnit 5**: Testing framework for unit and integration testing.
- **Maven**: Dependency management and build tool.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 11 or higher
- MySQL Server
- Maven

## Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/tharikthajudeen/hotel-booking-backend.git
   cd hotel-booking-backend
   ```

2. **Database Setup**:
   - Create a MySQL database named `hotel_booking`.
   - Create a MySQL user with username `springuser` and password `ThePassword`.
     ```sql
     CREATE DATABASE hotel_booking;
     CREATE USER 'springuser'@'localhost' IDENTIFIED BY 'ThePassword';
     GRANT ALL PRIVILEGES ON hotel_booking.* TO 'springuser'@'localhost';
     FLUSH PRIVILEGES;
     ```

3. **Update Configuration**:
   - Update the `application.properties` file in `src/main/resources` with your MySQL database connection details.

4. **Run the Application**:
   ```bash
   mvn spring-boot:run
   ```

5. **Access APIs**:
   Once the application is running, you can access the APIs using the base URL `http://localhost:8080/api`.

## API Endpoints

- **GET /api/hotels**: Retrieves a list of all hotels.
- **POST /api/hotels**: Saves a new hotel or updates an existing one.
- **GET /api/hotels/names**: Retrieves a list of all hotel names.
- **GET /api/hotels/room-types**: Retrieves a list of all room types.
- **GET /api/hotels/board-types**: Retrieves a list of all board types.


