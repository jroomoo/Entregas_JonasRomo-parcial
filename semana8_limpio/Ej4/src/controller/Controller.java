package controller;

import model.DatosDeAlumno;
import view.View;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<DatosDeAlumno> listado;
    private View view;

    public Controller(View view) {
        this.view = view;
        this.view.setController(this);
        this.listado = new ArrayList<>();
        crearListaAleatoria();
    }

    public void crearListaAleatoria() {
        listado.clear();
        for (int i = 1; i <= 20; i++) {
            listado.add(DatosDeAlumno.crearAleatorio(i));
        }
        view.mostrarLinea("Lista de 20 alumnos creada correctamente.");
    }

    public void mostrarTabla() {
        view.mostrarLinea("Nombre, Apellidos, Edad, NIF, Calle, Número, Piso, Letra");
        for (DatosDeAlumno d : listado) {
            String fila = d.getPersonales().getNombre() + "," +
                    d.getPersonales().getApellidos() + "," +
                    d.getPersonales().getEdad() + "," +
                    d.getPersonales().getNIF() + "," +
                    d.getDireccion().getCalle() + "," +
                    d.getDireccion().getNumero() + "," +
                    d.getDireccion().getPiso() + "," +
                    d.getDireccion().getLetra();
            view.mostrarLinea(fila);
        }
    }

    public void exportarPersonalesCSV(String fichero) {
        try (FileWriter fw = new FileWriter(fichero)) {
            fw.write("Nombre,Apellidos,Edad,NIF\n");
            for (DatosDeAlumno d : listado) {
                fw.write(d.getPersonales().filaCSV() + "\n");
            }
            view.mostrarLinea("Datos personales exportados correctamente a " + fichero);
        } catch (Exception e) {
            view.mostrarLinea("Error exportando CSV: " + e.getMessage());
        }
    }

    public void exportarDireccionesCSV(String fichero) {
        try (FileWriter fw = new FileWriter(fichero)) {
            fw.write("Calle,Numero,Piso,Letra\n");
            for (DatosDeAlumno d : listado) {
                fw.write(d.getDireccion().filaCSV() + "\n");
            }
            view.mostrarLinea("Direcciones exportadas correctamente a " + fichero);
        } catch (Exception e) {
            view.mostrarLinea("Error exportando CSV: " + e.getMessage());
        }
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            view.mostrarMenu();
            int opcion = view.pedirEntero("");
            switch (opcion) {
                case 1: crearListaAleatoria(); break;
                case 2: mostrarTabla(); break;
                case 3:
                    exportarPersonalesCSV(view.pedirCadena("Nombre del fichero CSV: "));
                    break;
                case 4:
                    exportarDireccionesCSV(view.pedirCadena("Nombre del fichero CSV: "));
                    break;
                case 5:
                    String resp = view.pedirCadena("¿Seguro que quieres salir? (s/n): ");
                    if (resp.equalsIgnoreCase("s")) {
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
