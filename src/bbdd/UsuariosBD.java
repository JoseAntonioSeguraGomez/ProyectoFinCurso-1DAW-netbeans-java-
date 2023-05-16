package bbdd;

import modelo.Usuario;
import java.sql.ResultSet;
import java.sql.*; 
        
public class UsuariosBD {
    public void anadirUsuariosBD(Usuario usuario){
        //Obtener los datos del usuario
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

        //Ejecutar la consulta SQL para insertar los datos del usuario en la base de datos
        conector.EjecutarUpdate("INSERT INTO USUARIOS (USUARIO, CONTRASENA, NOMBRE, APELLIDOS, NACIMIENTO, TELEFONO, GMAIL, PAIS, PROVINCIA, CIUDAD, FONDOS, ROL) VALUES ('" + usuario1 + "', '" + contrasena + "', '" + nombre + "','" + apellidos + "','" + nacimiento + "', " + telefono + ", '" + gmail + "', '" + pais + "','" + provincia + "','" + ciudad + "', " + fondos + ", '" + rol + "')");
    }

    public String consultarInicioSesion(Usuario usuario){
        try {
            String rol = null;
            String nombre = usuario.getUsuario();
            String contrasena = usuario.getContrasena();

            //Ejecutar la consulta SQL para obtener el rol del usuario en base a su nombre de usuario y contraseña
            ResultSet resultado = conector.EjecutarSentencia("SELECT ROL FROM USUARIOS WHERE USUARIO = '" + nombre + "' AND CONTRASENA = '" + contrasena + "'");

            if (resultado.next()) {
                rol = resultado.getString("ROL");
            }

            return rol;

        //Devuelve un null en caso de error
        }catch (SQLException ex){
            return null;
        }
    }
    
    public String existeUsuario(Usuario usuario){
        try {
           String usuario1 = null;
           String nombre = usuario.getUsuario();

           //Ejecutar la consulta SQL para verificar si el usuario existe en la base de datos
           ResultSet resultado = conector.EjecutarSentencia("SELECT USUARIO FROM USUARIOS WHERE USUARIO = '" + nombre + "'");

           if (resultado.next()) {
               usuario1 = resultado.getString("USUARIO");
           }

           return usuario1;
       
       //Devuelve un null en caso de error
       }catch (SQLException ex){
           return null;
       }
    }
    
    public String[] recogerDatos(Usuario usuario){
        try {
            //Crea Array de datos
            String[] usuario1 = new String[12];
            
            //Recoge el nombre del usuario
            String usuarioNombre = usuario.getUsuario();

            //Ejecuta la consulta SQL para obtener los datos del usuario, incluyendo la URL
            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM USUARIOS WHERE USUARIO = '" + usuarioNombre + "'");

            if (resultado.next()) {
                for (int i = 0; i < 12; i++) {
                    usuario1[i] = resultado.getString(i + 1);
                }
                return usuario1;
            }

            return null;

        //Devuelve un null en caso de error
        }catch (SQLException ex){
            return null;
        }
    }
    
    public String[] recogerURL(Usuario usuario){
        try {
            //Crea el Array de datos
            String[] usuario1 = new String[13];
            
            //Recoge el nombre del usuario
            String usuarioNombre = usuario.getUsuario();

            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM USUARIOS WHERE USUARIO = '" + usuarioNombre + "'");
            
            if (resultado.next()) {
              for (int i = 0; i < 13; i++) {
                  usuario1[i] = resultado.getString(i + 1);
              }
                return usuario1;
            }
        
            return null;
            
        //Devuelve un null en caso de error  
        }catch (SQLException ex){
            return null;
        }
    }

    public void establecerFoto(Usuario usuario, String url){
        //Ejecuta la consulta SQL para actualizar la URL de la foto del usuario
        conector.EjecutarUpdate("UPDATE USUARIOS SET URL = '" + url + "' WHERE USUARIO = '" + usuario.getUsuario() + "'");
    }

    public void añadirFondos(Usuario usuario, float fondos){
        //Ejecuta la consulta SQL para aumentar los fondos del usuario en una cantidad específica
        conector.EjecutarUpdate("UPDATE USUARIOS SET FONDOS = FONDOS + " + fondos + " WHERE USUARIO = '" + usuario.getUsuario() + "'");
    }

    public void actualizarUsuario(Usuario usuario){
        //Imprime la consulta SQL para actualizar los fondos del usuario
        System.out.println("UPDATE USUARIOS SET FONDOS = " + usuario.getFondos() + " WHERE USUARIO = '" + usuario.getUsuario() + "'");

        //Ejecuta la consulta SQL para actualizar los fondos del usuario
        conector.EjecutarUpdate("UPDATE USUARIOS SET FONDOS = " + usuario.getFondos() + " WHERE USUARIO = '" + usuario.getUsuario() + "'");
    }
}