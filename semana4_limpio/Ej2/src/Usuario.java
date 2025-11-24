public class Usuario {
    private String name;
    private float w; 
    private float h; 

    // Constructor
    public Usuario(String name, String w, String h) {
        this.name = name;
        this.w = Float.parseFloat(w);
        this.h = Float.parseFloat(h);
    }
    public static String obtainUserHeader() {
        return String.format("[%10s][%10s][%10s][%10s]", "Name", "Weight", "Height", "IMC");
    }

    // Método que devuelve una fila de la tabla con los datos y el IMC
    public String obtainUserAsRow() {
        return String.format("[%10s][%10.2f][%10.2f][%10.2f]", this.name, w, h, obtainIMC());
    }

    // Factory Method para crear un Usuario desde un array de Strings
    public static Usuario createUserForStrings(String[] datos) {
        if (datos.length != 3) return null;
        try {
            return new Usuario(datos[0], datos[1], datos[2]);
        } catch (NumberFormatException e) {
            System.err.println("ERROR: Peso y altura deben ser números válidos.");
            return null;
        }
    }

    // Método que calcula el IMC correctamente
    public float obtainIMC() {
        if (h <= 0) return 0; // evitar división por cero
        return this.w / (this.h * this.h);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getW() {
        return w;
    }
    public void setW(float w) {
        this.w = w;
    }
    public float getH() {
        return h;
    }
    public void setH(float h) {
        this.h = h;
    }
    
    // Getters y setters
    
}
