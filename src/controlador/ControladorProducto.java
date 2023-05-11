package controlador;

import java.util.ArrayList;
import bbdd.ProductosBD;

public class ControladorProducto {
        public ArrayList<String[]> obtenerDatos(){
            return new ProductosBD().obtenerDatos();            
        }
}
