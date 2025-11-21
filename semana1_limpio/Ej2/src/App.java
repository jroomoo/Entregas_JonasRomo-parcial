import java.util.Scanner;

public class App {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        float num1 = sc.nextFloat();
        System.out.print("Introduce el segundo número: ");
        float num2 = sc.nextFloat();
        float suma = num1 + num2;
        System.out.println("La suma de ambos números es: " + suma);
    }
}
