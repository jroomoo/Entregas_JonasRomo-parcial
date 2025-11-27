package model;

public class Producto {
    private int unidades;
    private int precio;

    public Producto(int unidades, int precio) {
        this.unidades = unidades;
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int calcularIngreso() {
        return unidades * precio;
    }
}
