package controller;

import model.Partido;
import model.Quiniela;
import view.View;

public class Controller {

    private Quiniela quiniela;
    private View view;

    public Controller(View view, Quiniela quiniela) {
        this.view = view;
        this.quiniela = quiniela;

        // Como pediste
        view.getController(this);
    }

    public void iniciar() {

        // Pedir datos de los partidos
        for (int i = 0; i < Quiniela.NUMERO_PARTIDOS; i++) {

            view.mostrarMensaje("\n--- PARTIDO " + (i + 1) + " ---");

            String equipoLocal = view.pedirString("Introduce el equipo local: ");
            String equipoVisitante = view.pedirString("Introduce el equipo visitante: ");
            int golesLocal = view.pedirEntero("Introduce los goles del equipo local: ");
            int golesVisitante = view.pedirEntero("Introduce los goles del equipo visitante: ");

            Partido partido = new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);

            quiniela.setPartido(i, partido);
        }

        // Mostrar la quiniela completa
        view.mostrarQuiniela(quiniela.obtenerTablaQuiniela());
    }
}
