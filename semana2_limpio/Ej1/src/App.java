import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introduzca su año de nacimiento:");
        int anoN = sc.nextInt();
        System.out.println ("Introduzca el año actual");
        int anoA = sc.nextInt();
        System.out.printf("Su edad es %d", anoA - anoN);
        sc.close();
    }
}