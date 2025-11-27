import com.coti.tools.Esdia;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Bucle principal del menú
        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== MENÚ BIBLIOTECA ===");
            System.out.println("1. Añadir libro");
            System.out.println("2. Mostrar biblioteca");
            System.out.println("3. Actualizar título de un libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");

            int opcion = Esdia.readInt("Selecciona una opción: ");

            switch (opcion) {
                case 1:
                    String isbnAdd = Esdia.readString("ISBN: ");
                    String tituloAdd = Esdia.readString("Título: ");
                    Libro libroAdd = new Libro(isbnAdd, tituloAdd);
                    biblioteca.addBook(libroAdd);
                    System.out.println("Libro añadido correctamente.");
                    break;

                case 2:
                    System.out.println("=== Biblioteca ===");
                    biblioteca.showBiblioteca();
                    break;

                case 3:
                    String isbnUpdate = Esdia.readString("ISBN del libro a actualizar: ");
                    Libro libroUpdate = biblioteca.getBook(isbnUpdate);
                    if (libroUpdate != null) {
                        String nuevoTitulo = Esdia.readString("Nuevo título: ");
                        libroUpdate.setTitle(nuevoTitulo);
                        System.out.println("Título actualizado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    String isbnRemove = Esdia.readString("ISBN del libro a eliminar: ");
                    Libro libroRemove = biblioteca.getBook(isbnRemove);
                    if (libroRemove != null) {
                        biblioteca.removeBook(libroRemove);
                        System.out.println("Libro eliminado.");
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
