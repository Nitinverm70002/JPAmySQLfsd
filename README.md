# JPA & Hibernate with MySQL (Spring Boot)

This project demonstrates how to use Spring Boot with JPA (Hibernate) to configure database connectivity, model entity relationships, and execute advanced queries.

## Features

- Database connectivity using MySQL  
- Entity creation using JPA annotations  
- One-to-Many relationship (Category → Product)  
- Many-to-Many relationship (User ↔ Role)  
- JPQL queries for filtering data  
- Pagination and sorting using Pageable  
- Automatic table creation using Hibernate  

## Tech Stack

- Java  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- MySQL  
- Maven  

## Project Structure
<img width="304" height="726" alt="Screenshot 2026-04-13 at 8 07 16 PM" src="https://github.com/user-attachments/assets/8bdc24f5-f6c6-4040-b174-d6ea5afdac4a" />

## 🔗 Entity Relationships

### One-to-Many
- One Category → Many Products  

### Many-to-Many
- Many Users ↔ Many Roles  

## 🔍 JPQL Queries

### Find Products by Price Range
```java
@Query("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max")
List<Product> findByPriceRange(double min, double max);

Find Users by Role
@Query("SELECT u FROM User u JOIN u.roles r WHERE r.roleName = :role")
List<User> findUsersByRole(String role);

Pagination & Sorting
Pageable pageable = PageRequest.of(0, 5, Sort.by("price").descending());
productRepository.findAll(pageable);
```
## Configuration
Update your application.properties:
```SQL
spring.datasource.url=jdbc:mysql://localhost:3306/testdb
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Output
<img width="1440" height="720" alt="Screenshot 2026-04-13 at 8 07 33 PM" src="https://github.com/user-attachments/assets/1db0e7d7-cfdf-46a4-8fd8-876cd84e5acc" />
<img width="1440" height="900" alt="Screenshot 2026-04-13 at 8 06 55 PM" src="https://github.com/user-attachments/assets/45e8bbe1-3710-48ec-a16f-a3903090799d" />
<img width="218" height="811" alt="Screenshot 2026-04-13 at 8 08 24 PM" src="https://github.com/user-attachments/assets/71bb0b7c-40cc-43aa-b3bb-9f7d485c56fd" />
<img width="1440" height="900" alt="Screenshot 2026-04-13 at 8 08 30 PM" src="https://github.com/user-attachments/assets/85cacce9-bc53-4dcb-a33a-f77cf015b0fc" />


## Author
Nitin Verma

## Support
If you like this project, give it a ⭐ on GitHub!
