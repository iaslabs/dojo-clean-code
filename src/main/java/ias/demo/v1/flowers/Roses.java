package ias.demo.v1.flowers;

import java.util.Scanner;

public class Roses {

    private int priceFlower = 90000;
    private String flowerName = "Rosas";

    private int quantity = 0;

    public Roses() {
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
