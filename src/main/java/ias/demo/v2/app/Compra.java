package ias.demo.v2.app;

public class Compra {
    // Atributos item de tipo ArregloFloral, cantidad
    private ArregloFloral item;
    private int cantidad;

    public Compra(ArregloFloral item, int cantidad) {
        this.item = item;
        this.cantidad = cantidad;
    }

    public ArregloFloral getItem() {
        return item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double contabilizarCompra() {
        return item.getPrecioConSelloAplicado() * cantidad;
    }

    public double obtenerDescuentoAplicable() {
        return item.getDescuentoAplicable();
    }


}
