package delivery.service;

import delivery.model.Parcel;

public class ParcelService {

    public void printParcelsReport(Parcel[] parcels) {
        for (int i = 0; i < parcels.length; i++) {
            Parcel parcel = parcels[i];
            parcel.printInfo();
            System.out.println("Стоимость доставки: " + parcel.calculateDeliveryPrice() + " руб.");
            System.out.println();
        }
    }
}