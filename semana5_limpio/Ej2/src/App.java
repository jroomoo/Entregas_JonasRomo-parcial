import java.util.Arrays;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        String[] palabras = new String[5];
        System.out.println("Introduce 5 palabras:");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = Esdia.readString("Palabra " + (i + 1) + ": ");
        }
        Arrays.sort(palabras);
        System.out.println("\nPalabras ordenadas:");
        for (String p : palabras) {
            System.out.println(p);
        }
    }
}
