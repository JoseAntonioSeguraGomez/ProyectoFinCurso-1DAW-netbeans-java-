package controlador;

import modelo.Usuario;
import bbdd.UsuariosBD;
import vista.Registro;

public class ControladorUsuario {
    public void AnadirUsuarios(Usuario usuario){
        UsuariosBD usuarios = new UsuariosBD();
        usuarios.AnadirUsuariosBD(usuario);
        new Registro();
    }  
}
