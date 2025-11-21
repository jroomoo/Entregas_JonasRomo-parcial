public class Person {
    // ATRIBUTOS
    private String name;
    private float weigthInKg;
    private float heightInMeters;
    private Dni dni;
    // CONSCTRUCTORES CTORES

    // CTOR SIN PARÁMETROS
    public Person(){
        name = "NombrePorDefecto";
        weigthInKg = 80.0f;
        heightInMeters = 1.80f;
        dni = new Dni(00000000);
    }
    // CTOR CON PARÁMETROS
    public Person(String name, float weigthInKg, float heightInMeters, int number) {
        this.name = name;
        this.weigthInKg = weigthInKg;
        this.heightInMeters = heightInMeters;
        dni = new Dni(number);
    }
    // MÉTODOS //

    // Métodos logica de negocio
    public Float getIMC() {
        return (weigthInKg / (heightInMeters*heightInMeters));
    }
    // GETTERS Y SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.isEmpty() ) return;
        this.name = name;
    }
    public float getWeigthInKg() {
        return weigthInKg;
    }
    public void setWeigthInKg(float weigthInKg) {
        if(weigthInKg < 0) return;
        this.weigthInKg = weigthInKg;
    }
    public float getHeightInMeters() {
        return heightInMeters;
    }
    public void setHeightInMeters(float heightInMeters) {
        if (heightInMeters < 0) return;
        this.heightInMeters = heightInMeters;
    }
    public Dni getDni() {
        return dni;
    }
    public void setDni(Dni dni) {
        this.dni = dni;
    }
    

}