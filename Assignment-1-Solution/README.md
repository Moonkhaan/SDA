Here’s the updated version of the `README.md` to include the video from the GitHub repository:

---

# Online Book Store Application - SDA Assignment 1 Solution

## Overview

This repository contains the solution for the Software Design and Architecture (SDA) Assignment 1. The project models an online bookstore, where a customer can browse books, add them to a shopping cart, and complete the checkout process using a payment gateway. The core components of the system include the customer interface, book management, shopping cart, and payment gateway.

The project is implemented in Java and follows key software design principles and patterns to ensure scalability, maintainability, and clear separation of concerns.

## Project Structure

The project is organized as follows:

```
D:\UNIVERSITY WORK\FIFTH SEMESTER\SDA\ASSIGNMENT-1-SOLUTION
└───code-imp
    ├───DAL
    ├───gui
    └───model
```

### Description of Directories:
- **DAL (Data Access Layer)**: This directory contains classes for data management. Currently, it's not being utilized in the code provided but could be used to store book data in a database.
- **gui (Graphical User Interface)**: This would typically contain UI-related components (not explicitly implemented in the given code).
- **model**: Contains the core business logic, including classes like `Customer`, `Order`, `ShoppingCart`, `PaymentGatewayModel`, and `BookGui`.

## Design Patterns and Principles Used

### 1. **MVC (Model-View-Controller)**
   - **Model**: The `Customer`, `Order`, `ShoppingCart`, `PaymentGatewayModel`, and `BookGui` classes represent the model, encapsulating the business logic.
   - **View**: Though the system lacks a graphical user interface (GUI), the `System.out.println` outputs simulate the view layer by displaying available books, cart updates, and order confirmations.
   - **Controller**: The `Main` class acts as the controller, coordinating interactions between the customer and other components.

### 2. **Singleton Pattern** (Implicit in `PaymentGatewayModel`)
   - The `PaymentGatewayModel` is a static object in the current scenario, and while not a strict singleton pattern, it exhibits some characteristics of a singleton by providing a single instance throughout the application's lifecycle to handle payment processing. This could be refactored into a proper singleton for stricter implementation.

### 3. **Strategy Pattern** (Implicit with PaymentGatewayModel)
   - The payment gateway logic is abstracted in the `PaymentGatewayModel`. In a more advanced version, different payment strategies (e.g., credit card, PayPal, etc.) could be added, and the customer could select which payment method to use. Currently, the payment process is fixed and simplified.

### 4. **Factory Method** (Not explicitly used but can be added)
   - A factory could be used to create instances of books (`BookGui`) or payment processors dynamically based on certain conditions (e.g., payment methods).

### 5. **Observer Pattern** (Not explicitly used but can be added)
   - A notification system could be added where the system (or customer) is notified of various actions, such as book availability, order confirmation, or payment status.

### 6. **Encapsulation**
   - The code uses encapsulation extensively. For example, `ShoppingCart` keeps the list of books private and exposes public methods to manipulate the cart (`addBook`, `calculateTotal`, `getBooks`). Similarly, `Customer` hides its internal details like the shopping cart and payment gateway but exposes methods like `browseBooks`, `addToCart`, and `checkout` for interaction.

### 7. **SOLID Principles**
   - **Single Responsibility Principle (SRP)**: Each class has a distinct responsibility, e.g., `ShoppingCart` handles cart operations, `PaymentGatewayModel` handles payment, and `Customer` manages browsing and checkout.
   - **Open/Closed Principle (OCP)**: The code is open for extension but closed for modification. For instance, the addition of new payment methods or books can be done without changing existing code.
   - **Liskov Substitution Principle (LSP)**: The code follows LSP by ensuring that derived classes (if any) can be substituted for base classes without affecting the system's behavior.
   - **Interface Segregation Principle (ISP)**: The interfaces are not explicitly used, but if they were, the idea would be to ensure that clients (e.g., `Customer`) only depend on the methods they actually use (e.g., `browseBooks`, `addToCart`).
   - **Dependency Inversion Principle (DIP)**: The higher-level modules (e.g., `Customer`) are not tightly dependent on low-level modules (e.g., `PaymentGatewayModel`). This could be enhanced by introducing an interface for payment gateways.

## How to Run

### Prerequisites:
- Java Development Kit (JDK) 8 or above

### Steps:
1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Moonkhaan/SDA
   ```
2. Navigate to the project directory:
   ```bash
   cd ASSIGNMENT-1-SOLUTION/
   ```
3. Compile the Java files:
   ```bash
   javac model/*.java
   ```
4. Run the `Main` class:
   ```bash
   java model.Main
   ```

The program will simulate a customer browsing books, adding them to the cart, and proceeding with the checkout process.

## Video Explanation

A video is provided in the GitHub repository to explain the functionality of the application and demonstrate how the system works. It covers:
- Introduction to the classes and their responsibilities
- Detailed walkthrough of the customer interactions (browsing, adding to cart, and checkout)
- Explanation of the design patterns used and how they apply to the solution

[Video Explanation](./labassignment.mp4)

## Future Improvements

- **GUI Implementation**: Currently, the system uses `System.out.println` for display. A graphical user interface (GUI) using JavaFX or Swing could be implemented.
- **Database Integration**: Integrating a database for book storage, customer data, and order management would be a valuable enhancement.
- **Multiple Payment Methods**: Support for different payment methods (credit card, PayPal, etc.) using the Strategy pattern.
- **Notification System**: Implementing the Observer pattern to notify customers when their order is processed, shipped, etc.
