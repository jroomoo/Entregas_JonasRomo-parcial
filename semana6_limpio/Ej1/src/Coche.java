public class Coche {
    private String matricula;
    private int caballos;

    public Coche(String matricula, int caballos) {
        this.matricula = matricula;
        this.caballos = caballos;
    }

    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

}
