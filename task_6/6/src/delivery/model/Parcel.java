package delivery.model;

public class Parcel {
    private String recipientName;
    private String deliveryAddress;
    protected double weight;
    String trackingNumber;

    public Parcel(String recipientName, String deliveryAddress, double weight, String trackingNumber) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.weight = weight;
        this.trackingNumber = trackingNumber;
    }

    public Parcel() {
        this.recipientName = "DEFAULT";
        this.deliveryAddress = "DEFAULT";
        this.weight = 0.0;
        this.trackingNumber = "000000";
    }

 package delivery.model;

public class Parcel {
    private String recipientName;
    private String deliveryAddress;
    protected double weight;
    private String trackingNumber;

    public Parcel(String recipientName, String deliveryAddress, double weight, String trackingNumber) {
        this.recipientName = recipientName;
        this.deliveryAddress = deliveryAddress;
        this.weight = weight;
        this.trackingNumber = trackingNumber;
    }

    public Parcel() {
        this.recipientName = "Неизвестно";
        this.deliveryAddress = "Неизвестно";
        this.weight = 0.0;
        this.trackingNumber = "000000";
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public double calculateDeliveryPrice() {
        return 100 + weight * 30;
    }

    public void printInfo() {
        System.out.println("Получатель: " + recipientName);
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Трек-номер: " + trackingNumber);
        System.out.println("Стоимость доставки: " + calculateDeliveryPrice() + " руб.");
    }
}
