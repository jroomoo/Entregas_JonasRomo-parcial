
import com.coti.tools.Esdia;
public class App {
    public static void main(String[] args) {

        int numAlumnos = Esdia.readInt("¿Cuántos alumnos tiene el curso? ");
        Alumno[] alumnos = new Alumno[numAlumnos];
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("\n--- Alumno " + (i + 1) + " ---");
            String nombre = Esdia.readString("Nombre del alumno: ");
            float p1 = Esdia.readFloat("Nota parcial 1 (0-10): ");
            float p2 = Esdia.readFloat("Nota parcial 2 (0-10): ");
            float ef = Esdia.readFloat("Nota examen final (0-10): ");

            alumnos[i] = new Alumno(nombre, p1, p2, ef);
        }
        System.out.println("                       CALIFICACIONES DEL CURSO");
        System.out.println("=".repeat(80));
        System.out.printf("│ %-20s │ %8s │ %8s │ %10s │ %10s │\n", 
                "Alumno", "Parcial1", "Parcial2", "Ex.Final", "Nota Final");
        

        float sumaP1 = 0, sumaP2 = 0, sumaFinal = 0, sumaNotasFinales = 0;

        for (Alumno a : alumnos) {
            float notaFinal = a.notaFinal();
            System.out.printf("│ %-20s │ %8.2f │ %8.2f │ %10.2f │ %10.2f │\n",
                    a.nombre, a.parcial1, a.parcial2, a.examenFinal, notaFinal);
            sumaP1 += a.parcial1;
            sumaP2 += a.parcial2;
            sumaFinal += a.examenFinal;
            sumaNotasFinales += notaFinal;
        }


        System.out.println("\nMEDIAS DEL CURSO:");
        System.out.printf("  • Media Parcial 1     : %.2f\n", sumaP1 / numAlumnos);
        System.out.printf("  • Media Parcial 2     : %.2f\n", sumaP2 / numAlumnos);
        System.out.printf("  • Media Examen Final  : %.2f\n", sumaFinal / numAlumnos);
        System.out.printf("  • Media Nota Final    : %.2f\n", sumaNotasFinales / numAlumnos);
        System.out.println("\n¡Programa finalizado!");
    }
}
