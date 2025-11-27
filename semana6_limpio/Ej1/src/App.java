import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Crear coches con matrícula y caballos
        Coche c1 = new Coche("1111AAA", 110);
        Coche c2 = new Coche("2222BBB", 150);
        Coche c3 = new Coche("3333CCC", 200);

        // --- CONCESIONARIO CON ARRAYLIST ---
        ArrayList<Coche> lista = new ArrayList<>();
        Concesionario concesionarioList = new Concesionario(lista);

        concesionarioList.anadirCoche(c1);
        concesionarioList.anadirCoche(c2);
        concesionarioList.anadirCoche(c3);

        System.out.println("=== Concesionario ArrayList: Tras añadir coches ===");
        concesionarioList.imprimirConcesionario();

        concesionarioList.eliminarCoche(c2);

        System.out.println("\n=== Concesionario ArrayList: Tras eliminar un coche ===");
        concesionarioList.imprimirConcesionario();

        // --- CONCESIONARIO CON ARRAY ---
        ConcesionarioArray concesionarioArray = new ConcesionarioArray();

        concesionarioArray.anadirCoche(c1);
        concesionarioArray.anadirCoche(c2);
        concesionarioArray.anadirCoche(c3);

        System.out.println("\n=== Concesionario Array: Tras añadir coches ===");
        concesionarioArray.imprimirConcesionarioArray();

        concesionarioArray.eliminarCoche(1); // eliminar el segundo coche (c2)

        System.out.println("\n=== Concesionario Array: Tras eliminar un coche ===");
        concesionarioArray.imprimirConcesionarioArray();
    }
}
