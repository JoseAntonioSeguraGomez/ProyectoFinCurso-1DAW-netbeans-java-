package bbdd;

import java.util.ArrayList;
import modelo.Producto;
import java.sql.ResultSet;
import java.sql.*;

public class ProductosBD {
    public ArrayList<String[]> obtenerDatos(){
        try {
            ArrayList<String[]> resultados = new ArrayList<>();

            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM productos");

            while (resultado.next()) {
            String[] fila = new String[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = resultado.getString(i + 1);
                }
            resultados.add(fila);
         }
            
        return resultados;
  
        }catch (SQLException ex){
            return null;
        }
    }
    
    public boolean eliminarProducto(String id) {
        try {
            conector.EjecutarUpdate( "DELETE FROM PRODUCTOS WHERE id = '" + id + "'");
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

} 

