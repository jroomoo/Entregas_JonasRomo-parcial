package modelo;
import java.util.ArrayList;

public class Videoteca {

    private ArrayList<Pelicula> peliculas;
    private float velocidad;

    public Videoteca() {
        peliculas = new ArrayList<Pelicula>();
        velocidad = 1; 
    }

    public void resetearVideoteca() {
        peliculas.clear();
    }

    public boolean addPelicula(Pelicula p) {
        return peliculas.add(p);
    }

    public void setVelocidadReproduccion(float velocidad) {
        if (velocidad > 0) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad debe ser mayor que 0.");
        }
    }

    public void mostrarVideoteca() {
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| PELÍCULAS EN LA VIDEOTECA                                                                                                   |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| Título         | Año Estreno | Director            | Oscar ganado | Duración (min) | Tiempo visionado (min) | Valoración |");
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");

        double tiempoTotal = 0;
        double valoracionTotal = 0;

        for (Pelicula p : peliculas) {
            System.out.println(p.obtenerPeliculaComoFila(velocidad));
            tiempoTotal += p.getDuracionMinutos() / velocidad;
            valoracionTotal += p.getValoracion();
        }

        double valoracionMedia = (peliculas.size() > 0) 
                                   ? valoracionTotal / peliculas.size() 
                                   : 0;

        System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
        System.out.printf("| Tiempo de visionado total de la videoteca: %.2f min |%n", tiempoTotal);
        System.out.printf("| Valoración media de la videoteca: %.2f |%n", valoracionMedia);
        System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
}
