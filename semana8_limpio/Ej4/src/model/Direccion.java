package model;

import java.util.Random;

public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String letra;

    public Direccion(String calle, int numero, int piso, String letra) {
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.letra = letra;
    }

    public String getCalle() { return calle; }
    public int getNumero() { return numero; }
    public int getPiso() { return piso; }
    public String getLetra() { return letra; }

    public String filaCSV() {
        return calle + "," + numero + "," + piso + "," + letra;
    }

    public static Direccion crearAleatoria() {
        Random r = new Random();
        String[] calles = {"Gran Via", "Mayor", "Salamanca", "Calle Luna", "Calle Sol"};
        String calle = calles[r.nextInt(calles.length)];
        int numero = 1 + r.nextInt(100);
        int piso = r.nextInt(10);
        char letra = (char) ('A' + r.nextInt(5));
        return new Direccion(calle, numero, piso, String.valueOf(letra));
    }
}
