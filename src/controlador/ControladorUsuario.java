package controlador;

import modelo.Usuario;
import bbdd.UsuariosBD;
import java.util.ArrayList;
import vista.Registro;

public class ControladorUsuario {
    public String AnadirUsuarios(Usuario usuario){
        if(usuario.getTelefono().length() > 12){
            return "telefono";
        }
        UsuariosBD usuarios = new UsuariosBD();
        usuarios.AnadirUsuariosBD(usuario);
        new Registro();
        return "hecho";
    }  
    
    public String IniciarSesion(Usuario usuario) {
        String rol = new UsuariosBD().ConsultarInicioSesion(usuario);
       
        return rol;
    }
}
