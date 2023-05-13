package modelo;

public class Usuario {
   private String usuario;
   private String contrasena;
   private String nombre;
   private String apellidos;
   private String nacimiento;
   private int telefono;
   private String gmail;
   private String pais;
   private String provincia;
   private String ciudad;
   private String rol;
   private float fondos;
   
        public Usuario(String usuario, String contrasena, String nombre, String apellidos, String nacimiento, int telefono, String gmail, String pais, String provincia, String ciudad){
            this.usuario = usuario;
            this.contrasena = contrasena;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.nacimiento = nacimiento;
            this.telefono = telefono;
            this.gmail = gmail;
            this.pais = pais;
            this.provincia = provincia;
            this.ciudad = ciudad;
            this.rol = "Cliente";
            this.fondos = 0;
        }
        
        public Usuario(String usuario, String contrasena, String nombre, String apellidos, String nacimiento, int telefono, String gmail, String pais, String provincia, String ciudad, String rol, float fondos){
            this.usuario = usuario;
            this.contrasena = contrasena;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.nacimiento = nacimiento;
            this.telefono = telefono;
            this.gmail = gmail;
            this.pais = pais;
            this.provincia = provincia;
            this.ciudad = ciudad;
            this.rol = rol;
            this.fondos = fondos;
        }
        
        
        public Usuario(String usuario, String contrasena){
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

        public String getApellidos(){
            return apellidos;
        }
        public void setApellidos(String apellidos){
            this.apellidos = apellidos;
        }

        public String getNacimiento(){
            return nacimiento;
        }
        public void setNacimiento(String nacimiento){
            this.nacimiento = nacimiento;
        }

        public int getTelefono(){
            return telefono;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public String getGmail(){
            return gmail;
        }
        public void setGmail(String gmail){
            this.gmail = gmail;
        }

        public String getPais(){
            return pais;
        }
        public void set(String pais){
            this.pais = pais;
        }

        public String getProvincia(){
            return provincia;
        }
        public void setProvincia(String provincia){
            this.provincia = provincia;
        }

        public String getCiudad(){
            return ciudad;
        }
        public void setCiudad(String ciudad){
            this.ciudad = ciudad;
        }

        public String getRol(){
            return rol;
        }
        public void setRol(String rol){
            this.rol = rol;
        }
        public float getFondos(){
            return fondos;
        }
        public void setFondos(float fondos){
            this.fondos = fondos;
        }

        @Override
        public String toString(){
            return "Usuario:" + usuario + ", contraseña:" + contrasena + ", Nombre:" + nombre +  ", Apellidos:" + apellidos + ", Telefono:" + telefono + ", Gmail:" + gmail + ", Pais:" + pais + ", Provincia:" + provincia + ", Ciudad:" + ciudad + ", Nacimiento:" + nacimiento + ", Rol:" + rol + ", Fondos:" + fondos;
        }
}