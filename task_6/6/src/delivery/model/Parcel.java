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

    public double calculateDeliveryPrice() {
        return weight * 50;
    }

    public void printInfo() {
        System.out.println("Получатель: " + recipientName);
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Трек-номер: " + trackingNumber);
        System.out.println("Стоимость доставки: " + calculateDeliveryPrice() + " руб.");
    }
}