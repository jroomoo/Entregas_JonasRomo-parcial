package view;
import com.coti.tools.Esdia;
import controller.Controller;
public class View {
    private Controller controller;
    public void mostrarMenu() {
        System.out.println("=== MENÚ ===");
        System.out.println("1.- Leer los números");
        System.out.println("2. Calcular la suma");
        System.out.println("3. Mostrar suma");
        System.out.println("q: Salir");
    }
    public int leerNumero(){
        return Esdia.readInt("Pon un numero");
    }
    public String leerOpcion(){
        return Esdia.readString("");
    }
    public void mostarSuma(){
        System.out.println("La suma es " + controller.getSum());
    }
    public void setController(Controller controller) {
       this.controller=controller;
    }
}
