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
            conector.EjecutarUpdate( "DELETE FROM PRODUCTOS WHERE id = " + id + "");
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public void AnadirProducto(Producto producto){
            String nombre = producto.getNombre();
            String descripcion = producto.getDescripcion();
            String genero = producto.getGenero();
            int categoria = producto.getCategoria();
            float precio = producto.getPrecio();
            int unidades = producto.getUnidades();


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
    
    public String EditarProducto(Producto producto){
          try {
            int id = producto.getId();
            String nombre = producto.getNombre();
            String descripcion = producto.getDescripcion();
            String genero = producto.getGenero();
            int categoria = producto.getCategoria();
            float precio = producto.getPrecio();
            int unidades = producto.getUnidades();
            
            conector.EjecutarUpdate("UPDATE productos SET nombre = '" + nombre + "', descripcion = '" + descripcion + "', genero = '" + genero + "', categoria = " + categoria + ", precio = " + precio + ", unidades = " + unidades + " WHERE id = " + id );
            return "hecho";
            
         }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<String[]> FiltrarContenido(String nombre){
        try {
            ArrayList<String[]> resultados = new ArrayList<>();
            
            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS WHERE NOMBRE LIKE '%" + nombre + "%'");

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
    
        public ArrayList<String[]> OrdenarPorFiltroMayor(String nombre){
        try {
            ArrayList<String[]> resultados = new ArrayList<>();
            
        ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS ORDER BY " + nombre + " DESC");

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
        
    public ArrayList<String[]> OrdenarPorFiltroMenor(String nombre){
        try {
            ArrayList<String[]> resultados = new ArrayList<>();
            
        ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS ORDER BY " + nombre + " ASC");

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
    
    public void actualizarUnidades(Producto producto){
        conector.EjecutarUpdate("UPDATE PRODUCTOS SET UNIDADES = " + producto.getUnidades() + " WHERE ID = " + producto.getId());
    }
} 

