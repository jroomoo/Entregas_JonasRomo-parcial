import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales. Valor: " + num1);
        }
        else if (num1 == num2 && num1 > num3) {
            System.out.println("El mayor es el 1º y el 2º (iguales). Valor: " + num1);
        } else if (num1 == num3 && num1 > num2) {
            System.out.println("El mayor es el 1º y el 3º (iguales). Valor: " + num1);
        } else if (num2 == num3 && num2 > num1) {
            System.out.println("El mayor es el 2º y el 3º (iguales). Valor: " + num2);
        }
        else if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es el 1º. Valor: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es el 2º. Valor: " + num2);
        } else {
            System.out.println("El mayor es el 3º. Valor: " + num3);
        }
    }
}
