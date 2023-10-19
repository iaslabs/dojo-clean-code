package ias.demo.v3.app;

import java.util.List;

public class Store {
    // Atributos nombre, dirección, zone
    private String nombre;
    private String direccion;
    private DescontadorDeZone descontadorDeZone;
    private DefinicionRepositorio algunRepositorio;

    public Store(String nombre, String direccion, DescontadorDeZone descontadorDeZone) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.descontadorDeZone = descontadorDeZone;
        this.algunRepositorio = new MongoPDNRepositorio();
    }

    public List<ArregloFloral> getFloresDeTienda() {
        return algunRepositorio.getTodasLasFlores();
    }

    public String generarFactura(List<Compra> compras, Cliente cliente) {
        StringBuilder contenidoDeFactura = new StringBuilder();
        contenidoDeFactura.append("Nombre del cliente: ").append(cliente.getNombre().toUpperCase()).append(" - Identificación ").append(cliente.getIdentificacion());
        double descuentoTotal = 0;
        double totalTotal = 0;
        double impuestoIVA = 0;
        for (Compra compra : compras) {
            contenidoDeFactura.append("\n Producto:").append(compra.getItem().getNombre()).append(" cantidad:").append(compra.getCantidad()).append(" valor: $").append(compra.contabilizarCompra());
            descuentoTotal += compra.obtenerDescuentoAplicable();
            totalTotal += compra.contabilizarCompra();
        }
        double descuentoPorZona = totalTotal * descontadorDeZone.getDiscount();
        totalTotal -= descuentoPorZona;
        impuestoIVA = totalTotal * 0.19;
        totalTotal += impuestoIVA;

        if (descontadorDeZone == DescontadorDeZone.NORTH) {
            contenidoDeFactura.append("\n ###### FACTURACIÓN ELECTRÓNICA ######");
        }
        contenidoDeFactura.append("\n Descuento total aplicado:___ ").append(descuentoTotal);
        contenidoDeFactura.append("\n Descuento por zona aplicado:___ ").append(descuentoPorZona);
        contenidoDeFactura.append("\n IVA:______ ").append(impuestoIVA);
        contenidoDeFactura.append("\n Total a pagar es:________ ").append(totalTotal);

        return contenidoDeFactura.toString();
    }
}
