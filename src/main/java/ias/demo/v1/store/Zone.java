package ias.demo.v1.store;

public enum Zone {

    NORTH(0.0173),
    SOUTH(0.0122);

    final protected double discount;

    Zone(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
