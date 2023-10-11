package Cau13;

public class DiscountEvent {
    private String eventName;
    private int discountPercent;

    public DiscountEvent(String eventName, int discountPercent) {
        this.eventName = eventName;
        this.discountPercent = discountPercent;
    }

    public String getEventName() {
        return eventName;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
