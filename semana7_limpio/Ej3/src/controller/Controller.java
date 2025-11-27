package controller;

import model.Persona;
import view.View;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {

    private ArrayList<Persona> personas = new ArrayList<>();
    private View view;

    

    public Controller(ArrayList<Persona> personas, View view) {
        this.personas = personas;
        this.view = view;
        view.setController(this);
    }

    public void iniciar() {
        int opcion;
        do {
            view.mostrarMenu();           // Mostrar menú en cada iteración
            opcion = view.leerOpcion();   // Leer la opción del usuario

            switch (opcion) {
                case 1:
                    agregarPersona();
                    break;
                case 2:
                    eliminarPersona();
                    break;
                case 3:
                    modificarPersona();
                    break;
                case 4:
                    listarPersonas();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);
    }

    private void agregarPersona() {
        String nombre = view.leerNombre();
        int edad = view.leerEdad();
        double altura = view.leerAltura();

        personas.add(new Persona(nombre, edad, altura));
        System.out.println("Persona agregada correctamente.");
    }

    private void eliminarPersona() {
        String nombre = view.leerNombre();
        boolean eliminado = false;

        Iterator<Persona> iterator = personas.iterator();
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getNombre().equals(nombre)) {
                iterator.remove();
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            System.out.println("Persona eliminada correctamente.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private void modificarPersona() {
        String nombre = view.leerNombre();
        Persona personaAModificar = null;

        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                personaAModificar = persona;
                break;
            }
        }

        if (personaAModificar != null) {
            System.out.println("Ingrese los nuevos datos:");
            String nuevoNombre = view.leerNombre();
            int nuevaEdad = view.leerEdad();
            double nuevaAltura = view.leerAltura();

            personaAModificar.setNombre(nuevoNombre);
            personaAModificar.setEdad(nuevaEdad);
            personaAModificar.setAltura(nuevaAltura);

            System.out.println("Persona modificada correctamente.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }

    private void listarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No hay personas en la lista.");
            return;
        }

        System.out.println("\n=== LISTA DE PERSONAS ===");
        for (Persona persona : personas) {
            System.out.println(persona.getEstadoComoString());
        }
    }
}
