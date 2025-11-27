import controller.Controller;
import view.View;

public class App {
    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.iniciar();
    }
}
