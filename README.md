# Milk-Manufacturing
 Milk manufacturering project in java
# Milk Manufacturing System

This Java application simulates a milk manufacturing system, involving various entities such as suppliers, customers, employees, products, orders, and more. It captures and processes information for each of these entities and performs operations like adding or withdrawing products, placing or canceling orders, and capturing various details related to the milk production and distribution process.

## Classes and Their Responsibilities

### Supplier
- **Attributes**: id, name, contactInfo, productsSupplied (array of Product), productCount.
- **Methods**:
  - `supplyProduct(Product product)`: Adds a product to the supplier's list of supplied products.
  - `withdrawProduct(Product product)`: Removes a product from the supplier's list of supplied products.

### Product
- **Attributes**: id, name, price, quantityAvailable, supplier.
- **Constructor**: Initializes a product with given id, name, price, quantity available, and supplier.

### TaskInfo
- **Attributes**: id, description, deadline, assignee (Employee).
- **Methods**:
  - `getTaskInfo(Scanner scanner)`: Captures task information from the user.

### OrderItem
- **Attributes**: product, quantity, subtotal.
- **Constructor**: Initializes an order item with a given product and quantity, calculating the subtotal.

### Order
- **Attributes**: id, customer, orderDate, items (array of OrderItem), itemCount.
- **Methods**:
  - `addItem(OrderItem item)`: Adds an order item to the order.
  - `removeItem(OrderItem item)`: Removes an order item from the order.

### Customer
- **Attributes**: id, name, address, contactInfo, orders (array of Order), orderCount.
- **Methods**:
  - `placeOrder(Order order)`: Adds an order to the customer's list of orders.
  - `cancelOrder(Order order)`: Removes an order from the customer's list of orders.

### Employee
- **Attributes**: id, position, name, salary, hireDate, tasks (array of TaskInfo), taskCount.
- **Methods**:
  - `performTask(TaskInfo task)`: Adds a task to the employee's list of tasks.

### CollectionCenter
- **Attributes**: name, location.
- **Methods**:
  - `getCollectionCenterInfo(Scanner scanner)`: Captures collection center information from the user.

### MilkCategory
- **Attributes**: type, fillingType, fatContent, pricePerLiter.
- **Methods**:
  - `getMilkCategoryInfo(Scanner scanner)`: Captures milk category information from the user.

### Payment
- **Attributes**: method, amount.
- **Methods**:
  - `getPaymentInfo(Scanner scanner)`: Captures payment information from the user.

### Route
- **Attributes**: startLocation, endLocation.
- **Methods**:
  - `getRouteInfo(Scanner scanner)`: Captures route information from the user.

### Dealer
- **Attributes**: name, contactInfo.
- **Methods**:
  - `getDealerInfo(Scanner scanner)`: Captures dealer information from the user.

## Main Class: MilkManufacturing

### Functionality
1. **Captures Milk Production Details**: Quantity and price per liter, then calculates the total revenue.
2. **Captures Supplier Information**: ID, name, and contact info.
3. **Captures Driver Information**: Name and contact info.
4. **Captures Customer Information**: ID, name, address, and contact info.
5. **Captures Order Details**: ID, order date, and associates it with a customer.
6. **Captures Employee Information**: ID, position, name, salary, and hire date.
7. **Captures Collection Center Information**: Name and location.
8. **Captures Milk Category Information**: Type, filling type, fat content, and price per liter.
9. **Captures Payment Information**: Method and amount.
10. **Captures Route Information**: Start and end locations.
11. **Captures Task Information**: ID, description, and deadline.
12. **Captures Dealer Information**: Name and contact info.

### Output
The application outputs the captured information for each entity, providing a summary of the entered data.

## Usage
- Compile and run the `MilkManufacturing` class.
- Follow the prompts to enter the required information for each entity.
- Review the summarized output of all entered data.

This system is a basic simulation and can be extended to include more functionality and validation as required.