package controller;

import model.Almacen;
import model.Producto;
import view.View;
import java.util.ArrayList;

public class Controller {

    private ArrayList<Almacen> almacenes;
    private int precioProducto1;
    private int precioProducto2;
    private boolean ventasLeidas = false;
    private boolean preciosLeidos = false;

    private View view;

    public Controller(View view) {
        this.view = view;
        view.setController(this);

        almacenes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            almacenes.add(new Almacen());
        }
    }

    public void iniciar() {
        String opcion;
        do {
            view.mostrarMenu();
            opcion = view.leerOpcion();

            switch (opcion) {
                case "1":
                    for (int i = 0; i < almacenes.size(); i++) {
                        view.leerVentas(i);
                    }
                    ventasLeidas = true;
                    break;

                case "2":
                    view.leerPrecios();
                    preciosLeidos = true;
                    break;

                case "3":
                    if (!ventasLeidas || !preciosLeidos) {
                        view.mostrarError("No se puede calcular ingresos: falta leer ventas o precios.");
                    } else {
                        calcularIngresos();
                        view.mostrarMensaje("Ingresos calculados correctamente.");
                    }
                    break;

                case "4":
                    if (!ventasLeidas || !preciosLeidos) {
                        view.mostrarError("No se pueden mostrar resultados: falta leer ventas o precios.");
                    } else {
                        view.mostrarResultados();
                    }
                    break;

                case "q":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (!opcion.equals("q"));
    }

    public void setUnidadesAlmacen(int numAlmacen, int u1, int u2) {
        Almacen a = almacenes.get(numAlmacen);
        a.getProductos().clear();
        a.getProductos().add(new Producto(u1, precioProducto1));
        a.getProductos().add(new Producto(u2, precioProducto2));
    }

   public void setPrecios(int p1, int p2) {
        precioProducto1 = p1;
        precioProducto2 = p2;
        int precios[] = {p1, p2};
        for(Almacen a : almacenes){
            a.cambiarPrecios(precios);
        }
    }


    private void calcularIngresos() {
        for (Almacen a : almacenes) {
            a.calcularIngreso();
        }
    }

    public int[] getIngresosTotales() {
        int  ingresos [] = new int[5];
        int i = 0;
        for(Almacen a : almacenes){
            ingresos[i]= a.getIngresoTotal();
            i++;
        }
        return ingresos;
    }
}
