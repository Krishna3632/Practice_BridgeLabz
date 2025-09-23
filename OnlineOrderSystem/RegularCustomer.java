package OnlineOrderSystem;

public class RegularCustomer extends Customer {
    public RegularCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscountRate() {
        return 0.05;
    }
}
