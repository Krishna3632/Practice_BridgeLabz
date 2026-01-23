// Customer.java
public class Customer {
    private String customerId;
    private String name;
    private String email;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Method to get discount - overridden by subclasses
    public double getDiscountRate() {
        return 0.0; // No discount by default
    }
}

// RegularCustomer.java
public class RegularCustomer extends Customer {
    public RegularCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscountRate() {
        return 0.05; // 5% discount
    }
}

// PremiumCustomer.java
public class PremiumCustomer extends Customer {
    public PremiumCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscountRate() {
        return 0.15; // 15% discount
    }
}

// Product.java
public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Order.java
public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        double total = product.getPrice() * quantity;
        double discount = total * customer.getDiscountRate();
        return total - discount;
    }

    public void displayOrderDetails() {
        System.out.println("Customer: " + customer.getName() + " (" + customer.getEmail() + ")");
        System.out.println("Product: " + product.getProductName() + " | Price: $" + product.getPrice());
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + (customer.getDiscountRate() * 100) + "%");
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Customer c1 = new RegularCustomer("C101", "Alice", "alice@mail.com");
        Customer c2 = new PremiumCustomer("C102", "Bob", "bob@mail.com");

        Product p1 = new Product("P201", "Laptop", 60000);
        Product p2 = new Product("P202", "Mouse", 800);

        Order o1 = new Order(c1, p1, 1);
        Order o2 = new Order(c2, p2, 3);

        o1.displayOrderDetails();
        System.out.println("------------------");
        o2.displayOrderDetails();
    }
}
