package controlador;

import basura.MenuRoot2;
import basura.Login;
import basura.RegistrarUsuario;
import basura.AnadirProducto;
import bbdd.*;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import vista.*;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class controlador {
    
    public void inicio(){
        Login inicio = new Login();
        JButton IniciarSesion = inicio.getIniciarSesion();
        JButton Registrarse = inicio.getRegistrase();
        
        IniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Se presionó el botón Iniciar Sesión");
            }
        });
        
        Registrarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inicio.setVisible(false);
                registro();
            }
        });
        
        inicio.setVisible(true);

        
    }
    
public void menuRoot() {
    MenuRoot2 menuRoot = new MenuRoot2();
    JButton verBD = menuRoot.getVerBD();
    JButton productos = menuRoot.getAñadir();
    JTable tabla = menuRoot.getJTable();

    String[] nombresColumnas = {"id", "nombre", "descripcion", "plataforma", "precio", "unidades"};
    String[] registros = new String[6];

    DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

    tabla.setModel(modelo); // Establecer el modelo de tabla en la tabla existente

    verBD.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            conector.Conectar();
            try {
                ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM productos");

                modelo.setRowCount(0);

                while (resultado.next()) {
                    Object[] fila = new Object[6];
                    fila[0] = resultado.getString("id");
                    fila[1] = resultado.getString("nombre");
                    fila[2] = resultado.getString("descripcion");
                    fila[3] = resultado.getString("plataforma");
                    fila[4] = resultado.getDouble("precio");
                    fila[5] = resultado.getInt("unidades");
                    modelo.addRow(fila);
                }

            } catch (SQLException ex) {
                System.out.print(ex);
            }

            conector.CerrarConexion();

        }
    });
    
    productos.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
                AnadirProducto();
            }
        });
    

    menuRoot.setVisible(true);
}

    
    
    public void registro(){
        RegistrarUsuario registro = new RegistrarUsuario();
        JButton Confirmar = registro.getConfirmar();
        JButton Volver = registro.getVolver();
        JTextField usuario = registro.getUsuario();
        JTextField nombre = registro.getNombre();
        JTextField DNI = registro.getDNI();
        JTextField nacimiento = registro.getNacimiento();
        JTextField contrasena = registro.getContrasena();
        
        Confirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    String valor1 = usuario.getText();
                    String valor2 = nombre.getText();
                    String valor3 = DNI.getText();
                    String valor4 = nacimiento.getText();
                    String valor5 = contrasena.getText();


                    // Crea un Statement y realiza el INSERT en la tabla correspondiente
                    conector.EjecutarUpdate("INSERT INTO USUARIOS (USUARIO, NOMBRE, DNI, NACIMIENTO, CONTRASEÑA) VALUES ('" + valor1 + "', '" + valor2 + "', '" + valor3 + "','" + valor4 + "','" + valor5 + "')");

                    // Cierra la conexión
                    
                    conector.CerrarConexion();
                 
            }
        });               
        registro.setVisible(true);
        
    }
    
    public void AnadirProducto(){
        AnadirProducto producto = new AnadirProducto();
        JButton Confirmar = producto.getConfirmar();
        JButton Volver = producto.getVolver();
        String plataforma = producto.getPlataforma().getText();
        String nombre = producto.getNombre().getText();
        String descripcion = producto.getDescripcion().getText();
        String unidades = producto.getUnidades().getText();
        String precio = producto.getPrecio().getText();
       
    Confirmar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        conector.Conectar();
        conector.EjecutarSentencia("INSERT INTO productos (nombre, descripcion, plataforma, unidades, precio) VALUES ('" + nombre + "', '" + descripcion + "', '" + plataforma + "', " + unidades + ", " + precio + ")");
        conector.CerrarConexion();
        }
       });
        
      producto.setVisible(true);
    }
}


/*
//Añadir columnas
                DefaultTableModel tcliente = new DefaultTableModel();
                Tabla.addColumn("ID");
                Tabla.addColumn("Nombre");
                Tabla.addColumn("Descripcion");
                Tabla.addColumn("Plataforma");
                Tabla.addColumn("Precio");
                Tabla.addColumn("Unidades");
                Tabla.setModel(tcliente);
 
                String []datos = new String[6]; 
                // Recorre los resultados y agrega cada fila a la tabla
                while (resultado.next()) {
                    datos[0] = resultado.getString("id");
                    datos[1] = resultado.getString("nombre");
                    datos[2] = resultado.getString("descripcion");
                    datos[3] = resultado.getString("plataforma");
                    datos[4] = resultado.getString("precio");
                    datos[5] = resultado.getString("unidades");
                    Tabla.addRow(datos);
                    System.out.println("Se agregó una fila a la tabla");

                }

*/


/*
try {
                // Realiza la consulta SELECT y obtiene el objeto ResultSet
                ResultSet resultado = conector.EjecutarSentencia("SELECT * FROM PRODUCTOS");

                // Recorre los resultados y agrega cada fila a la tabla
                while (resultado.next()) {
                    int columna1 = resultado.getInt("id");
                    String columna2 = resultado.getString("nombre");
                    String columna3 = resultado.getString("descripcion");
                    String columna4 = resultado.getString("plataforma");
                    Double columna5 = resultado.getDouble("precio");
                    int columna6 = resultado.getInt("unidades");
                    modeloTabla.addRow(new Object[]{columna1, columna2, columna3, columna4, columna5, columna6});
                    System.out.println("Se agregó una fila a la tabla");

                }

                // Cierra el objeto ResultSet y la conexión
                resultado.close();
                conector.CerrarConexion();
                

            } catch (SQLException ex) {
                // Maneja la excepción en caso de error
                ex.printStackTrace();
            }
        }
*/