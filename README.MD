# Spring Boot Bakery Application 🍰

## Overview
A simple Spring Boot application demonstrating the core concepts of Spring Framework, including Inversion of Control (IoC), Dependency Injection (DI), Spring Beans, and interface-based programming.

The application simulates a cake-baking process where a CakeBaker depends on Frosting and Syrup components.

## Project Structure

- **CakeBaker:** Main class responsible for baking a cake.
- **Frosting:** Interface defining the frosting type.
- **Syrup:** Interface defining the syrup type.
- **Chocolate:** Implementation of Frosting and Syrup.
- **Strawberry:** Alternative implementation of Frosting and Syrup.

## Concepts Implemented

- Inversion of Control (IoC)
- Dependency Injection using `@Autowired`
- Spring Beans using `@Component`
- Interface-based dependency design
- Conditional Bean Registration using `@ConditionalOnProperty`
- Spring ApplicationContext

## Technologies Used

- Java
- Spring Boot
- Spring Core
- Maven

## Configuration

The Chocolate implementation can be enabled using the following property:

```properties
bakeryapp.chocolate.enabled=true
```

## Sample Output

```text
Baking a delicious cake with Chocolate Frosting and Chocolate Syrup!
```

## How to Run

1. Clone this repository.
2. Open the project in your IDE.
3. Ensure Java and Maven are configured.
4. Run the Spring Boot application or the relevant test.
5. Check the console for the output.

## Learning Objective

This project was created to understand how Spring manages application objects, resolves dependencies, and injects implementations through its IoC container.

---

**Project:** Bakery Application  
**Category:** Spring Boot Mini Project