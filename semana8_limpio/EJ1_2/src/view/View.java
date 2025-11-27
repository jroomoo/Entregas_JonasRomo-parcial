package view;

import controller.Controller;
import com.coti.tools.Esdia;

public class View {

    private Controller controller;

    // Método para que el controlador se registre en la vista
    public void getController(Controller controller) {
        this.controller = controller;
    }

    // Mostrar mensajes genéricos
    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    // Pedir goles al usuario
    public int pedirEntero(String msg) {
        return Esdia.readInt(msg);
    }

    // Mostrar la quiniela completa
    public void mostrarQuiniela(String tabla) {
        System.out.println(tabla);
    }
}
