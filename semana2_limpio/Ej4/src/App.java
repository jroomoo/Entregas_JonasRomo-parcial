import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); //Sirve para limpiar el buffer después de leer un entero que tiene un salto de línea pendiente
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
    }
}
