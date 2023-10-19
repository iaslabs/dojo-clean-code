package ias.demo.v1.store;

public class Store {

    private int option;
    private double discount = 0;
    private String bill = "";
    private String locationStore = "";

    public Store(int option) {
        this.option = option;
    }

    public void NSStore(int option) {
        try {
            switch (option) {
                case 1:
                    discount = 0.0173;
                    bill = "Certificado de factura electrónica";
                    locationStore = "Norte";

                    break;
                case 2:
                    discount = 0.0122;
                    bill = "No tiene certificado de factura electrónica";
                    locationStore = "Sur";
                    break;
                default:
                    System.out.println("Sede no reconocida.");
                    break;

            }
        } catch (Exception e) {
            System.out.println("Ingrese un valor válido.");
        }
    }

    public double getDiscount() {
        return discount;
    }

    public String getBill() {
        return bill;
    }

    public String getLocationStore() {
        return locationStore;
    }
}
