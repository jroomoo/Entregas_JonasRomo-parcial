public class Alumno {
    String nombre;
    float parcial1;
    float parcial2;
    float examenFinal;
    public Alumno(String nombre, float p1, float p2, float ef) {
        this.nombre = nombre;
        this.parcial1 = p1;
        this.parcial2 = p2;
        this.examenFinal = ef;
    }

    // Calcula la nota final: 10% + 10% + 80%
    public float notaFinal() {
        return (parcial1 * 0.10f) + (parcial2 * 0.10f) + (examenFinal * 0.80f);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getParcial1() {
        return parcial1;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public float getParcial2() {
        return parcial2;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public float getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(float examenFinal) {
        this.examenFinal = examenFinal;
    }
    
}