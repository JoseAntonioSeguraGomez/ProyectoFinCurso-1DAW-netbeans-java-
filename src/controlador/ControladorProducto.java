package controlador;

import java.util.ArrayList;
import bbdd.ProductosBD;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
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

}
