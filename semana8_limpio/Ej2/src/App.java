import controller.Controller;
import model.Model;
import view.View;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Crear la lista de facturas vacía
        ArrayList<Model> listado = new ArrayList<>();

        // Crear la vista
        View view = new View();

        // Crear el controlador
       

        Controller controller = new Controller(listado, view);
        
        // Iniciar la aplicación (menú y lógica dentro del controlador)
        controller.iniciar();
    }
}
