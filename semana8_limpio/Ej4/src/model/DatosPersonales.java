package model;

import java.util.Random;

public class DatosPersonales {
    private String nombre;
    private String apellidos;
    private int edad;
    private String NIF;

    public DatosPersonales(String nombre, String apellidos, int edad, String NIF) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.NIF = NIF;
    }

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }
    public String getNIF() { return NIF; }

    public String filaCSV() {
        return nombre + "," + apellidos + "," + edad + "," + NIF;
    }

    public static DatosPersonales crearAleatorio(int id) {
        Random r = new Random();
        String[] nombres = {"Juan", "Ana", "Pedro", "Lucia", "Carlos"};
        String[] apellidos = {"Perez", "Gomez", "Lopez", "Martinez", "Sanchez"};
        String nombre = nombres[r.nextInt(nombres.length)];
        String apellido = apellidos[r.nextInt(apellidos.length)] + " " + apellidos[r.nextInt(apellidos.length)];
        int edad = 18 + r.nextInt(10); 
        String NIF = "NIF" + id; // Pa que sea unico
        return new DatosPersonales(nombre, apellido, edad, NIF);
    }
}
