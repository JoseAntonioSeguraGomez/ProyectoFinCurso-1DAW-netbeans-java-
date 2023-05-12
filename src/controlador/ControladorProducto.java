package controlador;

import java.util.ArrayList;
import bbdd.ProductosBD;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import modelo.Producto;
import vista.MenuRoot;

public class ControladorProducto {
        public ArrayList<String[]> obtenerDatos(){
            return new ProductosBD().obtenerDatos();            
        }
       
        public String eliminarProducto(String id){
            boolean resultado = new ProductosBD().eliminarProducto(id);
            if(resultado == true){
                return "eliminado";
            }else{
                return "error";
            }
            
        }
        
        public String AnadirProducto(Producto producto){
            String existe = new ProductosBD().ExisteProducto(producto);
            
            if(existe != null){
                return "El producto escrito ya existe, escriba otro";
            }else if(producto.getNombre().equals("") || producto.getDescripcion().equals("") || producto.getGenero().equals("") || producto.getPrecio().equals("") || producto.getUnidades().equals("")){
                return "Alguno de los campos están vacio";
            } else if(producto.getDescripcion().length() < 10) {
                return "La descripción del producto es demasiado corta";
            } //else if(!producto.getPrecio().equals("\\d{0,2}(\\.\\d{1,2})?")) {
               // return "El formato de precio es incorrecto (*69.99*)";
            //}
            else{
                new ProductosBD().AnadirProducto(producto);
                return "hecho";
            }
        }

}
