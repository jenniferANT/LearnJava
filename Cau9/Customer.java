package Cau9;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void makePurchase(ShoppingCart cart) {
        double total = cart.calculateTotal();
        System.out.println(name + " made a purchase of $" + total);
    }
}
