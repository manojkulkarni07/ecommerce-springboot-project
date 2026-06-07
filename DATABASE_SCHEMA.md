# Database Schema

## Overview

The application uses MySQL as the database management system.

The following tables are used in the project.

---

## Users Table

Table Name: users

| Column Name | Data Type | Description    |
| ----------- | --------- | -------------- |
| id          | BIGINT    | Primary Key    |
| name        | VARCHAR   | User Full Name |
| email       | VARCHAR   | User Email     |
| password    | VARCHAR   | User Password  |

Purpose:
Stores registered user information.

---

## Products Table

Table Name: products

| Column Name | Data Type | Description         |
| ----------- | --------- | ------------------- |
| id          | BIGINT    | Primary Key         |
| name        | VARCHAR   | Product Name        |
| description | VARCHAR   | Product Description |
| price       | DOUBLE    | Product Price       |
| imageUrl    | VARCHAR   | Product Image URL   |

Purpose:
Stores product information displayed in the store.

---

## Cart Table

Table Name: cart

| Column Name | Data Type | Description   |
| ----------- | --------- | ------------- |
| id          | BIGINT    | Primary Key   |
| productId   | BIGINT    | Product ID    |
| productName | VARCHAR   | Product Name  |
| price       | DOUBLE    | Product Price |

Purpose:
Stores products added to the shopping cart.

---

## Orders Table

Table Name: orders

| Column Name   | Data Type | Description           |
| ------------- | --------- | --------------------- |
| id            | BIGINT    | Primary Key           |
| customerName  | VARCHAR   | Customer Name         |
| address       | VARCHAR   | Delivery Address      |
| phoneNumber   | VARCHAR   | Customer Phone Number |
| paymentMethod | VARCHAR   | Payment Method        |
| productName   | VARCHAR   | Ordered Product       |
| price         | DOUBLE    | Product Price         |

Purpose:
Stores order details after successful checkout.

---

## Relationships

* Users can browse products.
* Products can be added to the cart.
* Cart items can be converted into orders during checkout.
* Orders are stored for tracking and management.
