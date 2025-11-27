package view;
import com.coti.tools.Esdia;

import controller.Controller;
public class View {
    Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }
    
    public void mostrarLinea(String s){
        System.out.println(s);
    }

    public float pedirFloat(String string) {
        return Esdia.readFloat(string);
    }

    public String pedirCadena(String string) {
        return Esdia.readString(string);
    }
    public int pedirEntero (String string){
        return Esdia.readInt(string);
    }
    public void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Listado total de facturas");
        System.out.println("2. Listado de clientes con facturas mayores a un valor");
        System.out.println("3. Exportar facturas a CSV");
        System.out.println("4. Exportar facturas a HTML");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
