public class App {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Error: Debes introducir exactamente 3 argumentos: <nombre> <peso> <altura>");
            return;
        }
        Usuario usuario;
        try{
            usuario = Usuario.createUserForStrings(args);
        } catch (Exception e) {
            System.err.println("Error al crear el usuario: ");
            return;
        }

        if (usuario == null) {
            System.err.println("Error: No se pudo crear el usuario. Revisa los parámetros.");
            return;
        }

        // Imprimir tabla con encabezado y fila de datos
        System.out.println(Usuario.obtainUserHeader());
        System.out.println(usuario.obtainUserAsRow());
    }
}