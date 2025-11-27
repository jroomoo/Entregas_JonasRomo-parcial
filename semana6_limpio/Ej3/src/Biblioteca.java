import java.util.HashMap;
public class Biblioteca {
    HashMap <String, Libro> library;
    
    public Biblioteca(){
        library = new HashMap<>();
    }

    public Biblioteca(HashMap<String, Libro> library) {
        this.library = library;
    }

    public void showBiblioteca() {
        System.out.println("--------------------------------------");
        
        for (Libro book : library.values()) {
            book.showLibro();
        }
    }
    public void addBook(Libro book){
        library.put(book.getISBN(), book);
    }
    public void removeBook(Libro book){
        library.remove(book.getISBN());
    }
    public Libro getBook(String isbn){
       return library.get(isbn);
    }


    
}
