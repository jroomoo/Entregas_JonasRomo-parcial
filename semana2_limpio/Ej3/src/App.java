import java.util.Scanner;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        boolean f = true;
        while (f) {
            try {
                System.out.println("Introduzca N > 0");
                N = sc.nextInt();
                if (N <= 0) {
                    System.out.println("N debe ser mayor que 0. Intenta de nuevo.");
                } else {
                    f = false; 
                }
            } catch (Exception e) {
                System.out.println("N no es válido. Intenta de nuevo.");
            }
        }
        float sum = 0;
        for (int i = 0; i < N; i++){
            float m = Esdia.readFloat("Introduzca un número real: ");
            sum += m;
        }
        System.out.printf("la media es %.4f", sum / N);
    }
}
