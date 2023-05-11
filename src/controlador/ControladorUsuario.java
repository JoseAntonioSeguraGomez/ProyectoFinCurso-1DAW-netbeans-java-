package controlador;

import modelo.Usuario;
import bbdd.UsuariosBD;
import java.util.ArrayList;
import vista.*;

public class ControladorUsuario {
    public String AnadirUsuarios(Usuario usuario){
        UsuariosBD usuarios = new UsuariosBD();
        String existe = usuarios.ExisteUsuario(usuario);
        
        if(existe != null){
            return "existe";
        }else if(usuario.getUsuario().equals("") || usuario.getContrasena().equals("") || usuario.getNombre().equals("") || usuario.getTelefono().equals("") || usuario.getApellidos().equals("") || usuario.getNacimiento().equals("") || usuario.getGmail().equals("")|| usuario.getPais().equals("")){
            return "vacio";
        } else if(usuario.getUsuario().length() < 4) {
            return "usuarioCorto";
        } else if(usuario.getContrasena().length() < 6) {
            return "contrasenaCorto";
        }  else if (!usuario.getContrasena().matches(".*[a-zA-Z].*")) {
            return "contrasenaSinCaracter";
        } else if (!usuario.getContrasena().matches(".*\\d.*")) {
            return "contrasenaSinNumero";
        } else if(usuario.getTelefono().length() < 9) {
            return "telefono";
        } else if(!usuario.getGmail().contains("@")) {
            return "gmailIncorrecto";
        } else if (!usuario.getNacimiento().matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "nacimientoIncorrecto";
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
}
