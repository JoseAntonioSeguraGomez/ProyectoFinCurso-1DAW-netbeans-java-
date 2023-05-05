package bbdd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuarios;

public class UsersService {
    String tableName = "Usuarios";
    
    public ArrayList<Usuarios> getUsers() throws SQLException{
        ArrayList<Usuarios> users = new ArrayList<Usuarios>();
        ResultSet results = conector.EjecutarSentencia("SELECT * FROM " + tableName);
        while(results.next()){
            String nombre = results.getString(1);
            String contrasena = results.getString(2);
            users.add(new Usuarios(nombre, contrasena));  
        } 

        return users;

    }
}
