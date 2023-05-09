package bbdd;

import modelo.Usuario;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.*; 
        
public class UsuariosBD {
    public void AnadirUsuariosBD(Usuario usuario){
            String valor1 = usuario.getUsuario();
            String valor2 = usuario.getContrasena();
            String valor3 = usuario.getNombre();
            String valor4 = usuario.getApellidos();
            String valor5 = usuario.getNacimiento();
            String valor6 = usuario.getTelefono();
            String valor7 = usuario.getGmail();
            String valor8 = usuario.getPais();
            String valor9 = usuario.getProvincia();
            String valor10 = usuario.getCiudad();
            String valor11 = usuario.getFondos();
            String valor12 = usuario.getRol();

        conector.EjecutarUpdate("INSERT INTO USUARIOS (USUARIO, CONTRASENA, NOMBRE, APELLIDOS, NACIMIENTO, TELEFONO, GMAIL, PAIS, PROVINCIA, CIUDAD, FONDOS, ROL) VALUES ('" + valor1 + "', '" + valor2 + "', '" + valor3 + "','" + valor4 + "','" + valor5 + "', '" + valor6 + "', '" + valor7 + "', '" + valor8 + "','" + valor9 + "','" + valor10 + "', '" + valor11 + "', '" + valor12 + "')");

    }
}