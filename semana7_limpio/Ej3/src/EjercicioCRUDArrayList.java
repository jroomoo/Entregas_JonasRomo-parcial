
import static com.coti.tools.Esdia.*;
import java.util.ArrayList;
import java.util.Iterator;
import view.*;
import controller.*;
import model.*;
import model.Persona;

/**
 *
 * 
 * Ejercicio CRUD Collections. (Con la colección ArrayList)
 * 
 * Ejercicio para ejemplificar altas, bajas, modificaciones y listados
 * empleando Colecciones.
 * 
 * Se puede comprobar como es mucho más sencilla la gestión de nuevos elementos
 * en la colección de forma dinámica.
 * 
 * 
 * No se sigue ningún patrón arquitectónico en este ejercicio.
 * 
 * Se realiza todo en la misma clase para mayor claridad, sin embargo
 * esto se aplica a las colecciones que residan en cualquier otro objeto del
 * programa.
 * 
 * 
 * @author Loza
 */
public class EjercicioCRUDArrayList {

    public static void main(String[] args) {
        // Crear la vista
        View view = new View();
        ArrayList <Persona> persona = new ArrayList<>();

        // Crear el controlador y pasarle la vista
        Controller controller = new Controller(persona, view);

        // Iniciar la aplicación (bucle de menú)
        controller.iniciar();
    }

        
}
