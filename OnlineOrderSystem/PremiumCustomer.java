package OnlineOrderSystem;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String customerId, String name, String email) {
        super(customerId, name, email);
    }

    @Override
    public double getDiscountRate() {
        return 0.15; // 15% discount
    }
}
