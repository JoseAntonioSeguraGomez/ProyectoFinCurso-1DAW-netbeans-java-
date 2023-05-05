package modelo;

public class Productos {
    private int id;
    private String nombre;
    private String descripcion;
    private String plataforma;
    private double precio;
    private int unidades;
    
    public Productos(int id, String nombre, String descripcion, String plataforma, double precio, int unidades){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.plataforma = plataforma;
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
   
   public String getPlataforma(){
       return plataforma;
   }
   public void setPlataforma(String plataforma){
       this.plataforma = plataforma;
   }
   
   public double getPrecio(){
       return precio;
   }
   public void setPrecio(double precio){
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
       return "ID:" + id + ", Nombre:" + nombre + ", Descripción:" + descripcion + ", Plataforma:" + plataforma + ", Precio:" + precio + ", Unidades:" + unidades;
   }
}
