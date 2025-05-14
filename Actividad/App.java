package barricada_ejercicio;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese su correo: ");
        String entradaCorreo = in.nextLine();

        System.out.println("Ingrese su contrasena: ");
        String entradaContrasena = in.nextLine();

        System.out.println("Ingrese su edad: ");
        String entradaEdad = in.nextLine();
        // Leer correo, contraseña y edad
     

        // Validación (barricada)
        // Guardar datos en objeto usuario en caso que todos los datos sean válidos
        // de lo contrario indicar mensaje de error 
        String correo = ValidadorUsuario.validarCorreo(entradaCorreo);
         if (correo == null) {
            System.out.println("Error: El correo debe contener '@' y '.' para ser aceptado." );
        }

        String contrasena = ValidadorUsuario.validarContrasena(entradaContrasena);
         if (contrasena == null) {
            System.out.println("Error: La contrasena debe contener al menos 9 caracteres.");
        }

        Integer edad = ValidadorUsuario.validarEdad(entradaEdad);
        if (edad == null) {
            System.out.println("Error: la edad debe ser mayor que 15 anios y menos de 50 anios.");
        }

        if (correo != null && contrasena != null && edad != null) {
            Usuario usuario = new Usuario(correo, contrasena, edad);
            System.out.println("Registro exitoso!");
            usuario.mostrarInfo(); 
        } else {
            System.out.println("El registro fallo.");
        }
    }
}
