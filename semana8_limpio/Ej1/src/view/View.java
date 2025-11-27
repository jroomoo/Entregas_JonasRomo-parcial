package view;

import controller.Controller;
import com.coti.tools.Esdia;

public class View {

    private Controller controller;

    public void getController(Controller controller) {
        this.controller = controller;
    }

    // Mostrar mensajes
    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    // Entrada de datos del usuario
    public String pedirString(String msg) {
        return Esdia.readString(msg);
    }

    public int pedirEntero(String msg) {
        return Esdia.readInt(msg);
    }

    // Mostrar quiniela
    public void mostrarQuiniela(String tabla) {
        System.out.println(tabla);
    }
}
