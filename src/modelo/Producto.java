package modelo;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private String genero;
    private int categoria;
    private float precio;
    private int unidades;
    
    public Producto(String nombre, String descripcion, String genero,int categoria, float precio, int unidades){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.categoria = categoria;
        this.precio = precio;
        this.unidades = unidades;
    }
    
    public Producto(int id,String nombre, String descripcion, String genero,int categoria, float precio, int unidades){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.categoria = categoria;
        this.precio = precio;
        this.unidades = unidades;
    }
    
   public int getId(){
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
   
    public int getCategoria(){
       return categoria;
   }
   public void setCategoria(int categoria){
       this.categoria = categoria;
   }
   
   public float getPrecio(){
       return precio;
   }
   public void setPrecio(float precio){
       this.precio = precio;
   }
   
   public int getUnidades(){
       return unidades;
   }
   public void setUnidades(int unidades){
       this.unidades = unidades;
   }
   
   @Override
   public String toString(){
       return "ID:" + id + ", Nombre:" + nombre + ", Descripción:" + descripcion + ", Genero:" + genero +  ", Categoría:" + categoria + ", Precio:" + precio + ", Unidades:" + unidades;
   }
}
