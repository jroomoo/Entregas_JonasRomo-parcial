package model;

public class DatosDeAlumno {
    private DatosPersonales personales;
    private Direccion direccion;

    public DatosDeAlumno(DatosPersonales personales, Direccion direccion) {
        this.personales = personales;
        this.direccion = direccion;
    }

    public DatosPersonales getPersonales() { return personales; }
    public Direccion getDireccion() { return direccion; }

    public static DatosDeAlumno crearAleatorio(int id) {
        return new DatosDeAlumno(DatosPersonales.crearAleatorio(id), Direccion.crearAleatoria());
    }
}
