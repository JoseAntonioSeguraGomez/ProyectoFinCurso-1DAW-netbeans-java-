package controlador;

import bbdd.ProductosBD;
import modelo.Usuario;
import bbdd.UsuariosBD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import modelo.Producto;
import vista.*;


public class ControladorUsuario {
    public ArrayList<String> AnadirUsuarios(Usuario usuario){
        //Creamos un array para almacenar el error y el texto
        ArrayList<String> error = new ArrayList<String>();
        
        //Crea una instancia de la clase UsuariosBD 
        UsuariosBD usuarios = new UsuariosBD();
        
        //Verificamos si el usuario ya existe 
        String existe = usuarios.existeUsuario(usuario);
        
        //Convierte el telefono en un String 
        String telefonoString = String.valueOf(usuario.getTelefono());

        //Verifica las diferentes condiciones que podrían surgir, en caso afirmativo devolvera un String con el error, si no se realizara la operación
        if(existe != null){
            error.add("Error");
            error.add("El usuario escrito ya existe, escriba otro");
            return error;
        } else if(usuario.getUsuario().equals("")){
            error.add("Usuario");
            error.add("El campo usuario está vacio");
            return error;
        } else if(usuario.getUsuario().length() < 4) {
            error.add("Usuario");
            error.add("El campo usuario es demasiado corto");
            return error;
        } else if(usuario.getContrasena().equals("")){
            error.add("Contrasena");
            error.add("El campo contraseña está vacio");
            return error;
        } else if(usuario.getContrasena().length() < 6) {
            error.add("Contrasena");
            error.add("El campo contraseña es demasiado corta");
            return error;
        } else if (!usuario.getContrasena().matches(".*[a-zA-Z].*")) {
            error.add("Contrasena");
            error.add("El campo contraseña necesita alguna letra");
            return error;
        } else if (!usuario.getContrasena().matches(".*\\d.*")) {
            error.add("Contrasena");
            error.add("El campo contraseña debe contener algún número");
            return error;
        } else if(usuario.getNombre().equals("")){
            error.add("Nombre");
            error.add("El campo nombre está vacio");
            return error;
        } else if(usuario.getApellidos().equals("")){
            error.add("Apellidos");
            error.add("El campo Apellidos está vacio");
            return error;
        } else if(usuario.getNacimiento().equals("")){
            error.add("Nacimiento");
            error.add("El campo nacimiento está vacio");
            return error;
        } else if (!usuario.getNacimiento().matches("\\d{4}-\\d{2}-\\d{2}")) {
            error.add("Nacimiento");
            error.add("El campo nacimento es incorrecto (*año-mes-dia*)");
            return error;
        } else if(telefonoString.equals("0")){
            error.add("Telefono");
            error.add("El campo telefono está vacio");
            return error;
        } else if(telefonoString.length() < 9) {
            error.add("Telefono");
            error.add("El campo teléfono es demasiado corto");
            return error;
        } else if(usuario.getGmail().equals("")){
            error.add("Email");
            error.add("El campo Email está vacio");
            return error;
        }else if (!usuario.getGmail().contains("@gmail.com") && !usuario.getGmail().contains("@gmail.es") && !usuario.getGmail().contains("@hotmail.com") && !usuario.getGmail().contains("@hotmail.es")) {
            error.add("Email");
            error.add("El campo Email tiene un formato erroneo");
            return error;
        }else if(usuario.getPais().equals("")){
            error.add("Pais");
            error.add("El campo pais está vacio");
            return error;
        } else {
            //Si todas las condiciones se cumplen, se agrega el usuario a la base de datos
            usuarios.anadirUsuariosBD(usuario);
            error.add("Hecho");
            error.add("El usuario se ha creado correctamente");
            new Menu();
            return error;

        }
    } 
    
    //Verificar si el usuario introducido es correcto
    public String IniciarSesion(Usuario usuario) {
        //Verifica si alguno de los campos están vacios
        if(usuario.getUsuario().equals("") || usuario.getContrasena().equals("")){
            return "Vacio";
        }else{
            String rol = new UsuariosBD().consultarInicioSesion(usuario);
            return rol; 
        }
        
    }
    
    public Usuario recogerDatosUsuario(Usuario usuario){
        //Recoger los datos en un String
        String[] datos = new UsuariosBD().recogerDatos(usuario);
        
        //Desglosar Datos
        String usuarioNombre = datos[0];
        String contrasena = datos[1];
        String nombre = datos[2];
        String apellidos = datos[3];
        String nacimiento = datos[4];
        int telefono = Integer.parseInt(datos[5]);
        String gmail = datos[6];
        String pais = datos[7];
        String provincia = datos[8];
        String ciudad = datos[9];
        String rol = datos[10];
        float fondos = Float.parseFloat(datos[11]);

        //Crear Usuario
        Usuario usuario1 = new Usuario(usuarioNombre, contrasena, nombre, apellidos, nacimiento, telefono, gmail, pais, provincia, ciudad, rol, fondos);
        
        //Devolver Usuario
        return usuario1;
    }
    
    
    //Recoger la url de la imagen del ususario
    public String recogerFoto(Usuario usuario){
        String[] datos = new UsuariosBD().recogerURL(usuario);
        String url = datos[12];
        
        //En caso de no tener establecera una imagen predeterminada
        if(url == null){
            return "https://us.123rf.com/450wm/thesomeday123/thesomeday1231712/thesomeday123171200009/91087331-icono-de-perfil-de-avatar-predeterminado-para-hombre-marcador-de-posici%C3%B3n-de-foto-gris-vector-de.jpg?ver=6";
        }else{
            return url;
        }
    }
    
    //Establecer una foto nueva al usuario
    public String establecerFoto(Usuario usuario, String url){
        //Si se envia una url vacia devuelve un error, en caso de ser muy corto igual, en caso de exito devuelve un "hecho"
        if(url.equals("")){
            return "No has introducido ninguna url, por favor, introduzca una.";
        } else if(url.length() < 44 ){
            return "La url introducida es demasiado corta";
        }else{
            new UsuariosBD().establecerFoto(usuario, url);
            return "hecho";
        }
    }
    
    public String anadirFondos(Usuario usuario, float fondos){
        //Recoge los datos del usuario
        Usuario usuario1 = recogerDatosUsuario(usuario);
        
        //Si el usuario tiene mas de 900E devuelve un error
        if(usuario1.getFondos() >= 900){
            return "Su cartera ya ha alcanzado el limite";
        }else{
            new UsuariosBD().añadirFondos(usuario, fondos);
            return "Se han añadido correctamente los fondos indicados, muchas gracias.";
        }
    }
    
    public String realizarCompra(Usuario usuario, Producto producto){
        //Recogemos los datos del usuario
        Usuario usuario1 = recogerDatosUsuario(usuario);

        //Obtenemos la edad del usuario
        int edad = devolverEdad(usuario1);

        //Se verifica si el usuario tiene suficientes fondos
        if(usuario1.getFondos() <= producto.getPrecio()){
            return "No tienes suficientes fondos como para comprar dicho producto.";
        }
        //Se verifica si el ususario tiene suficiente edad
        else if(edad < producto.getCategoria()){
            return "La categoria del producto no es adecuada para el usuario, pruebe con otro juego.";
        }
        else{
            //Actualizamos los fondos del usuario y las unidades del producto
            usuario1.setFondos(usuario1.getFondos() - producto.getPrecio());
            producto.setUnidades(producto.getUnidades()-1);
            System.out.println(usuario1.getFondos());

            //Actualizamos el usuario en la base de datos
            new UsuariosBD().actualizarUsuario(usuario1);

            //Actualizamos las unidades del producto en la base de datos
            new ProductosBD().actualizarUnidades(producto);

            //Añadir datos de la compra a la factura
            String nombreFichero = "src/facturas/" + usuario1.getUsuario() + ".txt";
            
            try{
                //Creamos el nuevo fichero
                File factura = new File(nombreFichero);
                BufferedWriter escribirFactura = new BufferedWriter(new FileWriter(factura, true));
                
                //Generar codigoFactura
                String codigo = codigoAleatorio() + tresPrimerasLetras(producto);
                
                //Fecha hoy
                Date fechaActual = new Date();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                
                //Añadir nuevos datos a la factura
                String datosFactura = (formatoFecha.format(fechaActual) + "|" + usuario1.getUsuario() + "|" + producto.getNombre() + "|" + producto.getGenero() + "|" + producto.getCategoria() + "|" + producto.getPrecio() + "|" + codigo);
                escribirFactura.write(datosFactura);
                escribirFactura.newLine();
                
                escribirFactura.close();
            } catch (IOException e){
                e.printStackTrace();
                return "error";
            }
            return "El producto se ha comprado con exito";
        }
    }
    
    //Devolver EDAD
    public int devolverEdad(Usuario usuario) {
        try {
            //Formato Fecha
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            
            //Pasar la fecha de nacimiento al formato DATE dado
            Date fechaNacimiento = dateFormat.parse(usuario.getNacimiento());
            
            //Recoger fecha actual
            Date fechaActual = new Date();
            
            //Establece los datos anteriormente como un objecto calendar
            Calendar calFechaNacimiento = Calendar.getInstance();
            calFechaNacimiento.setTime(fechaNacimiento);
            
            //Crear un objecto calendar y obtener la fecha actual del sistema
            Calendar calFechaActual = Calendar.getInstance();
            calFechaActual.setTime(fechaActual);

            //Recoger edad por el año
            int edad = calFechaActual.get(Calendar.YEAR) - calFechaNacimiento.get(Calendar.YEAR);

            //Calcular edad segun el mes y dia
            if (calFechaActual.get(Calendar.MONTH) < calFechaNacimiento.get(Calendar.MONTH) || (calFechaActual.get(Calendar.MONTH) == calFechaNacimiento.get(Calendar.MONTH) && calFechaActual.get(Calendar.DAY_OF_MONTH) < calFechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
                edad--;
            }

            return edad;
        } catch (ParseException ex) {
            return 0;
        }
    }
    
    //Generar Codigo Aleatorio
    public String codigoAleatorio() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int digito = random.nextInt(10);
            sb.append(digito);
        }

        return sb.toString();
    }
    
    //Reoger las tres primeras letras del producto
    public String tresPrimerasLetras(Producto producto) {
        String nombreProducto = producto.getNombre();
        String tresPrimerasLetras = nombreProducto.substring(0, Math.min(nombreProducto.length(), 3));
        
        return tresPrimerasLetras;
    }
    
    public ArrayList<String[]> obtenerDatosFactura(Usuario usuario){
        //Establece el nombre del fichero con el nombre del ususario
        String nombreFichero = "src/facturas/" + usuario.getUsuario() + ".txt";

        //Crea un objeto File para la factura
        File fichero = new File(nombreFichero);

        //Verificamos si el archivo de factura existe
        if (fichero.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                //Crea un ArrayList para almacenar los datos de la factura
                ArrayList<String[]> datos = new ArrayList<>();

                //Lee el archivo de factura línea por línea
                String linea;
                while ((linea = br.readLine()) != null) {
                    //Separa cada línea en campos utilizando el delimitador "|"
                    String[] fila = linea.split("\\|");

                    //Agregamos la fila de datos al ArrayList
                    datos.add(fila);
                }

                //Devolvemos el ArrayList con los datos de la factura
                return datos;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            //Si el archivo de factura no existe se devuelve null
            return null;
        }

        // Si ocurre algún error se devuelve null
        return null;
    }

    
}
