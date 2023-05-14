package bbdd;

import modelo.Usuario;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.*; 
import java.util.ArrayList;
        
public class UsuariosBD {
    public void AnadirUsuariosBD(Usuario usuario){
            String usuario1 = usuario.getUsuario();
            String contrasena = usuario.getContrasena();
            String nombre = usuario.getNombre();
            String apellidos = usuario.getApellidos();
            String nacimiento = usuario.getNacimiento();
            int telefono = usuario.getTelefono();
            String gmail = usuario.getGmail();
            String pais = usuario.getPais();
            String provincia = usuario.getProvincia();
            String ciudad = usuario.getCiudad();
            double fondos = usuario.getFondos();
            String rol = usuario.getRol();

        conector.EjecutarUpdate("INSERT INTO USUARIOS (USUARIO, CONTRASENA, NOMBRE, APELLIDOS, NACIMIENTO, TELEFONO, GMAIL, PAIS, PROVINCIA, CIUDAD, FONDOS, ROL) VALUES ('" + usuario1 + "', '" + contrasena + "', '" + nombre + "','" + apellidos + "','" + nacimiento + "', " + telefono + ", '" + gmail + "', '" + pais + "','" + provincia + "','" + ciudad + "', " + fondos + ", '" + rol + "')");

    }
    
    public String ConsultarInicioSesion(Usuario usuario){
        try {
            String rol = null;
            String nombre = usuario.getUsuario();
            String contrasena = usuario.getContrasena();

            ResultSet resultado = conector.EjecutarSentencia("SELECT ROL FROM USUARIOS WHERE USUARIO = '" + nombre + "' AND CONTRASENA = '" + contrasena + "'");
            
            if (resultado.next()) {
                rol = resultado.getString("ROL");
            }

            return rol;
        
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public String ExisteUsuario(Usuario usuario){
         try {
            String usuario1 = null;
            String nombre = usuario.getUsuario();

            ResultSet resultado = conector.EjecutarSentencia("SELECT USUARIO FROM USUARIOS WHERE USUARIO = '" + nombre + "'");
            
            if (resultado.next()) {
                usuario1 = resultado.getString("USUARIO");
            }

            return usuario1;
        
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public String[] recogerDatos(Usuario usuario){
        try {
            //Crear Array de datos
            String[] usuario1 = new String[12];
            
            //Recoger el nombre del usuario
            String usuarioNombre = usuario.getUsuario();

            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM USUARIOS WHERE USUARIO = '" + usuarioNombre + "'");
            
            if (resultado.next()) {
              for (int i = 0; i < 12; i++) {
                  usuario1[i] = resultado.getString(i + 1);
              }
            }
            return usuario1;
        
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
        public String[] recogerURL(Usuario usuario){
        try {
            //Crear Array de datos
            String[] usuario1 = new String[13];
            
            //Recoger el nombre del usuario
            String usuarioNombre = usuario.getUsuario();

            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM USUARIOS WHERE USUARIO = '" + usuarioNombre + "'");
            
            if (resultado.next()) {
              for (int i = 0; i < 13; i++) {
                  usuario1[i] = resultado.getString(i + 1);
              }
                return usuario1;
            }
        
            return null;
            
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    
}

/*
    public ArrayList<String[]> ConsultarInicioSesion(Usuario usuario){
        try {
            ArrayList<String[]> resultados = new ArrayList<>();

            String nombre = usuario.getUsuario();
            String contrasena = usuario.getContrasena();

            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM USUARIOS WHERE NOMBRE = '" + nombre + "' AND CONTRASENA = '" + contrasena + "'");
            
            while (resultado.next()) {
            String[] fila = new String[12];
                for (int i = 0; i < 12; i++) {
                    fila[i] = resultado.getString(i + 1);
                }
            resultados.add(fila);
         }
            
            if (resultados.get(0)[11] == null) {
                return null;
            } else {
                return resultados;
            }
        }catch (SQLException ex){
            return null;
        }
    }
}
*/