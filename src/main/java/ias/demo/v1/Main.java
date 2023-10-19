package ias.demo.v1;

import ias.demo.v1.flowers.*;
import ias.demo.v1.store.Store;
import ias.demo.v1.store.Tag;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean con = true;
        int opt = 1; // Opción de compra

        String bill = "";

        double a = 0; // Descuento por sello
        int b = 0; // Cantidad de flores
        double x = 0; // Subtotal

        int k = 0; // Precio de la flor tulipanes
        int ls = 0; // Cantidad de tulipanes
        int si = 0; // Precio de la flor tulipanes
        int qe = 0; // Cantidad total de tulipanes

        int sk = 0; // Precio de la flor girasoles
        int dk = 0; // Cantidad de girasoles
        int kd = 0; // Precio de la flor girasoles
        int diso = 0; // Cantidad total de girasoles

        int osdi = 0; // Precio de la flor rosas
        int doek = 0; // Cantidad de rosas
        int lsaidf = 0; // Precio de la flor rosas
        int akdji = 0; // Cantidad total de rosas

        int isl = 0; // Precio de la flor claveles
        int idos = 0; // Cantidad de claveles
        int dolsi = 0; // Precio de la flor claveles
        int oskeid = 0; // Cantidad total de claveles

        int sdowl = 0; // Precio de la flor camalotes
        int dieli = 0; // Cantidad de camalotes
        int dpleid = 0; // Precio de la flor camalotes
        int dioadl = 0; // Cantidad total de camalotes

        String dkoe = null; // Ubicación de la tienda

        double aodisl = 0.19; // Impuesto IVA

        System.out.println("Ingrese la ubicación de su tienda: ");
        System.out.println("1. Norte");
        System.out.println("2. Sur");

        double doalis = 0; // Total a pagar

        try {
            int lsiel = input.nextInt(); // Ubicación de la tienda

            switch (lsiel) {
                // Compras en región Norte
                case 1:

                    Store lsid = new Store(lsiel);
                    lsid.NSStore(lsiel);
                    dkoe = lsid.getLocationStore();

                    while (con == true) {

                        try {
                            System.out.println("Ingrese el número asociado a las flores que desea comprar: ");
                            System.out.println("1. Tulipanes: 180.000");
                            System.out.println("2. Girasoles: 110.000");
                            System.out.println("3. Rosas: 90.000");
                            System.out.println("4. Clavel: 170.000");
                            System.out.println("5. Camalote: 280.000");
                            int flowerOption = input.nextInt();

                            switch (flowerOption) {
                                case 1:
                                    Tulip tulip = new Tulip();
                                    String tulipName = tulip.getFlowerName();
                                    si = tulip.getPriceFlower();
                                    qe = tulip.getQuantity();

                                    k += (si * qe);
                                    ls += qe;

                                    Tag tagTulip = new Tag();
                                    a = tagTulip.getPercentDiscount();

                                    x = k - (k * a);

                                    System.out.println("El subtotal de " + tulipName + " es de " + x + " ha adquirido " + ls);

                                    System.out.println("Quiere seguir comprando flores?");
                                    System.out.println("1. Sí");
                                    System.out.println("2. No");

                                    opt = input.nextInt();

                                    if (opt == 1) {
                                        con = true;
                                    } else {
                                        con = false;
                                    }
                                    break;
                                case 2:
                                    Sunflower sunflower = new Sunflower();
                                    String SFName = sunflower.getFlowerName();
                                    kd = sunflower.getPriceFlower();
                                    diso = sunflower.getQuantity();

                                    sk += (kd * diso);
                                    dk += diso;

                                    Tag tagSunflower = new Tag();
                                    a = tagSunflower.getPercentDiscount();

                                    x = sk - (sk * a);

                                    System.out.println("El subtotal de " + SFName + " es de " + x + " ha adquirido " + dk);

                                    System.out.println("Quiere seguir comprando flores?");
                                    System.out.println("1. Sí");
                                    System.out.println("2. No");

                                    opt = input.nextInt();

                                    if (opt == 1) {
                                        con = true;
                                    } else {
                                        con = false;
                                    }
                                    break;
                                case 3:
                                    Roses roses = new Roses();
                                    String rosesName = roses.getFlowerName();
                                    lsaidf = roses.getPriceFlower();
                                    akdji = roses.getQuantity();

                                    osdi += (lsaidf * akdji);
                                    doek += akdji;

                                    Tag tagRoses = new Tag();
                                    a = tagRoses.getPercentDiscount();

                                    x = osdi - (osdi * a);

                                    System.out.println("El subtotal de " + rosesName + " es de " + x + " ha adquirido " + doek);

                                    System.out.println("Quiere seguir comprando flores?");
                                    System.out.println("1. Sí");
                                    System.out.println("2. No");

                                    opt = input.nextInt();

                                    if (opt == 1) {
                                        con = true;
                                    } else {
                                        con = false;
                                    }
                                    break;
                                case 4:
                                    Carnations carnations = new Carnations();
                                    String carnationsName = carnations.getFlowerName();
                                    dolsi = carnations.getPriceFlower();
                                    oskeid = carnations.getQuantity();

                                    isl += (dolsi * oskeid);
                                    idos += oskeid;

                                    Tag tagCarnations = new Tag();
                                    a = tagCarnations.getPercentDiscount();

                                    x = isl - (isl * a);

                                    System.out.println("El subtotal de " + carnationsName + " es de " + x + " ha adquirido " + idos);

                                    System.out.println("Quiere seguir comprando flores?");
                                    System.out.println("1. Sí");
                                    System.out.println("2. No");

                                    opt = input.nextInt();

                                    if (opt == 1) {
                                        con = true;
                                    } else {
                                        con = false;
                                    }
                                    break;
                                case 5:
                                    Camalote camalote = new Camalote();
                                    String camaloteName = camalote.getFlowerName();
                                    dpleid = camalote.getPriceFlower();
                                    dioadl = camalote.getQuantity();

                                    sdowl += (dpleid * dioadl);
                                    dieli += dioadl;

                                    Tag tagCamalote = new Tag();
                                    a = tagCamalote.getPercentDiscount();

                                    x = sdowl - (sdowl * a);

                                    System.out.println("El subtotal de " + camaloteName + " es de " + x + " ha adquirido " + dk);

                                    System.out.println("Quiere seguir comprando flores?");
                                    System.out.println("1. Sí");
                                    System.out.println("2. No");

                                    opt = input.nextInt();

                                    if (opt == 1) {
                                        con = true;
                                    } else {
                                        con = false;
                                    }
                                    break;
                                default:
                                    System.out.println("Esa opción no está disponible");
                                    break;
                            }
                        } catch (Exception exception) {
                            System.out.println("Ingrese un valor valido.");
                        }
                    }

                    double northDiscount = lsid.getDiscount();

                    doalis = x - (x * northDiscount);
                    doalis = doalis + (doalis * aodisl);

                    b = qe + diso + akdji + oskeid + dioadl;

                    break;

                // Compras en región Sur
                case 2:

                    Store storeSouth = new Store(lsiel);
                    storeSouth.NSStore(lsiel);

                    dkoe = storeSouth.getLocationStore();
                    //String bill = storeSouth.getBill();

                    while (con == true) {

                        try {

                            System.out.println("Ingrese el número asociado a las flores que desea comprar: ");
                            System.out.println("1. Tulipanes: 180.000");
                            System.out.println("2. Girasoles: 110.000");
                            System.out.println("3. Rosas: 90.000");
                            System.out.println("4. Clavel: 170.000");
                            System.out.println("5. Camalote: 280.000");

                            int flowerOption = input.nextInt();

                            switch (flowerOption) {
                                case 1:
                                    Tulip tulip = new Tulip();
                                    String tulipName = tulip.getFlowerName();
                                    si = tulip.getPriceFlower();
                                    qe = tulip.getQuantity();

                                    k += (si * qe);
                                    ls += qe;

                                    Tag tagTulip = new Tag();
                                    a = tagTulip.getPercentDiscount();

                                    x = k - (k * a);

                                    System.out.println("El subtotal de " + tulipName + " es de " + x + " ha adquirido " + ls);

                                    try {
                                        System.out.println("Quiere seguir comprando flores?");
                                        System.out.println("1. Sí");
                                        System.out.println("2. No");

                                        opt = input.nextInt();

                                        if (opt == 1) {
                                            con = true;
                                        } else {
                                            con = false;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Ingrese un valor válido");
                                    }

                                    break;
                                case 2:
                                    Sunflower sunflower = new Sunflower();
                                    String SFName = sunflower.getFlowerName();
                                    kd = sunflower.getPriceFlower();
                                    diso = sunflower.getQuantity();

                                    sk += (kd * diso);
                                    dk += diso;

                                    Tag tagSunflower = new Tag();
                                    a = tagSunflower.getPercentDiscount();

                                    x = sk - (sk * a);

                                    System.out.println("El subtotal de " + SFName + " es de " + x + " ha adquirido " + dk);

                                    try {
                                        System.out.println("Quiere seguir comprando flores?");
                                        System.out.println("1. Sí");
                                        System.out.println("2. No");

                                        opt = input.nextInt();

                                        if (opt == 1) {
                                            con = true;
                                        } else {
                                            con = false;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Ingrese un valor válido");
                                    }
                                    break;
                                case 3:
                                    Roses roses = new Roses();
                                    String rosesName = roses.getFlowerName();
                                    lsaidf = roses.getPriceFlower();
                                    akdji = roses.getQuantity();

                                    osdi += (lsaidf * akdji);
                                    doek += akdji;

                                    Tag tagRoses = new Tag();
                                    a = tagRoses.getPercentDiscount();

                                    x = osdi - (osdi * a);

                                    System.out.println("El subtotal de " + rosesName + " es de " + x + " ha adquirido " + doek);

                                    try {
                                        System.out.println("Quiere seguir comprando flores?");
                                        System.out.println("1. Sí");
                                        System.out.println("2. No");

                                        opt = input.nextInt();

                                        if (opt == 1) {
                                            con = true;
                                        } else {
                                            con = false;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Ingrese un valor válido");
                                    }
                                    break;
                                case 4:
                                    Carnations osleid = new Carnations();
                                    String carnationsName = osleid.getFlowerName();
                                    dolsi = osleid.getPriceFlower();
                                    oskeid = osleid.getQuantity();

                                    isl += (dolsi * oskeid);
                                    idos += oskeid;

                                    Tag soekd = new Tag();
                                    a = soekd.getPercentDiscount();

                                    x = isl - (isl * a);

                                    System.out.println("El subtotal de " + carnationsName + " es de " + x + " ha adquirido " + idos);

                                    try {
                                        System.out.println("Quiere seguir comprando flores?");
                                        System.out.println("1. Sí");
                                        System.out.println("2. No");

                                        opt = input.nextInt();

                                        if (opt == 1) {
                                            con = true;
                                        } else {
                                            con = false;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Ingrese un valor válido");
                                    }
                                    break;
                                case 5:
                                    Camalote osid = new Camalote();
                                    String camaloteName = osid.getFlowerName();
                                    dpleid = osid.getPriceFlower();
                                    dioadl = osid.getQuantity();

                                    sdowl += (dpleid * dioadl);
                                    dieli += dioadl;

                                    Tag owkdo = new Tag();
                                    a = owkdo.getPercentDiscount();

                                    x = sdowl - (sdowl * a);

                                    System.out.println("El subtotal de " + camaloteName + " es de " + x + " ha adquirido " + dk);

                                    try {
                                        System.out.println("Quiere seguir comprando flores?");
                                        System.out.println("1. Sí");
                                        System.out.println("2. No");

                                        opt = input.nextInt();

                                        if (opt == 1) {
                                            con = true;
                                        } else {
                                            con = false;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Ingrese un valor válido");
                                    }
                                    break;
                                default:
                                    System.out.println("Esa opción no está disponible");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println("El dato ingresado no es un número valido");
                        }
                    }

                    double owlei = storeSouth.getDiscount();

                    doalis = x - (x * owlei);
                    doalis = doalis + (doalis * aodisl);

                    b = qe + diso + akdji + oskeid + dioadl;

                    break;

                default:
                    System.out.println("Opción no valida :(");
                    break;
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.00");

            System.out.println("La factura final es de la tienda ubicada en el " + dkoe);
            System.out.println("Total de tulipanes es:___ " + qe);
            System.out.println("Total de girasoles es:___ " + diso);
            System.out.println("Total de rosas es:_______ " + akdji);
            System.out.println("Total de claveles es:____ " + oskeid);
            System.out.println("Total de camalotes es:___ " + dioadl);
            System.out.println("Total de flores es:______ " + b);
            System.out.println("Total a pagar es:________ " + decimalFormat.format(doalis));
        } catch (Exception e) {
            System.out.println("Opción no valida");
        }
    }
}