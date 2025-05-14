package barricada_ejercicio;

// clase barricada
public class ValidadorUsuario {

    public static String validarCorreo (String correo) {
        if (correo != null && correo.contains("@") && correo.contains(".")) {
            return correo;
        }
        return null;
    }
    // implementar método: validarCorreo(String correo)
    // aceptar emial que contengan @ y .
    public static String validarContrasena (String contrasena) {
        if (contrasena != null && contrasena.length() >= 9) {
            return contrasena;
        }
        return null;
    }

    public static Integer validarEdad (String edadTexto) {
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad >= 15 && edad <= 50) {
                return edad;
            }
        } catch (NumberFormatException e) {
        }
        return null;
    }

    // implementar método: validarContrasena(String contrasena)
    // constraseña debe tener longitud mayor o igual a 8


    // implementar método: validarEdad(String edadTexto)
    // edad debe ser mayor o gual a 15 y menor o igual a 50
    
}
