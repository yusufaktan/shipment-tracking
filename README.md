# Shipment Tracking Application

This project is a **shipment tracking application** developed using **Java Spring Boot**. It allows tracking shipments with basic CRUD operations (Create, Read, Update, Delete) and utilizes **PostgreSQL** as the database.

## Features
- **CRUD Operations**: Add, delete, update, and retrieve shipments.
- **Shipment Status Management**: Update the status of shipments.
- **Pending Shipments**: List shipments with pending status.
- **Global Exception Handling**: Custom exception handler for validation errors.
- **DTO Usage**: Data Transfer Objects (DTOs) used to manage data flow.

## Technologies Used
- **Java 17**
- **Spring Boot 3.3.4**
- **PostgreSQL**
- **Maven** (for dependency management)
- **Lombok** (to reduce boilerplate code)
- **Jakarta Validation** (for request validation)
- **UUID** (to generate unique tracking numbers)

## Database Configuration
The following `application.properties` file is used for database configuration:

```properties
spring.application.name=shipment-tracking
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.jpa.properties.hibernate.default_schema=shipment_tracking
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Maven Configuration
The `pom.xml` file defines the dependencies for the project:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
</dependencies>
```

## API Endpoints
Below are the available API endpoints and their descriptions:

- **GET** `/rest/api/shipment`  
  **Description**: Retrieves a list of all shipments.

- **GET** `/rest/api/shipment/{id}`  
  **Description**: Retrieves the shipment with the specified ID.

- **POST** `/rest/api/shipment`  
  **Description**: Adds a new shipment.  
  **Request Body**:  
  ```json
  {
    "senderName": "John Doe",
    "senderAddress": "123 Sender St, City",
    "receiverName": "Jane Smith",
    "receiverAddress": "456 Receiver Ave, City",
    "shipmentStatus": "PENDING"
  }
  ```

- **DELETE** `/rest/api/shipment/{id}`  
  **Description**: Deletes the shipment with the specified ID.

- **PUT** `/rest/api/shipment/{id}`  
  **Description**: Updates the shipment with the specified ID.  
  **Request Body**:  
  ```json
  {
    "senderName": "New Sender",
    "senderAddress": "789 New Address, City",
    "receiverName": "New Receiver",
    "receiverAddress": "321 New Ave, City",
    "shipmentStatus": "IN_TRANSIT"
  }
  ```

- **GET** `/rest/api/shipment/pendingShipments`  
  **Description**: Retrieves a list of shipments with a pending status.

- **POST** `/rest/api/shipment/statusUpdate/{id}?status={newStatus}`  
  **Description**: Updates the status of a shipment.  
  **Example**:  
  `/rest/api/shipment/statusUpdate/123e4567-e89b-12d3-a456-426614174000?status=DELIVERED`
```
