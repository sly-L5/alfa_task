package delivery.model;

public class ExpressParcel extends Parcel {
    private int deliveryHours;

    public ExpressParcel(String recipientName, String deliveryAddress, double weight, String trackingNumber, int deliveryHours) {
        super(recipientName, deliveryAddress, weight, trackingNumber);
        this.deliveryHours = deliveryHours;
    }

    public double calculateDeliveryPrice() {
        double basePrice = super.calculateDeliveryPrice();
        if (deliveryHours < 24) {
            return basePrice + 500;
        } else {
            return basePrice;
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Delivery deadline: " + deliveryHours + " часов");
    }
}