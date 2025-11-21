public class App {
    public static void main(String[] args) {

        int edad = Lectura.leerInt("Ingrese su edad: ");
        float temperatura = Lectura.leerFloat("Ingrese temperatura (float): ");
        double altura = Lectura.leerDouble("Ingrese altura (double): ");
        char inicial = Lectura.leerChar("Ingrese la inicial de su nombre: ");
        String nombre = Lectura.leerString("Ingrese su nombre completo: ");

        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Edad: " + edad);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Nombre: " + nombre);
    }
}
