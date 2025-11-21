import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();
        int anchoNombre;
        if (nombre.length() < "Nombre".length()) {
            anchoNombre = "Nombre".length();
        } else {
            anchoNombre = nombre.length();
        }
        int anchoApellidos;
        if (apellidos.length() < "Apellidos".length()) {
            anchoApellidos = "Apellidos".length();
        } else {
            anchoApellidos = apellidos.length();
        }
        int anchoTotal = anchoNombre + anchoApellidos + 5;
        imprimirLinea(anchoTotal);

        System.out.print("* ");
        System.out.print("Nombre");
        imprimirEspacios(anchoNombre - "Nombre".length());
        System.out.print(" * ");
        System.out.print("Apellidos");
        imprimirEspacios(anchoApellidos - "Apellidos".length());
        System.out.println(" *");

        imprimirLinea(anchoTotal);

        System.out.print("* ");
        System.out.print(nombre);
        imprimirEspacios(anchoNombre - nombre.length());
        System.out.print(" * ");
        System.out.print(apellidos);
        imprimirEspacios(anchoApellidos - apellidos.length());
        System.out.println(" *");

        imprimirLinea(anchoTotal);
    }

    public static void imprimirLinea(int ancho) {
        for (int i = 0; i < ancho; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void imprimirEspacios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(" ");
        }
    }
}
