package controlador;

import modelo.Usuario;
import bbdd.UsuariosBD;
import java.util.ArrayList;
import vista.*;

public class ControladorUsuario {
    public String AnadirUsuarios(Usuario usuario){
        UsuariosBD usuarios = new UsuariosBD();
        String existe = usuarios.ExisteUsuario(usuario);
        String telefonoString = String.valueOf(usuario.getTelefono());

        if(existe != null){
            return "El usuario escrito ya existe, escriba otro";
        }else if(usuario.getUsuario().equals("") || usuario.getContrasena().equals("") || usuario.getNombre().equals("") || telefonoString.equals("") || usuario.getApellidos().equals("") || usuario.getNacimiento().equals("") || usuario.getGmail().equals("")|| usuario.getPais().equals("")){
            return "Alguno de los campos obigatorios está vacio";
        } else if(usuario.getUsuario().length() < 4) {
            return "El nombre del usuario es demasiado corto";
        } else if(usuario.getContrasena().length() < 6) {
            return "La contraseña es demasiado corta";
        }  else if (!usuario.getContrasena().matches(".*[a-zA-Z].*")) {
            return "Debes introducir como mínimo algún caracter en la contraseña";
        } else if (!usuario.getContrasena().matches(".*\\d.*")) {
            return "Debes introducir como mínimo algún digito en la contraseña";
        } else if(telefonoString.length() < 9) {
            return "Has introducido de manera incorrecta el número de teléfono";
        } else if(!usuario.getGmail().contains("@")) {
            return "El formato de gmail es incorrecto";
        } else if (!usuario.getNacimiento().matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "El formato de nacimiento es incorrecto (*año-mes-dia*)";
        } else{
            usuarios.AnadirUsuariosBD(usuario);
            new Menu();
            return "hecho";
        }

    }  
    
    public String IniciarSesion(Usuario usuario) {
        String rol = new UsuariosBD().ConsultarInicioSesion(usuario);
       
        return rol;
    }
    
    public Usuario recogerDatosUsuario(Usuario usuario){
        String[] datos = new UsuariosBD().recogerDatos(usuario);
        String usuarioNombre = datos[0];
        String contrasena = datos[1];
        String nombre = datos[2];
        String apellidos = datos[3];
        String nacimiento = datos[4];
        int telefono = Integer.parseInt(datos[5]);
        String gmail = datos[6];
        String pais = datos[7];
        String provincia = datos[8];
        String ciudad = datos[9];
        String rol = datos[10];
        float fondos = Float.parseFloat(datos[11]);

        Usuario usuario1 = new Usuario(usuarioNombre, contrasena, nombre, apellidos, nacimiento, telefono, gmail, pais, provincia, ciudad, rol, fondos);
        return usuario1;
    }
}
