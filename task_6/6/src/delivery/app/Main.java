package delivery.app;

import delivery.model.Parcel;
import delivery.model.FragileParcel;
import delivery.model.ExpressParcel;
import delivery.service.ParcelService;

public class Main {

    public static void main(String[] args) {
        Parcel parcel1 = new Parcel("Иван Петров", "Москва, ул. Ленина, д. 1", 2.5, "TRK-001");

        FragileParcel parcel2 = new FragileParcel("Мария Смирнова", "Санкт-Петербург, Невский пр., д. 10", 1.2, "TRK-002", true);

        ExpressParcel parcel3 = new ExpressParcel("Алексей Иванов", "Новосибирск, ул. Советская, д. 5", 3.0, "TRK-003", 12);

        Parcel parcel4 = new Parcel();

        Parcel[] parcels = {parcel1, parcel2, parcel3, parcel4};

        ParcelService service = new ParcelService();
        service.printParcelsReport(parcels);
    }
}