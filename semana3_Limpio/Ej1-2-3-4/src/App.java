import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

            Person[] personas = new Person[1];
            for (int i = 0; i < 1; i++) {
                try{
                    String nombre = Esdia.readString("Nombre: ");
                    float peso = Esdia.readFloat("Peso  : ");
                    float altura = Esdia.readFloat("Altura : ");
                    personas[i] = new Person(nombre, peso, altura);

                } catch (Exception e){
                    System.err.println("Error al coger los valores de la persona");
                }
                
            }

        for (int i = 0; i < 1; i++) {
            Person p = personas[i];
            showP(i, p);
        }
        for (int i = 0; i < 1; i++) {
            Person p = personas[i];
            System.out.printf("El IMC es %.2f",p.getIMC());
        }
       
    }



    // "Funciones para facilitar (coger lo que quiera click derecho refactor y method)"
    private static void showP(int i, Person p) {
        System.out.printf("Persona %d: %s - Peso: %.2f kg - Altura: %.2f cm%n",
                          i, p.getName(), p.getWeigthInKg(), p.getHeightInMeters());
    }
}