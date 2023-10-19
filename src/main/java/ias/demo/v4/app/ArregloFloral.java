package ias.demo.v4.app;

public class ArregloFloral {
    // Atributos nombre, precio, sello, stock
    private String nombre;
    private double precio;
    private Sello sello;
    private int stock;

    public ArregloFloral(String nombre, double precio, Sello sello, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.sello = sello;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPrecioConSelloAplicado() {
        return precio - (precio * sello.getDiscount());
    }

    public double getDescuentoAplicable() {
        return precio * sello.getDiscount();
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Sello getSello() {
        return sello;
    }

    public void setSello(Sello sello) {
        this.sello = sello;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
