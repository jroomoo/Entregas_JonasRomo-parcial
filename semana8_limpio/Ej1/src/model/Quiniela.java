package model;

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

}
