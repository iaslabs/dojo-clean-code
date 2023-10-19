package ias.demo.v1.flowers;

import java.util.Scanner;

public class Sunflower {

    private int priceFlower = 110000;
    private String flowerName = "Girasoles";

    private int quantity = 0;

    public Sunflower() {
    }

    public int getPriceFlower() {
        return priceFlower;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public int getQuantity() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de arreglos florales de " + flowerName + " a comprar: ");
        quantity = input.nextInt();
        return quantity;
    }
}
