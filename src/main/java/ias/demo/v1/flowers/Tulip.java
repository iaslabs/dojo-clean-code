package ias.demo.v1.flowers;

import java.util.Scanner;

public class Tulip {

    private int priceFlower = 180000;
    private String flowerName = "Tulipanes";

    private int quantity = 0;

    public Tulip() {
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
