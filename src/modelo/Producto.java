package modelo;

public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private String genero;
    private String categoria;
    private String precio;
    private String unidades;
    
    public Producto(String nombre, String descripcion, String genero,String categoria, String precio, String unidades){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.categoria = categoria;
        this.precio = precio;
        this.unidades = unidades;
    }
    
    public Producto(String id,String nombre, String descripcion, String genero,String categoria, String precio, String unidades){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.categoria = categoria;
        this.precio = precio;
        this.unidades = unidades;
    }
    
   public String getId(){
       return id;
   }

   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public String getDescripcion(){
       return descripcion;
   }
   public void setDescripcion(String descripcion){
       this.descripcion = descripcion;
   }
   
   public String getGenero(){
       return genero;
   }
   public void setGenero(String genero){
       this.genero = genero;
   }
   
    public String getCategoria(){
       return categoria;
   }
   public void setCategoria(String categoria){
       this.categoria = categoria;
   }
   
   public String getPrecio(){
       return precio;
   }
   public void setPrecio(String precio){
       this.precio = precio;
   }
   
   public String getUnidades(){
       return unidades;
   }
   public void setUnidades(String unidades){
       this.unidades = unidades;
   }
   
   @Override
   public String toString(){
       return "ID:" + id + ", Nombre:" + nombre + ", Descripción:" + descripcion + ", Genero:" + genero +  ", Categoría:" + categoria + ", Precio:" + precio + ", Unidades:" + unidades;
   }
}
