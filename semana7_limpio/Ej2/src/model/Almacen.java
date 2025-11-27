package model;

import java.util.ArrayList;

public class Almacen {
    private ArrayList<Producto> productos;
    private int ingresoTotal;

    public Almacen() {
        productos = new ArrayList<>();
        ingresoTotal = 0;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public int getIngresoTotal() {
        return ingresoTotal;
    }

    public void calcularIngreso() {
        ingresoTotal = 0;
        for (Producto p : productos) {
            ingresoTotal += p.calcularIngreso();
        }
    }
    public void cambiarPrecios(int pr[]){
        int i = 0;
        for(Producto p : productos){
            p.setPrecio(pr[i]);
            i++;
        }
    }
    
}
