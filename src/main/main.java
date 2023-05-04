package main;

import bbdd.conector;
import vista.*;
import controlador.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Timer;

public class main extends controlador {
    public static void main(String[] args) {
        Inicio inicio = new Inicio();
        InicioCarga inicioCarga = new InicioCarga();
        InicioIniciarSesion inicioLogin = new InicioIniciarSesion();


        inicio.setVisible(true);

        try {
            Thread.sleep(5000);
            inicio.setVisible(false);
            inicioCarga.setVisible(true); 
            
            Thread.sleep(5000);
            inicioCarga.setVisible(false); 
            inicioLogin.setVisible(true);

        } catch (Exception ex){
            
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

       


