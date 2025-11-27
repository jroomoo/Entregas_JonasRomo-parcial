package view;

import com.coti.tools.Esdia;
import controller.Controller;

public class View {

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void mostrarMenu() {
        System.out.println("\n=== MENÚ DE LA COMPAÑÍA ===");
        System.out.println("1.- Leer tabla de ventas");
        System.out.println("2.- Leer tabla de precios");
        System.out.println("3.- Calcular ingresos totales");
        System.out.println("4.- Mostrar resultados");
        System.out.println("q.- Salir");
    }

    public String leerOpcion() {
        System.out.print("Selecciona opción: ");
        return Esdia.readString(" ");
    }

    public void leerVentas(int numAlmacen) {
        int unidades1 = Esdia.readInt("Almacén " + (numAlmacen+1) + " - Unidades Producto 1: ");
        int unidades2 = Esdia.readInt("Almacén " + (numAlmacen+1) + " - Unidades Producto 2: ");
        controller.setUnidadesAlmacen(numAlmacen, unidades1, unidades2);
    }

    public void leerPrecios() {
        int precio1 = Esdia.readInt("Precio Producto 1: ");
        int precio2 = Esdia.readInt("Precio Producto 2: ");
        controller.setPrecios(precio1, precio2);
    }

    public void mostrarResultados() {
        int[] ingresos = controller.getIngresosTotales();
        System.out.println("\n=== INGRESOS TOTALES POR ALMACÉN ===");
        for (int i = 0; i < ingresos.length; i++) {
            System.out.println("Almacén " + (i+1) + ": " + ingresos[i]);
        }
    }

    public void mostrarError(String mensaje) {
        System.out.println("ERROR: " + mensaje);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
