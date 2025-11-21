


public class App {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Juan", 75.0f, 1.75f, 76743940);
        System.out.println(p); 
        System.out.println("Nombre: " + p.getName());
        System.out.println("Peso: " + p.getWeigthInKg() + " kg");
        System.out.println("Altura: " + p.getHeightInMeters() + " m");
        System.out.printf("DNI: %d%c%n", p.getDni().getNumber(), p.getDni().getLetter());
    }
}
