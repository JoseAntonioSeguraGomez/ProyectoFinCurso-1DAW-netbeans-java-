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
            String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
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
    
    public void AnadirProducto(Producto producto){
            String nombre = producto.getNombre();
            String descripcion = producto.getDescripcion();
            String genero = producto.getGenero();
            String categoria = producto.getCategoria();
            String precio = producto.getPrecio();
            String unidades = producto.getUnidades();


        conector.EjecutarUpdate("INSERT INTO PRODUCTOS (NOMBRE, DESCRIPCION, GENERO, CATEGORIA, PRECIO, UNIDADES) VALUES ('" + nombre + "', '" + descripcion + "', '" + genero + "','" + categoria + "','" + precio + "', '" + unidades + "')");

    }
    
    public String ExisteProducto(Producto producto){
         try {
            String producto1 = null;
            String nombre = producto.getNombre();

            ResultSet resultado = conector.EjecutarSentencia("SELECT NOMBRE FROM PRODUCTOS WHERE NOMBRE = '" + nombre + "'");
            
            if (resultado.next()) {
                producto1 = resultado.getString("NOMBRE");
            }

            return producto1;
        
        }catch (SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }

} 

