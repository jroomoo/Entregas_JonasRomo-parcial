public class Person {
    // ATRIBUTOS
    private String name;
    private float weigthInKg;
    private float heightInMeters;

    // CONSCTRUCTORES CTORES

    // CTOR SIN PARÁMETROS
    public Person(){
        name = "NombrePorDefecto";
        weigthInKg = 80.0f;
        heightInMeters = 1.80f;
    }
    // CTOR CON PARÁMETROS
    public Person(String name, float weigthInKg, float heightInMeters) {
        this.name = name;
        this.weigthInKg = weigthInKg;
        this.heightInMeters = heightInMeters;
    }
    // MÉTODOS //

    // Métodos logica de negocio
    public Float getIMC() {
        heightInMeters = heightInMeters / 100; 
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
    

}