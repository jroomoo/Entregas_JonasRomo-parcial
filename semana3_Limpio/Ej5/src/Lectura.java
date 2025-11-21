import java.util.Scanner;

public class Lectura {
    private static Scanner sc = new Scanner(System.in);

    public static int leerInt(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número entero válido.");
            }
        }
    }

    public static float leerFloat(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            try {
                return Float.parseFloat(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número decimal tipo float válido.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un número decimal tipo double válido.");
            }
        }
    }

    public static char leerChar(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            if (entrada.length() == 1) {
                return entrada.charAt(0);
            } else {
                System.out.println("Error: debe ingresar un solo carácter.");
            }
        }
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }
}
