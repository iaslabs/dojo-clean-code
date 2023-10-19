package ias.demo.v4.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class Franquisia {
    // Atributos tiendaNorte de tipo Store, tiendaSur de tipo Store
    private Store tiendaNorte;
    private Store tiendaSur;

    public Franquisia(@Qualifier("storeNorth") Store storeNorth, @Qualifier("storeSouth") Store storeSouth) {
        this.tiendaNorte = storeNorth;
        this.tiendaSur = storeSouth;
    }

    public void simularCompra() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Simulando compra...");

            System.out.println("Ingresar la información del cliente...");
            System.out.println("Ingrese el nombre del cliente: ");
            String nombre = input.next();
            System.out.println("Ingrese la identificación del cliente: ");
            String identificacion = input.next();


            Cliente cliente = new Cliente(nombre, identificacion);
            Store store = seleccionarTienda();


            boolean continueBuying = true;
            List<Compra> carritoDeCompras = new ArrayList<>();
            while (continueBuying) {
                System.out.println("Seleccionando producto...");


                int cantidadAleatoria = (int) (Math.random() * 10) + 1;
                carritoDeCompras.add(
                        new Compra(
                                seleccionarFlor(store.getFloresDeTienda()),
                                cantidadAleatoria
                        )
                );


                System.out.println("Continuar?");
                System.out.println("0. Sí");
                System.out.println("1. No");
                int option = input.nextInt();
                continueBuying = option == 0;
            }

            imprimirFactura(
                    store.generarFactura(carritoDeCompras, cliente)
            );

        } catch (TiendaInvalidaException e) {
            System.out.println("Tienda inválida. Sin una tienda valida no puedo continuar. Inicia el programa nuevamente.");
            throw new RuntimeException(e);
        }
    }

    private void imprimirFactura(String informacionDeFactura) {
        System.out.println("############################# HEADER ############################");
        System.out.println(informacionDeFactura);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ FOOTER @@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    private ArregloFloral seleccionarFlor(List<ArregloFloral> flores) {
        boolean seleccionando = true;
        ArregloFloral arregloFloralSeleccionado = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Flor a comprar...");

        while (seleccionando) {
            for (int i = 0; i < flores.size(); i++) {
                System.out.println(i + ". " + flores.get(i).getNombre() + " - $" + flores.get(i).getPrecio());
            }
            int option = input.nextInt();
            if (option >= 0 && option < flores.size()) {
                arregloFloralSeleccionado = flores.get(option);
                seleccionando = false;
            } else {
                System.out.println("Opción inválida");
            }
        }

        return arregloFloralSeleccionado;
    }

    private Store seleccionarTienda() throws TiendaInvalidaException {
        boolean seleccionando = true;
        Store tiendaSeleccionada = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Tienda donde desea comprar...");

        while (seleccionando) {
            System.out.println("0. Tienda ABC");
            System.out.println("1. Tienda XYZ");
            int option = input.nextInt();
            if (option == 0) {
                tiendaSeleccionada = tiendaNorte;
                seleccionando = false;
            } else if (option == 1) {
                tiendaSeleccionada = tiendaSur;
                seleccionando = false;
            } else {
                throw new TiendaInvalidaException("Tienda inválida");
            }
        }

        return tiendaSeleccionada;
    }
}
