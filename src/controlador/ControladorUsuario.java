package controlador;

import modelo.Usuario;
import bbdd.UsuariosBD;
import java.util.ArrayList;
import vista.Registro;

public class ControladorUsuario {
    public void AnadirUsuarios(Usuario usuario){
        UsuariosBD usuarios = new UsuariosBD();
        usuarios.AnadirUsuariosBD(usuario);
        new Registro();
    }  
    
    public String IniciarSesion(Usuario usuario) {
        ArrayList<String> lista = new UsuariosBD().ConsultarInicioSesion(usuario);

        if (lista != null && lista.size() >= 12) {
            String rol = lista.get(11);

            if (rol.equals("Cliente")) {
                return "Cliente";
            } else {
                return "root";
            }
        }

        return null;
    }
}
