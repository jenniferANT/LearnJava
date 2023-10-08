package Cau9;

public class Store {
    public static void main(String[] args) {
        // Tạo các sản phẩm
        Product product1 = new BaseProduct("Product 1", 10.0);
        Product product2 = new BaseProduct("Product 2", 20.0);
        Product product3 = new BaseProduct("Product 3", 30.0);

        // Tạo giỏ hàng và thêm sản phẩm vào đó
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(product1);
        cart.addItem(product2);
        cart.addItem(product3);

        // Tạo khách hàng và cho họ mua hàng
        Customer customer = new Customer("John", "john@example.com");
        customer.makePurchase(cart);
    }
}
