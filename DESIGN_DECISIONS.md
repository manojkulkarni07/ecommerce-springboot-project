# Design Decisions

## Project Objective

The goal of this project is to build a simple and responsive E-Commerce Web Application using Spring Boot and MySQL.

---

## Architecture

The project follows the MVC (Model-View-Controller) architecture.

### Model

Entities:

* User
* Product
* Cart
* Order

These entities represent database tables.

### View

The user interface is built using:

* HTML
* Thymeleaf
* Bootstrap 5

Bootstrap was chosen to provide responsive design and faster UI development.

### Controller

Controllers handle:

* Product Management
* User Registration/Login
* Cart Operations
* Checkout Process
* Order Management

---

## Database

MySQL is used as the relational database because:

* Easy integration with Spring Boot
* Reliable data storage
* Structured relational design

Spring Data JPA is used for ORM and database operations.

---

## UI Design Decisions

* Bootstrap 5 used for responsive layouts.
* Product carousel added on the home page.
* Modern login and registration pages created.
* Cart and orders pages designed using Bootstrap cards and tables.

---

## Search Functionality

A product search feature was implemented using Spring Data JPA query methods.

This allows users to search products by name.

---

## Future Enhancements

The following features can be added in future versions:

* Full Admin Dashboard
* Product Update and Delete
* Payment Gateway Integration
* Order Tracking
* Product Categories
* Spring Security Authentication
* Email Notifications

---

## Conclusion

The project demonstrates the implementation of a complete E-Commerce workflow including product browsing, shopping cart management, checkout, and order processing using Spring Boot and MySQL.
