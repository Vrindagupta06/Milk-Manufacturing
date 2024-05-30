import java.util.Scanner;

class Supplier {
    String id;
    String name;
    String contactInfo;
    Product[] productsSupplied;
    int productCount;

    Supplier(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.productsSupplied = new Product[100]; 
        this.productCount = 0;
    }

    void supplyProduct(Product product) {
        productsSupplied[productCount++] = product;
    }

    void withdrawProduct(Product product) {
        for (int i = 0; i < productCount; i++) {
            if (productsSupplied[i].equals(product)) {
                for (int j = i; j < productCount - 1; j++) {
                    productsSupplied[j] = productsSupplied[j + 1];
                }
                productCount--;
                break;
            }
        }
    }
}

class Product {
    String id;
    String name;
    double price;
    int quantityAvailable;
    Supplier supplier;

    Product(String id, String name, double price, int quantityAvailable, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.supplier = supplier;
    }
}

class TaskInfo {
    String id;
    String description;
    String deadline;
    Employee assignee;

    TaskInfo(String id, String description, String deadline, Employee assignee) {
        this.id = id;
        this.description = description;
        this.deadline = deadline;
        this.assignee = assignee;
    }
    TaskInfo() {
        this.id = "";
        this.description = "";
        this.deadline = "";
        this.assignee = null;
    }

    void getTaskInfo(Scanner scanner) {
        System.out.print("Enter Task ID: ");
        id = scanner.nextLine();

        System.out.print("Enter Task Description: ");
        description = scanner.nextLine();

        System.out.print("Enter Task Deadline: ");
        deadline = scanner.nextLine();
    }
}

class OrderItem {
    Product product;
    int quantity;
    double subtotal;

    OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.subtotal = product.price * quantity;
    }
}

class Order {
    String id;
    Customer customer;
    String orderDate;
    OrderItem[] items;
    int itemCount;

    Order(String id, Customer customer, String orderDate) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.items = new OrderItem[100]; 
        this.itemCount = 0;
    }

    void addItem(OrderItem item) {
        items[itemCount++] = item;
    }

    void removeItem(OrderItem item) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(item)) {
                for (int j = i; j < itemCount - 1; j++) {
                    items[j] = items[j + 1];
                }
                itemCount--;
                break;
            }
        }
    }
}

class Customer {
    String id;
    String name;
    String address;
    String contactInfo;
    Order[] orders;
    int orderCount;

    Customer(String id, String name, String address, String contactInfo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.orders = new Order[100]; 
        this.orderCount = 0;
    }

    void placeOrder(Order order) {
        orders[orderCount++] = order;
    }

    void cancelOrder(Order order) {
        for (int i = 0; i < orderCount; i++) {
            if (orders[i].equals(order)) {
                for (int j = i; j < orderCount - 1; j++) {
                    orders[j] = orders[j + 1];
                }
                orderCount--;
                break;
            }
        }
    }
}

class Employee {
    String id;
    String position;
    String name;
    int salary;
    String hireDate;
    TaskInfo[] tasks;
    int taskCount;

    Employee(String id, String position, String name, int salary, String hireDate) {
        this.id = id;
        this.position = position;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.tasks = new TaskInfo[100]; 
        this.taskCount = 0;
    }

    void performTask(TaskInfo task) {
        tasks[taskCount++] = task;
    }
}

class CollectionCenter {
    String name;
    String location;

    void getCollectionCenterInfo(Scanner scanner) {
        System.out.print("Enter Collection Center Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Collection Center Location: ");
        location = scanner.nextLine();
    }
}

class MilkCategory {
    String type;
    String fillingType;
    double fatContent;
    double pricePerLiter;

    void getMilkCategoryInfo(Scanner scanner) {
        System.out.print("Enter Milk Category Type: ");
        type = scanner.nextLine();

        System.out.print("Enter Milk Filling Type: ");
        fillingType = scanner.nextLine();

        System.out.print("Enter Milk Category Fat Content (%): ");
        fatContent = scanner.nextDouble();

        System.out.print("Enter Milk Category Price Per Liter (in dollars): ");
        pricePerLiter = scanner.nextDouble();
        scanner.nextLine(); 
    }
}

class Payment {
    String method;
    double amount;

    void getPaymentInfo(Scanner scanner) {
        System.out.print("Enter Payment Method: ");
        method = scanner.nextLine();

        System.out.print("Enter Payment Amount: ");
        amount = scanner.nextDouble();
        scanner.nextLine(); 
    }
}

class Route {
    String startLocation;
    String endLocation;

    void getRouteInfo(Scanner scanner) {
        System.out.print("Enter Start Location: ");
        startLocation = scanner.nextLine();

        System.out.print("Enter End Location: ");
        endLocation = scanner.nextLine();
    }
}

class Dealer {
    String name;
    String contactInfo;

    void getDealerInfo(Scanner scanner) {
        System.out.print("Enter Dealer Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Dealer Contact Info: ");
        contactInfo = scanner.nextLine();
    }
}

public class MilkManufacturing {
    public static void main(String[] args) {
        double quantity, pricePerLiter;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity of milk produced (in liters): ");
        quantity = scanner.nextDouble();

        System.out.print("Enter the price per liter of milk (in dollars): ");
        pricePerLiter = scanner.nextDouble();

        double totalRevenue = quantity * pricePerLiter;

        System.out.println("\nTotal Revenue Generated: $" + totalRevenue);

        scanner.nextLine(); 

        System.out.println("\nEnter Supplier Information:");
        System.out.print("Enter Supplier ID: ");
        String sid = scanner.nextLine();
        System.out.print("Enter Supplier Name: ");
        String sname = scanner.nextLine();
        System.out.print("Enter Supplier Contact Info: ");
        String scontactinfo = scanner.nextLine();
        Supplier supplier = new Supplier(sid, sname, scontactinfo);

        System.out.println("\nEnter Driver Information:");
        System.out.print("Enter Driver Name: ");
        String dname = scanner.nextLine();
        System.out.print("Enter Driver Contact Info: ");
        String dcontactinfo = scanner.nextLine();

        System.out.println("\nEnter Customer Information:");
        System.out.print("Enter Customer ID: ");
        String cid = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String cname = scanner.nextLine();
        System.out.print("Enter Customer Address: ");
        String caddress = scanner.nextLine();
        System.out.print("Enter Customer Contact Info: ");
        String ccontactinfo = scanner.nextLine();
        Customer customer = new Customer(cid, cname, caddress, ccontactinfo);

        System.out.println("\nEnter Order Details:");
        System.out.print("Enter Order ID: ");
        String oid = scanner.nextLine();
        System.out.print("Enter Order Date: ");
        String odate = scanner.nextLine();
        Order order = new Order(oid, customer, odate);

        System.out.println("\nEnter Employee Information:");
        System.out.print("Enter Employee ID: ");
        String eid = scanner.nextLine();
        System.out.print("Enter Employee Position: ");
        String eposition = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String ename = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        int esalary = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Hire Date: ");
        String edate = scanner.nextLine();
        Employee employee = new Employee(eid, eposition, ename, esalary, edate);

        System.out.println("\nEnter Collection Center Information:");
        CollectionCenter center = new CollectionCenter();
        center.getCollectionCenterInfo(scanner);

        System.out.println("\nEnter Milk Category Information:");
        MilkCategory milk = new MilkCategory();
        milk.getMilkCategoryInfo(scanner);

        System.out.println("\nEnter Payment Information:");
        Payment payment = new Payment();
        payment.getPaymentInfo(scanner);

        System.out.println("\nEnter Route Information:");
        Route route = new Route();
        route.getRouteInfo(scanner);

        System.out.println("\nEnter Task Information:");
        TaskInfo task = new TaskInfo();
        task.getTaskInfo(scanner);

        System.out.println("\nEnter Dealer Information:");
        Dealer dealer = new Dealer();
        dealer.getDealerInfo(scanner);

        System.out.println("\nSupplier Information:");
        System.out.println("ID: " + supplier.id);
        System.out.println("Name: " + supplier.name);
        System.out.println("Contact Info: " + supplier.contactInfo);

        System.out.println("\nDriver Information:");
        System.out.println("Name: " + dname);
        System.out.println("Contact Info: " + dcontactinfo);

        System.out.println("\nCustomer Information:");
        System.out.println("ID: " + customer.id);
        System.out.println("Name: " + customer.name);
        System.out.println("Address: " + customer.address);
        System.out.println("Contact Info: " + customer.contactInfo);

        System.out.println("\nOrder Details:");
        System.out.println("ID: " + order.id);
        System.out.println("Customer Name: " + order.customer.name);
        System.out.println("Order Date: " + order.orderDate);

        System.out.println("\nEmployee Information:");
        System.out.println("ID: " + employee.id);
        System.out.println("Name: " + employee.name);
        System.out.println("Position: " + employee.position);
        System.out.println("Salary: $" + employee.salary);
        System.out.println("Hire Date: " + employee.hireDate);

        System.out.println("\nCollection Center Information:");
        System.out.println("Name: " + center.name);
        System.out.println("Location: " + center.location);

        System.out.println("\nMilk Category Information:");
        System.out.println("Type: " + milk.type);
        System.out.println("Filling Type: " + milk.fillingType);
        System.out.println("Fat Content: " + milk.fatContent + "%");
        System.out.println("Price Per Liter: $" + milk.pricePerLiter);

        System.out.println("\nPayment Information:");
        System.out.println("Method: " + payment.method);
        System.out.println("Amount: $" + payment.amount);

        System.out.println("\nRoute Information:");
        System.out.println("Start Location: " + route.startLocation);
        System.out.println("End Location: " + route.endLocation);

        System.out.println("\nTask Information:");
        System.out.println("ID: " + task.id);
        System.out.println("Description: " + task.description);

        System.out.println("\nDealer Information:");
        System.out.println("Name: " + dealer.name);
        System.out.println("Contact Info: " + dealer.contactInfo);

        scanner.close();
    }
}
