public class Producto {
    String nombre;
    float precioSinIva;

    public Producto(String nombre, float precioSinIva) {
        this.nombre = nombre;
        this.precioSinIva = precioSinIva;
    }

    public float precioConIva() {
        return (float) (precioSinIva * 1.21);  // IVA del 21%
    }
}
