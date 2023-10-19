package ias.demo.v4.app;

public enum DescontadorDeZone {

    NORTH(0.0173),
    SOUTH(0.0122);

    final protected double discount;

    DescontadorDeZone(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
