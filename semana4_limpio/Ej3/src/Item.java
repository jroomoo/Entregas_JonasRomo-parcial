public class Item {
    Producto producto;
    float kilos;

    public Item(Producto producto, float kilos) {
        this.producto = producto;
        this.kilos = kilos;
    }

    public float subtotal() {
        return kilos * producto.precioConIva();
    }
}