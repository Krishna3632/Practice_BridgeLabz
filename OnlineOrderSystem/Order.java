package OnlineOrderSystem;

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
