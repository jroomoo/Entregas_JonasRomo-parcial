import java.util.ArrayList;

public class Concesionario {
    private ArrayList <Coche> concesionario;

    public Concesionario(ArrayList<Coche> concesionario) {
        this.concesionario = concesionario;
    }

    public void imprimirConcesionario(){
        for(Coche c : concesionario){
            System.out.printf("La matricula del coche es %s, con caballos %d\n", c.getMatricula(), c.getCaballos());
        }
    }
    public void eliminarCoche(Coche c){
        concesionario.remove(c);
    }
    public void anadirCoche(Coche c){
        concesionario.add(c);
    }
}
