package controlador;

import java.util.ArrayList;
import bbdd.ProductosBD;
import modelo.Producto;

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
            String categoriaString = String.valueOf(producto.getCategoria());
            String precioString = String.valueOf(producto.getPrecio());
            String unidadesString = String.valueOf(producto.getUnidades());

            
            if(existe != null){
                return "El producto escrito ya existe, escriba otro";
            }else if(producto.getNombre().equals("") || producto.getDescripcion().equals("") || producto.getGenero().equals("") || categoriaString.equals("") || precioString.equals("") || unidadesString.equals("")){
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
        
        public String ActualizarProductos(Producto producto){
            String existe = new ProductosBD().EditarProducto(producto);
            return existe;
        }
        
        public ArrayList<String[]> MostrarFiltro(String nombre){
            return new ProductosBD().FiltrarContenido(nombre);
        }
        
        public ArrayList<String[]> OrdenarProductos(String ordenar){
            if(ordenar.equals("ID")){
                return new ProductosBD().obtenerDatos();
            } else if(ordenar.equals("Nombre") || ordenar.equals("Genero") || ordenar.equals("Categoria")){
                return new ProductosBD().OrdenarPorFiltroMenor(ordenar);
            } else if(ordenar.equals("MayorPrecio")){
                return new ProductosBD().OrdenarPorFiltroMayor("precio");
            }  else if(ordenar.equals("MenorPrecio")){
                return new ProductosBD().OrdenarPorFiltroMenor("precio");
            }  else if(ordenar.equals("MayorUnidades")){
                return new ProductosBD().OrdenarPorFiltroMayor("Unidades");
            }  else if(ordenar.equals("MenorUnidades")){
                return new ProductosBD().OrdenarPorFiltroMenor("Unidades");
            } 
            
            return null;
        }
       

}
