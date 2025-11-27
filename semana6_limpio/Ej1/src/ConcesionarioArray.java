public class ConcesionarioArray {
    private Coche[] coches;

    public ConcesionarioArray() {
        coches = new Coche[0]; // Inicialmente vacío
    }

    // CREATE: Añadir coche
    public void anadirCoche(Coche c) {
        Coche[] nuevo = new Coche[coches.length + 1];
        for (int i = 0; i < coches.length; i++) {
            nuevo[i] = coches[i];
        }
        nuevo[coches.length] = c;
        coches = nuevo;
    }

    // READ: Imprimir concesionario
    public void imprimirConcesionario() {
        if (coches.length == 0) {
            System.out.println("No hay coches en el concesionario.");
        } else {
            for (int i = 0; i < coches.length; i++) {
                System.out.println(i + ": " + coches[i]);
            }
        }
    }

    // UPDATE: Modificar caballos por índice
    public void actualizarCoche(int indice, int caballos) {
        if (indice >= 0 && indice < coches.length) {
            coches[indice].setCaballos(caballos);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void eliminarCoche(int indice) {
        if (indice >= 0 && indice < coches.length) {
            Coche[] nuevo = new Coche[coches.length - 1];
            for (int i = 0, j = 0; i < coches.length; i++) {
                if (i != indice) {
                    nuevo[j++] = coches[i];
                }
            }
            coches = nuevo;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public int tamaño() {
        return coches.length;
    }
    public void imprimirConcesionarioArray() {
    if (coches.length == 0) {
        System.out.println("No hay coches en el concesionario.");
        return;
    }

    for (int i = 0; i < coches.length; i++) {
        System.out.println(
            i + ": Matricula=" + coches[i].getMatricula() +
            ", Caballos=" + coches[i].getCaballos()
        );
    }
}

}
