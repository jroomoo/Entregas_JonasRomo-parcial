package controller;

import model.Model;
import view.View;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Model> listado;
    View view;

    public Controller(ArrayList<Model> listado, View view) {
        this.listado = listado;
        this.view = view;
        view.setController(this);
    }

    public void listadoString() {
        for (Model m : listado)
            view.mostrarLinea(m.nombreImporte());
    }

    public void iniciar() {
    boolean salir = false;
    leerTSV();
    while (!salir) {
        view.mostrarMenu();
        int opcion = view.pedirEntero("");

        switch (opcion) {
            case 1:
                listadoString(); // Muestra todas las facturas
                break;
            case 2:
                float valorMinimo = view.pedirFloat("Introduce el valor mínimo: ");
                for (Model m : listado) {
                    if (m.darValor() > valorMinimo) {
                        view.mostrarLinea(m.nombreImporte());
                    }
                }
                break;
            case 3:
                String ficheroCSV = view.pedirCadena("Introduce el nombre del fichero CSV: ");
                exportarCSV(ficheroCSV);
                break;
            case 4:
                String ficheroHTML = view.pedirCadena("Introduce el nombre del fichero HTML: ");
                exportarHTML(ficheroHTML);
                break;
            case 5:
                salir = true;
                view.mostrarLinea("Saliendo del programa...");
                break;
            default:
                view.mostrarLinea("Opción no válida.");
        }
    }
}

    public void exportarCSV(String fichero) {
        try (FileWriter fw = new FileWriter(fichero)) {
            for (Model m : listado) {
                fw.write(m.getConcepto() + "," + m.getDescuento() + "," + m.getFecha() + "," +
                        m.getImporte() + "," + m.getNIF() + "," + m.getNombre() + "," +
                        m.getDireccion() + "," + m.getIva() + "\n");
            }
            view.mostrarLinea("CSV exportado correctamente.");
        } catch (Exception e) {
            view.mostrarLinea("Error exportando CSV: " + e.getMessage());
        }

    }

    public void exportarHTML(String fichero) {
        String tabla = "<table border='1'><tr><th>Concepto</th><th>Descuento</th><th>Fecha</th>" +
                "<th>Importe</th><th>NIF</th><th>Nombre</th><th>Dirección</th><th>IVA</th></tr>";

        for (Model m : listado) {
            tabla += "<tr><td>" + m.getConcepto() + "</td><td>" + m.getDescuento() + "</td><td>" +
                    m.getFecha() + "</td><td>" + m.getImporte() + "</td><td>" + m.getNIF() + "</td><td>" +
                    m.getNombre() + "</td><td>" + m.getDireccion() + "</td><td>" + m.getIva() + "</td></tr>";
        }

        tabla += "</table>";
        String html = "<html><body>%%TABLA%%</body></html>";
        html = html.replace("%%TABLA%%", tabla);

        try (FileWriter fw = new FileWriter(fichero)) {
            fw.write(html);
            view.mostrarLinea("HTML exportado correctamente.");
        } catch (Exception e) {
            view.mostrarLinea("Error exportando HTML: " + e.getMessage());
        }
    }

    public void  leerTSV(){
        File file = new File("facturas.tsv");
        String delimitador = "\t";
        listado = Model.crearDesdeFichero(file, delimitador); //OJO QUE ES ESTATICO EL METODO
    }
}
