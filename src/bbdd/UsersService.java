package bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;

public class UsersService {
    String tableName = "Usuarios";
    
    public ArrayList<Usuario> getUsers() throws SQLException{
        ArrayList<Usuario> users = new ArrayList<Usuario>();
        ResultSet results = conector.EjecutarSentencia("SELECT * FROM " + tableName);
        while(results.next()){
            String nombre = results.getString(1);
            String contrasena = results.getString(2);
            users.add(new Usuario(nombre, contrasena));  
        } 

        return users;

    }
}
