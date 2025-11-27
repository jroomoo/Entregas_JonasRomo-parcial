package view;
import static com.coti.tools.Esdia.readDouble;
import static com.coti.tools.Esdia.readInt;
import static com.coti.tools.Esdia.readString;

import controller.*;
public class View {
    Controller controller;

    public void mostrarMenu(){
        System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Modificar persona");
            System.out.println("4. Listar personas");
            System.out.println("5. Salir");
        
    }

    public int leerOpcion() {
        // TODO Auto-generated method stub
        return readInt("Ingrese una opción: ");
    }
    public int leerEdad() {
        // TODO Auto-generated method stub
        return readInt("Ingrese un numero ");
    }
    public String leerNombre() {
        return readString("Dime nombre");
    }
    public double leerAltura(){
        return readDouble("Dime altura");
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
