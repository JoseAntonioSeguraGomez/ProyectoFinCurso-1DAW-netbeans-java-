package vista;

import controlador.ControladorUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class Factura extends javax.swing.JFrame {
    //Cargar usuario de inicio de sesión
    private Usuario usuario;
    private DefaultTableModel modelo;
    
    public Factura(Usuario usuario) {
        this.usuario = usuario;
        
        initComponents();
        cargarTabla();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    //Carga automaticamente los datos de la tabla
    private void cargarTabla() {
        //Introduzco en un array el nombre de las columnas
        String[] nombresColumnas = {"Fecha", "Nombre", "Producto", "Genero", "Categoria", "Precio", "Codigo"};
        
        //Creamos un nuevo modelo para la tabla donde se introduzca el array anterior
        modelo = new DefaultTableModel(null,nombresColumnas);
        
        //Establecemos a la tabla el modelo y asignamos de forma predeterminada 0 filas
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        
        //Asignamos a la tabla un fondo opaco
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        
        //Recoge los datos de la factura en una Matriz
        ArrayList<String[]> productos = new ControladorUsuario().obtenerDatosFactura(usuario);
        
        //Imprime cada fila del txt en las columnas correspondientes y las añade al modelo
         for (int i = 0; i < productos.size(); i++) {
            if(productos.get(i)[6].equals("0")){
                 
            }else{
                modelo.addRow(productos.get(i));
            }
        }
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 550, 10));

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Facturas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 530, 30));

        Tabla.setAutoCreateRowSorter(true);
        Tabla.setBackground(new java.awt.Color(23, 26, 33));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "FECHA", "NOMBRE", "Producto", "GENERO", "CATEGORIA", "PRECIO", "CODIGO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla.setEnabled(false);
        Tabla.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TablaPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
            Tabla.getColumnModel().getColumn(1).setResizable(false);
            Tabla.getColumnModel().getColumn(2).setResizable(false);
            Tabla.getColumnModel().getColumn(3).setResizable(false);
            Tabla.getColumnModel().getColumn(4).setResizable(false);
            Tabla.getColumnModel().getColumn(5).setResizable(false);
            Tabla.getColumnModel().getColumn(6).setResizable(false);
        }
        Tabla.getColumnModel().getColumn(0).setMaxWidth(40);
        Tabla.getColumnModel().getColumn(0).setPreferredWidth(40);

        Tabla.getColumnModel().getColumn(1).setMaxWidth(2);
        Tabla.getColumnModel().getColumn(1).setPreferredWidth(2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 540, 180));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaPeque+¦a.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablaPropertyChange
        //Quitar margenes
        Tabla.getColumnModel().setColumnMargin(0);
    }//GEN-LAST:event_TablaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
