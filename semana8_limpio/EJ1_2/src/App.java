import controller.Controller;
import model.Quiniela;
import view.View;

public class App {
    public static void main(String[] args) {

        Quiniela quiniela = new Quiniela();
        View view = new View();

        Controller controller = new Controller(view, quiniela);

        controller.iniciar();
    }
}
