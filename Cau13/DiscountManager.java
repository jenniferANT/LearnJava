package Cau13;


import java.util.ArrayList;
import java.util.List;

public class DiscountManager {
    private List<Customer> customers = new ArrayList<>();
    private List<DiscountEvent> discountEvents = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addDiscountEvent(DiscountEvent event) {
        discountEvents.add(event);
    }

    public void notifyVipCustomers() {
        for (Customer customer : customers) {
            if (customer.isVip()) {
                System.out.println("Truyền sự kiện giảm giá cho " + customer.getName() + ":");
                for (DiscountEvent event : discountEvents) {
                    System.out.println("- " + event.getEventName() + ": Giảm " + event.getDiscountPercent() + "%");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        DiscountManager manager = new DiscountManager();

        Customer customer1 = new Customer("Khach A", true);
        Customer customer2 = new Customer("Khach B", false);

        DiscountEvent event1 = new DiscountEvent("Sự kiện giảm giá 1", 10);
        DiscountEvent event2 = new DiscountEvent("Sự kiện giảm giá 2", 15);

        manager.addCustomer(customer1);
        manager.addCustomer(customer2);
        manager.addDiscountEvent(event1);
        manager.addDiscountEvent(event2);

        manager.notifyVipCustomers();
    }
}
