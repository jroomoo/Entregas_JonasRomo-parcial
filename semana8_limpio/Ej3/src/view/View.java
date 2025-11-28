package view;

import com.coti.tools.Esdia;

public class View {

    public void mostrarLinea(String s) {
        System.out.println(s);
    }

    public void mostrarTabla(String tabla) {
        System.out.println(tabla);
    }

    public int pedirEntero(String mensaje) {
        return Esdia.readInt(mensaje);
    }

    public String pedirCadena(String mensaje) {
        return Esdia.readString(mensaje);
    }

    public boolean confirmar(String mensaje) {
        String r = Esdia.readString(mensaje + " (s/n): ");
        return r.equalsIgnoreCase("s");
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Mostrar listado de personas");
        System.out.println("2. Importar desde fichero TSV");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
