package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiniela {

    public static final int NUMERO_PARTIDOS = 15;

    private Partido[] partidos;

    public Quiniela() {
        this.partidos = new Partido[NUMERO_PARTIDOS];
    }

    public Quiniela(Partido[] partidos) {
        if (partidos.length != NUMERO_PARTIDOS) {
            throw new IllegalArgumentException("El número de partidos no es correcto");
        }
        this.partidos = partidos;
    }

    public void setPartido(int index, Partido partido) {
        if (index < 0 || index >= NUMERO_PARTIDOS)
            throw new IndexOutOfBoundsException("Índice fuera de rango en Quiniela.");
        partidos[index] = partido;
    }

    public Partido[] getPartidos() {
        return partidos;
    }
    

    public String obtenerTablaQuiniela() {

        String tabla = "";

        int totalLength = Partido.COLUMNAS[0] + Partido.COLUMNAS[1] + Partido.COLUMNAS[2] + 10;

        String lineaCabecera =
                "|" + " ".repeat((totalLength - 10) / 2) + "QUINIELA" +
                " ".repeat((totalLength - 10) / 2) + "|";
        String lineaSeparacion = "+" + "-".repeat(totalLength - 3) + "+";

        tabla += lineaSeparacion + "\n";
        tabla += lineaCabecera + "\n";
        tabla += lineaSeparacion + "\n";

        for (Partido p : partidos) {
            tabla += p.asRowTable() + "\n";
        }
        tabla += lineaSeparacion;

        return tabla;
    }
     public static ArrayList<Partido> crearPartidosDesdeFichero(File ficheroTxt, String separator) {
        ArrayList<Partido> lista = new ArrayList<>();

        if (!ficheroTxt.exists() || !ficheroTxt.isFile()) {
            System.out.println("Error: fichero no encontrado.");
            return lista;
        }

        try (Scanner sc = new Scanner(ficheroTxt)) {
            while (sc.hasNextLine() && lista.size() < NUMERO_PARTIDOS) {
                String linea = sc.nextLine();
                String[] equipos = linea.split(separator);
                if (equipos.length != 2) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }
                String equipoLocal = equipos[0];
                String equipoVisitante = equipos[1];

                Partido partido = new Partido(equipoLocal, equipoVisitante);
                lista.add(partido);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el fichero: " + e.getMessage());
        }

        return lista;
    }

}
