package controller;

import model.Persona;
import view.View;

import java.io.File;
import java.util.ArrayList;

public class Controller {

    private ArrayList<Persona> listado;
    private View view;

    public Controller(View view) {
        this.view = view;
        this.listado = new ArrayList<>();
        cargarInicio();
    }

    // Carga inicial desde datos.txt en el escritorio
    private void cargarInicio() {
        String escritorio = System.getProperty("user.home") + "\\OneDrive\\Escritorio";
        File fichero = new File(escritorio, "datos.txt");
        listado = Persona.crearDesdeFichero(fichero, "\t");
        if (listado.isEmpty()) {
            view.mostrarLinea("No se cargaron personas al inicio.");
        } else {
            view.mostrarLinea("Personas cargadas desde datos.txt");
        }
    }

    // Método iniciar con menú
    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            view.mostrarMenu();
            int opcion = view.pedirEntero("");

            switch(opcion) {
                case 1: // Mostrar todas las personas
                    
                    for (Persona p : listado) {
                        view.mostrarLinea(p.filaTab());
                    }
                    break;
                case 2: // Importar TSV desde escritorio
                    String nombreFichero = view.pedirCadena("Nombre del fichero en el escritorio: ");
                    File fichero = new File(System.getProperty("user.home") + "/Desktop", nombreFichero);
                    listado = Persona.crearDesdeFichero(fichero, "\t");
                    if (listado.isEmpty()) {
                        view.mostrarLinea("No se cargaron personas.");
                    } else {
                        view.mostrarLinea("Datos importados correctamente.");
                    }
                    break;
                case 3: // Salir
                    String confirma = view.pedirCadena("¿Seguro que quieres salir? (s/n): ");
                    if (confirma.equalsIgnoreCase("s")) {
                        salir = true;
                        view.mostrarLinea("Saliendo del programa...");
                    }
                    break;
                default:
                    view.mostrarLinea("Opción no válida.");
            }
        }
    }
}
