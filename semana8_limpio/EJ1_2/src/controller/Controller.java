package controller;

import model.Partido;
import model.Quiniela;
import view.View;

import java.io.File;
import java.util.ArrayList;

public class Controller {

    private Quiniela quiniela;
    private View view;
    private String separator = "-";

    public Controller(View view, Quiniela quiniela) {
        this.view = view;
        this.quiniela = quiniela;

        // Registrar el controlador en la vista
        view.getController(this);
    }

    public void iniciar() {
        // Leer los partidos desde el fichero "equipos.txt"
        File fichero = new File("equipos.txt"); // ruta relativa
        if (!fichero.exists() || !fichero.isFile()) {
            view.mostrarMensaje("Error: No se encontró el fichero equipos.txt.");
            return;
        }

        // Crear partidos desde el fichero usando la factory
        ArrayList<Partido> lista = Quiniela.crearPartidosDesdeFichero(fichero, separator);

        // Asignar los partidos al array de Quiniela
        for (int i = 0; i < lista.size(); i++) {
            quiniela.setPartido(i, lista.get(i));
        }

        // Pedir goles al usuario para cada partido
        for (int i = 0; i < Quiniela.NUMERO_PARTIDOS; i++) {
            Partido p = quiniela.getPartidos()[i];
            view.mostrarMensaje(
                    "\n--- PARTIDO " + (i + 1) + ": " + p.getEquipoLocal() + " vs " + p.getEquipoVisitante() + " ---");

            int golesLocal = view.pedirEntero("Introduce los goles del equipo local: ");
            int golesVisitante = view.pedirEntero("Introduce los goles del equipo visitante: ");

            p.setGolesLocal(golesLocal);
            p.setGolesVisitante(golesVisitante);
        }

        // Mostrar la quiniela completa
        view.mostrarQuiniela(quiniela.obtenerTablaQuiniela());
    }
}
