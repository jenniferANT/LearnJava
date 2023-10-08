package Cau9;

public class BaseProduct implements Product {
    private String name;
    private double price;

    public BaseProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}