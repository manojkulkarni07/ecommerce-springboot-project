# E-Commerce Web Application

## Overview

This project is a responsive E-Commerce Web Application developed using Spring Boot, Thymeleaf, MySQL, and Bootstrap.

The application allows users to browse products, view product details, add items to a shopping cart, complete the checkout process, and manage orders.

---

## Features

### User Module

* User Registration
* User Login

### Product Module

* Product Listing
* Product Search
* Product Details Page
* Add Product

### Shopping Cart

* Add To Cart
* Remove From Cart
* Cart Total Calculation

### Order Management

* Checkout Process
* Order Placement
* Orders Dashboard

### UI Features

* Responsive Bootstrap Design
* Product Carousel Banner
* Modern Login & Registration Pages
* Mobile Friendly Layout

---

## Technology Stack

### Backend

* Java
* Spring Boot
* Spring Data JPA

### Frontend

* Thymeleaf
* HTML
* CSS
* Bootstrap 5

### Database

* MySQL

### Build Tool

* Maven

---

## Project Structure

src/main/java

* controller
* entity
* repository

src/main/resources

* templates
* static/images
* application.properties

---

## Setup Instructions

### 1. Clone Repository

git clone <repository-url>

### 2. Create Database

Create a MySQL database:

ecommerce_db

### 3. Configure Database

Update application.properties with your MySQL credentials.

Example:

spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_db

spring.datasource.username=root

spring.datasource.password=root

### 4. Run Application

Run:

EcommerceAppApplication.java

### 5. Open Browser

http://localhost:8080

---

## Database Tables

### users

* id
* name
* email
* password

### products

* id
* name
* description
* price
* imageUrl

### cart

* id
* productId
* productName
* price

### orders

* id
* customerName
* address
* phoneNumber
* paymentMethod
* productName
* price

---

## Screenshots

Add screenshots in the screenshots folder and reference them here.

Example:

Home Page

Product Details Page

Cart Page

Checkout Page

Orders Dashboard

Login Page

Register Page

---

## Future Enhancements

* Admin Dashboard
* Edit Product
* Delete Product
* Order Tracking
* Payment Gateway Integration
* Spring Security Authentication

---

## Developer

Manoj Kulkarni

E-Commerce Web Application Project
