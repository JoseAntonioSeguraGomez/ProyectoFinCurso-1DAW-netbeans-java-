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
       
        public boolean eliminarProducto(String id){
            return true;
            
        }

}
