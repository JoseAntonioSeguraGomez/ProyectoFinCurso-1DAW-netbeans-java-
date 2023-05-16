package bbdd;

import java.util.ArrayList;
import modelo.Producto;
import java.sql.ResultSet;
import java.sql.*;

public class ProductosBD {
    public ArrayList<String[]> obtenerDatos(){
        //Recoge los datos de la tabla productos
        try {
            ArrayList<String[]> resultados = new ArrayList<>();

            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM productos");

            //Añade los resultados al array
            while (resultado.next()) {
            String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = resultado.getString(i + 1);
                }
            resultados.add(fila);
         }
            
        return resultados;
  
        //En caso de error devuelve un null
        }catch (SQLException ex){
            return null;
        }
    }
    
    public boolean eliminarProducto(int id) {
        //Elimina el producto segun la id, si no existe devuelve un false
        try {
            conector.EjecutarUpdate( "DELETE FROM PRODUCTOS WHERE id = " + id + "");
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public void AnadirProducto(Producto producto){
        //Desglosa los datos del producto
            String nombre = producto.getNombre();
            String descripcion = producto.getDescripcion();
            String genero = producto.getGenero();
            int categoria = producto.getCategoria();
            float precio = producto.getPrecio();
            int unidades = producto.getUnidades();


        //Inserta los datos a la tabla produdctos, nunca va a fallar por lo que el try catch no es necesario
        conector.EjecutarUpdate("INSERT INTO PRODUCTOS (NOMBRE, DESCRIPCION, GENERO, CATEGORIA, PRECIO, UNIDADES) VALUES ('" + nombre + "', '" + descripcion + "', '" + genero + "','" + categoria + "','" + precio + "', '" + unidades + "')");

    }
    
    public String ExisteProducto(Producto producto){
        //Comprueba si el producto existe, en caso negativo devuelve un null
         try {
            String producto1 = null;
            String nombre = producto.getNombre();

            ResultSet resultado = conector.EjecutarSentencia("SELECT NOMBRE FROM PRODUCTOS WHERE NOMBRE = '" + nombre + "'");
            
            //Si existe resultado, entonces recoge el nombre
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
        //Edita un producto en funcion a los datos de acontinuación
          try {
              //Desglosa los datos del producto
            int id = producto.getId();
            String nombre = producto.getNombre();
            String descripcion = producto.getDescripcion();
            String genero = producto.getGenero();
            int categoria = producto.getCategoria();
            float precio = producto.getPrecio();
            int unidades = producto.getUnidades();
            
            //Ejecuta el update
            conector.EjecutarUpdate("UPDATE productos SET nombre = '" + nombre + "', descripcion = '" + descripcion + "', genero = '" + genero + "', categoria = " + categoria + ", precio = " + precio + ", unidades = " + unidades + " WHERE id = " + id );
            return "hecho";
            
         //En caso de error devuelve un null
         }catch (Exception ex){
            return null;
        }
    }
    
    public ArrayList<String[]> FiltrarContenido(String nombre){
        //Recoge datos en funcion al filtro
        try {
            ArrayList<String[]> resultados = new ArrayList<>();
            
            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS WHERE NOMBRE LIKE '%" + nombre + "%'");

            //Añade los datos al array
            while (resultado.next()) {
            String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = resultado.getString(i + 1);
                }
            resultados.add(fila);
         }
            
        return resultados;
        
        //En caso de error devuelve un nulo
        }catch (SQLException ex){
            return null;
        }
    }
    
        public ArrayList<String[]> OrdenarPorFiltroMayor(String nombre){
        //Recoge datos en funcion al filtro
        try {
            ArrayList<String[]> resultados = new ArrayList<>();
            
        ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS ORDER BY " + nombre + " DESC");
        
            //Añade los datos al array
            while (resultado.next()) {
            String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = resultado.getString(i + 1);
                }
            resultados.add(fila);
         }
            
        return resultados;
        
        //En caso de error devuelve un nulo
        }catch (SQLException ex){
            return null;
        }
    }
        
    public ArrayList<String[]> OrdenarPorFiltroMenor(String nombre){
        //Recoge datos en funcion al filtro
        try {
            ArrayList<String[]> resultados = new ArrayList<>();
            
        ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS ORDER BY " + nombre + " ASC");
        
            //Añade los datos al array
            while (resultado.next()) {
            String[] fila = new String[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = resultado.getString(i + 1);
                }
            resultados.add(fila);
         }
            
        return resultados;
            
        //En caso de error devuelve un nulo
        }catch (SQLException ex){
            return null;
        }
    }
    
    public void actualizarUnidades(Producto producto){
        //Actualiza el numero de unidades de un producto en concreto
        conector.EjecutarUpdate("UPDATE PRODUCTOS SET UNIDADES = " + producto.getUnidades() + " WHERE ID = " + producto.getId());
    }
} 

