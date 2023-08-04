# E-Commerce Backend Application
This is a Spring Boot application that simulates a basic e-commerce backend. The application provides endpoints for managing products, orders, and customers. Each product has attributes like name, price, and stock quantity.

https://drive.google.com/drive/folders/19Z70za5XVkqGQVjw6v2CUZcUdIA4ibwF?usp=sharing

## Prerequisites
Before running the application, make sure you have the following installed:

Java 11 or higher
Maven
MySQL Server
Docker (optional, for containerization)

### Installation
1. Clone the repository:
   git clone https://github.com/pravinbhagwat/E-commerce-Backend
   cd e-commerce-backend

2. Build the project using Maven:
   mvn clean install

3. Database Setup
   Create a MySQL database with the name **'ecommerce_db'**.
   Update the **application.properties** file in **src/main/resources** with your database credentials.

4. Running the Application
   You can run the application using Maven:
   mvn spring-boot:run

The application will start on http://localhost:8080.


### API Documentation

https://drive.google.com/drive/folders/19Z70za5XVkqGQVjw6v2CUZcUdIA4ibwF?usp=sharing

API documentation is available in Postman Collection format. Import this collection into Postman to explore the available endpoints and their usage.

### TIG Stack Integration
The application uses Telegraf to collect performance metrics. Make sure to set up the TIG stack (Telegraf, InfluxDB, and Grafana) as described in the TIG Integration section of this README.

### Tests
The project includes unit tests to ensure the correctness of the application. You can run the tests using Maven:
mvn test
