package ias.demo.v1.store;

import java.util.Scanner;

public class Tag {

    private String tagName = "";
    private double percentDiscount = 0;

    public Tag() {
        Scanner input = new Scanner(System.in);

        try {

            System.out.println("Ingrese el número asociado al tipo de sello que tiene el arreglo floral a compar: ");
            System.out.println("1. Oro");
            System.out.println("2. Plata");
            System.out.println("3. Bronce");
            System.out.println("4. Ninguno");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    tagName = "Oro";
                    percentDiscount = 0.28;
                    break;
                case 2:
                    tagName = "Plata";
                    percentDiscount = 0.15;
                    break;
                case 3:
                    tagName = "Bronce";
                    percentDiscount = 0.1;
                    break;
                case 4:
                    tagName = "Ninguno";
                    percentDiscount = 0;
                    break;
                default:
                    System.out.println("Esa opción no está disponible");
            }

        } catch (Exception exception) {
            System.out.println("Ingrese un valor valido.");
        }
    }

    public String getTagName() {
        return tagName;
    }

    public double getPercentDiscount() {
        return percentDiscount;
    }
}
