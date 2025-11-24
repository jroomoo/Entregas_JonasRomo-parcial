public class App {
    public static void main(String[] args) {
        System.out.println("Número de argumentos: " + args.length);
        if (args.length != 2) {
            System.err.println("Error: Debes introducir exactamente 2 argumentos numéricos.");
            return;
        }
        try {
            // Convertir argumentos
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Mostrar suma
            int suma = num1 + num2;
            System.out.println("La suma es: " + suma);

        } catch (NumberFormatException e) {
            System.err.println("Error: Ambos argumentos deben ser números válidos.");
        }
    }
}
