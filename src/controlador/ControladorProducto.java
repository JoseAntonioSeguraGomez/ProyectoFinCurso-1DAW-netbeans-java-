package controlador;

import java.util.ArrayList;
import bbdd.ProductosBD;
import modelo.Producto;

public class ControladorProducto {
    
    //Obtener datos de la tabla producto
    public ArrayList<String[]> obtenerDatos(){
        return new ProductosBD().obtenerDatos();            
    }
       
    public String eliminarProducto(int id){
        //Llama al método de la base de datos para eliminar el producto por su ID
        boolean resultado = new ProductosBD().eliminarProducto(id);

        //Comprueba si el resultado de la eliminación es exitoso
        if(resultado == true){
            return "eliminado";
        }else{
            return "error";
        }
    }

    public String AnadirProducto(Producto producto){
        //Comprueba si el producto ya existe en la base de datos
        String existe = new ProductosBD().ExisteProducto(producto);

        //Convierte los campos numéricos del producto a String
        String categoriaString = String.valueOf(producto.getCategoria());
        String precioString = String.valueOf(producto.getPrecio());
        String unidadesString = String.valueOf(producto.getUnidades());

        //Verifica diferentes condiciones a la hora de añadir el producto
        if(existe != null){
            return "El producto escrito ya existe, escriba otro";
        }else if(producto.getNombre().equals("") || producto.getDescripcion().equals("") || producto.getGenero().equals("") || categoriaString.equals("") || precioString.equals("") || unidadesString.equals("")){
            return "Alguno de los campos están vacíos";
        } else if(producto.getDescripcion().length() < 10) {
            return "La descripción del producto es demasiado corta";
        }
        /* else if(!producto.getPrecio().equals("\\d{0,2}(\\.\\d{1,2})?")) {
               return "El formato de precio es incorrecto (*69.99*)";
        } */
        else{
            //Llama al método de la base de datos para añadir el producto
            new ProductosBD().AnadirProducto(producto);
            return "hecho";
        }
    }

    public String ActualizarProductos(Producto producto){
        //Llama a la base de datos para verificar si el producto existe a la hora de hacer el update
        String existe = new ProductosBD().EditarProducto(producto);
        return existe;
    }

    public ArrayList<String[]> MostrarFiltro(String nombre){
        //Llama al método de la base de datos para filtrar productos por el nombre introducido 
        return new ProductosBD().FiltrarContenido(nombre);
    }

    public ArrayList<String[]> OrdenarProductos(String ordenar){
        //Comprueba el tipo de orden seleccionado y llamar al método correspondiente de la base de datos
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
