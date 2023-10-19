package ias.demo.v4.app;

public enum Sello {

    BRONCE(0.1),
    ARO(0.28),
    NINGUNO(0.0),
    PLATA(0.15);

    final protected double discount;

    Sello(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
