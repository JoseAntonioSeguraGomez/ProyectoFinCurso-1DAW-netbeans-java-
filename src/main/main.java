package main;

import basura.controlador;
import bbdd.conector;
import vista.*;
import controlador.*;

public class main extends controlador {
    public static void main(String[] args) {
        //Conectar con la base de datos
        conector.Conectar();
        
        //Iniciar pantalla principal
        Inicio inicio = new Inicio();
        
        //Iniciar pantalla transicion
        InicioCarga inicioCarga = new InicioCarga();

        //Mostrar Inicio
        inicio.setVisible(true);

        //Establecer tiempos de carga para cada vista
        try {
            Thread.sleep(5000);
            inicio.setVisible(false);
            inicioCarga.setVisible(true); 
            new ControladorSonido().sonidoIntro();
            
            Thread.sleep(5000);
            inicioCarga.setVisible(false);
            new Menu();

        //Devolver excepcion en caso de fallo
        } catch (Exception ex){
            System.out.println(ex);
        }
   

    }
}
                
                
                
        
        /*conector.Conectar();
        controlador Controlador = new controlador();
        Controlador.menuRoot();*/
        
       /*ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM doctor");
        System.out.println(resultado);
        conector.CerrarConexion();
        
        new Login();
        */
       
       
        /*try {
            ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM productos");

            while(resultado.next()) {
               String columna1 = resultado.getString("id");
               String columna2 = resultado.getString("nombre");
               String columna3 = resultado.getString("descripcion");
               String columna4 = resultado.getString("plataforma");
               Double columna5 = resultado.getDouble("precio");
               int columna6 = resultado.getInt("unidades");


               // y así sucesivamente para cada columna que quieras leer
               System.out.println(columna1 + " " + columna2 + " " + columna3 + "" + columna4 + " " + columna5 + " " + columna6);
            }
        } catch (SQLException e) {
            System.out.print(e);
        }*/

       


