package view;

import controller.Controller;

public class View {
    Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void mostrarLinea(String s) {
        System.out.println(s);
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje);
        try {
            return Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            return -1;
        }
    }

    public String pedirCadena(String mensaje) {
        System.out.print(mensaje);
        return System.console().readLine();
    }

    public void mostrarMenu() {
        System.out.println("\n===== MENÚ PRINCIPAL =====");
        System.out.println("1. Volver a crear la lista de alumnos");
        System.out.println("2. Mostrar tabla de alumnos");
        System.out.println("3. Exportar datos personales (CSV)");
        System.out.println("4. Exportar direcciones (CSV)");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
