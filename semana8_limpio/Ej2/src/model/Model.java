package model;
import controller.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    private float descuento, importe, iva;
    private String concepto, fecha, NIF, nombre, direccion;
    public Model(float descuento, float importe, float iva, String concepto, String fecha, String nIF, String nombre,
            String direccion) {
        this.descuento = descuento;
        this.importe = importe;
        this.iva = iva;
        this.concepto = concepto;
        this.fecha = fecha;
        NIF = nIF;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public float getDescuento() {
        return descuento;
    }
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    public float getImporte() {
        return importe;
    }
    public void setImporte(float importe) {
        this.importe = importe;
    }
    public float getIva() {
        return iva;
    }
    public void setIva(float iva) {
        this.iva = iva;
    }
    public String getConcepto() {
        return concepto;
    }
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getNIF() {
        return NIF;
    }
    public void setNIF(String nIF) {
        NIF = nIF;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public float darValor(){
        return importe * (1-descuento) * (1 + iva);
    }
    public String nombreImporte(){
        return (darValor() + " " + nombre);
    }
    public static ArrayList<Model> crearDesdeFichero(File fichero, String delimiter) {
        ArrayList<Model> lista = new ArrayList<>();
        if (!fichero.exists() || !fichero.isFile()) {
            System.out.println("Error: fichero no encontrado.");
            return lista;
        }
        try(Scanner sc = new Scanner(fichero))  {
            
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] tokens = linea.split(delimiter);
                if (tokens.length != 8) { 
                    System.out.println("Línea mal formada: " + linea);
                    continue;
                }
                String concepto = tokens[0];
                float descuento = Float.parseFloat(tokens[1]);
                String fecha = tokens[2];
                float importe = Float.parseFloat(tokens[3]);
                String NIF = tokens[4];
                String nombre = tokens[5];
                String direccion = tokens[6];
                float iva = Float.parseFloat(tokens[7]);
                lista.add(new Model(descuento, importe, iva, concepto, fecha, NIF, nombre, direccion));
            }
        } catch (Exception e) {
            System.out.println("Error leyendo fichero: " + e.getMessage());
        }

        return lista;
    }
}


