package modelo;

public class Usuarios {
   private String usuario;
   private String contrasena;
   private String nombre;
   private String DNI;
   private int nacimiento;
   private String rol;
   private double fondos;
   
   public Usuarios(String usuario, String contrasena, String nombre, String DNI, int nacimiento){
       this.usuario = usuario;
       this.contrasena = contrasena;
       this.nombre = nombre;
       this.DNI = DNI;
       this.nacimiento = nacimiento;
       this.rol = "Cliente";
       this.fondos = 0;
   }
   public Usuarios(String usuario, String contrasena){
       this.usuario = usuario;
       this.contrasena = contrasena;
   }
   
   public String getUsuario(){
       return usuario;
   }
   public void setUsuario(String usuario){
       this.usuario = usuario;
   }
   
   public String getContrasena(){
       return contrasena;
   }
   public void setContrasena(String cotrasena){
       this.contrasena = contrasena;
   }
   
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public String getDNI(){
       return DNI;
   }
   public void setDNI(String DNI){
       this.DNI = DNI;
   }
   
   public int getNacimiento(){
       return nacimiento;
   }
   public void setNacimiento(int nacimiento){
       this.nacimiento = nacimiento;
   }
   
   public String getRol(){
       return rol;
   }
   public void setRol(String rol){
       this.rol = rol;
   }
   public double getFondos(){
       return fondos;
   }
   public void setFondos(double fondos){
       this.fondos = fondos;
   }
   
   
   @Override
   public String toString(){
       return "Usuario:" + usuario + ", contraseña:" + contrasena + ", Nombre:" + nombre + ", DNI:" + DNI + ", Nacimiento:" + nacimiento + ", Rol:" + rol + ", Fondos:" + fondos;
   }
   
   
}
