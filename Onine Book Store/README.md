# Communication Diagram Overview

## Overview
This communication diagram demonstrates the interaction between a **Customer**, the **BookStoreSystem**, and the **PaymentGateway** during the process of purchasing a book.

### Participants:
1. **Customer**: The primary user who interacts with the system to browse and purchase books.
2. **BookStoreSystem**: Represents the online bookstore, managing books, the cart, and order processing.
3. **PaymentGateway**: A third-party service responsible for processing payments securely.

### Communication Flow:
- The **Customer** sends a request to the **BookStoreSystem** to add a book to the shopping cart.
- The **Customer** then proceeds to checkout, triggering another request to the **BookStoreSystem**.
- The **BookStoreSystem** communicates with the **PaymentGateway** to process the payment.
- After processing, the **PaymentGateway** sends a confirmation back to the **BookStoreSystem**.
- Finally, the **BookStoreSystem** confirms the order to the **Customer**.

## Principles Applied

### 1. **Separation of Concerns**:
Each participant plays a specific role. The **Customer** selects books and places orders, the **BookStoreSystem** manages the catalog and order, and the **PaymentGateway** handles the payment processing. This ensures clarity in responsibilities.

### 2. **Single Responsibility Principle (SRP)**:
Each participant is responsible for only one part of the process:
- **Customer**: Interacts with the system to select books and place orders.
- **BookStoreSystem**: Handles books, the shopping cart, and orders.
- **PaymentGateway**: Processes payments only.

### 3. **Encapsulation**:
The payment processing logic is encapsulated within the **PaymentGateway**. The **Customer** doesn't need to know the internal workings of payment processing, simplifying the user experience and reducing complexity.

### 4. **Message-Passing Communication**:
Participants communicate by passing messages, such as:
- `addBookToCart()`
- `checkout()`
- `processPayment()`
These represent specific actions and help in structuring clear interactions between components.

### 5. **Coupling and Cohesion**:
The diagram maintains minimal coupling between participants. For example, the **Customer** doesn't interact directly with the **PaymentGateway**; communication flows through the **BookStoreSystem**, ensuring a loosely coupled, maintainable system.

## Summary
This communication diagram follows fundamental design principles such as **Separation of Concerns**, **SRP**, and **Encapsulation**. By keeping the interactions modular and streamlined, it creates a robust, scalable, and maintainable system.

