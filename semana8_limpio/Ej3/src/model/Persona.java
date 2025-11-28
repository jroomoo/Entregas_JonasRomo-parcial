package model;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Persona {
    private String nombre, telefono;
    private float peso;

    public Persona(String nombre, String telefono, float peso) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.peso = peso;
    }

    public String filaTab(){
        return nombre + "\t" + telefono + "\t" + peso;
    }
    public static ArrayList<Persona> crearDesdeFichero(File fichero, String delimiter) {
        ArrayList<Persona> lista = new ArrayList<>();
        if (!fichero.exists() || !fichero.isFile()) {
            System.out.println("Error: fichero no encontrado.");
            return lista;
        }
        try(Scanner sc = new Scanner(fichero))  {
            
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] tokens = linea.split(delimiter);
                if (tokens.length != 3) { 
                    System.out.println("Línea mal formada: " + linea);
                    continue;
                }
                String nombre = tokens[0];
                String telefono = tokens[1];
                float peso = Float.parseFloat(tokens[2]);
                lista.add(new Persona(nombre, telefono, peso));
            }
        } catch (Exception e) {
            System.out.println("Error leyendo fichero: " + e.getMessage());
        }

        return lista;
    }
    
}
