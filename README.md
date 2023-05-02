# food-ordering-system
README for Microservices Project with SAGA, Outbox, DDD, and Hexagonal Patterns
This is a microservices project that consists of three main services: Order, Restaurant, and Customer, and Payment. The project is implemented using the SAGA, Outbox, DDD, and Hexagonal Patterns.

Table of Contents
Introduction
Architecture
Technologies Used
Usage
Testing
Deployment
Conclusion
Introduction

This project is aimed at providing a scalable and resilient solution for managing orders, customers, and restaurants. 
The project is implemented as a set of microservices, each of which is responsible for a specific aspect of the overall functionality.

The project is designed to be highly available and fault-tolerant. It utilizes the SAGA pattern to manage distributed transactions across multiple microservices, the Outbox pattern to handle message publication in a transactional manner, and DDD and Hexagonal Patterns to provide a modular, testable, and maintainable architecture.

Architecture
The project is designed using a microservices architecture pattern. Each microservice is built using a hexagonal architecture,
which consists of an application layer, a domain layer, and an infrastructure layer.

The application layer contains the business logic and orchestrates interactions between the domain and infrastructure layers.
The domain layer contains the core business logic and entities.
The infrastructure layer contains implementation details such as data access and external service integrations.

The project also utilizes the SAGA pattern to manage distributed transactions across multiple microservices. 
This pattern ensures that all microservices involved in a transaction either succeed or fail together.

The Outbox pattern is also used to handle message publication in a transactional manner.
This pattern ensures that messages are only published after a transaction is successfully committed.

Technologies Used
The project uses the following technologies:

Java 17
Spring Boot
Spring Data JPA
Spring Cloud Stream
Kafka
Mockito
Lombok
Maven

Usage
The project provides REST APIs for managing orders, customers, and restaurants.
The APIs can be accessed using a tool like Postman.

Conclusion
This project demonstrates how to build scalable, resilient, and maintainable microservices using the SAGA, Outbox, DDD,
and Hexagonal Patterns. By utilizing these patterns, the project is able to provide a highly available and fault-tolerant solution for managing
orders, restaurants, customers, and payments.

The project consists of four main microservices: order, restaurant, payment and customer. 
The order service handles the creation and management of orders,
while the restaurant service manages the restaurant inventory and menu. 
The customer service handles the customer information and preferences.

The payment service is responsible for processing payments for the orders placed by customers. 
It communicates with the other three services to obtain the necessary information to complete the payment process.

To ensure the reliability and consistency of the data across the system, the project uses the SAGA pattern. 
This pattern ensures that all the services are coordinated in a transactional manner, guaranteeing the consistency of the data.

The project also utilizes the Outbox pattern to prevent data inconsistencies and ensure reliable data delivery. 
This pattern involves storing the data that needs to be processed in an Outbox table,
which is then picked up by a separate service and processed asynchronously.

The project follows the Domain-Driven Design (DDD) pattern to ensure that the system is modular and flexible.
This pattern separates the domain logic from the infrastructure and application layers, enabling the system to be more resilient to changes.

Finally, the project follows the Hexagonal Architecture pattern to provide a clear separation between the business logic and the infrastructure layer.
This pattern enables the system to be more maintainable and testable.

Overall, this project demonstrates how these patterns can be combined to create a scalable, resilient, and maintainable microservices architecture.
