# CategoryProductAPI

## Overview
The CategoryProductAPI is a Spring Boot-based project that manages categories and products with a one-to-many relationship. 
This API provides CRUD operations for managing both categories and products, and includes server-side pagination for efficient data retrieval.

## Features
- *RESTful API:* Supports CRUD operations for categories and products.
- *One-to-Many Relationship:* Products are linked to categories.
- *Pagination:* Efficiently fetch paginated product data.
- *MySQL Database:* Uses JPA & Hibernate for database

## Technologies Used
- *Spring Boot*
- *Spring Data JPA*
- *Hibernate*
- *MySQL*
- *RESTful API*
- *Spring Tool Suite IDE*

## Postman Usage

To test the API endpoints, you can use [Postman](https://www.postman.com/).

1.**Run API Requests:**
- Open Postman and create a new request.
- Set the request type (e.g., GET, POST, PUT, DELETE) based on the API endpoint.
- Use http://localhost:8080 as the base URL since the project runs locally.
- Example Endpoints:
- **GET** all categories:`GET http://localhost:8080/api/categories`
- **POST** create a new product: `POST http://localhost:8080/api/products`
- In the Body tab, select raw and JSON, then provide the product details in JSON format.

2.**Check Responses:**
- After hitting the Send button in Postman, you should see the API's response in the lower part of the window.
- This will help you verify that the API is working correctly.
