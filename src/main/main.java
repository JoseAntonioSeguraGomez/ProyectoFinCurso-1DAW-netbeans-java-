package main;

import bbdd.conector;
import vista.*;
import controlador.*;

public class main extends controlador {
    public static void main(String[] args) {
        conector.Conectar();
        Inicio inicio = new Inicio();
        InicioCarga inicioCarga = new InicioCarga();

        inicio.setVisible(true);

        try {
            Thread.sleep(5000);
            inicio.setVisible(false);
            inicioCarga.setVisible(true); 
            
            Thread.sleep(5000);
            inicioCarga.setVisible(false);
            new Menu();

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

       


