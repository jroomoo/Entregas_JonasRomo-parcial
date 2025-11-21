import java.io.*;
public class App {
    public static void main(String[] args) {
        Console con = System.console();
        if (con != null){
            try {
                System.out.println("Introduzca su año de nacimiento");
                String cadenaLeida = con.readLine();
                int anoN = Integer.parseInt(cadenaLeida);
                System.out.println("Introduzca año actual");
                cadenaLeida = con.readLine();
                int anoA = Integer.parseInt(cadenaLeida);
                System.out.printf("Su edad es %d", anoA - anoN);
                
            } catch (Exception e) {
                System.err.println("ERROR");
            }
            
        }
    }
}