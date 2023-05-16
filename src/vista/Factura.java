package vista;

import controlador.ControladorProducto;
import controlador.ControladorUsuario;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class Factura extends javax.swing.JFrame {
    private Usuario usuario;
    private DefaultTableModel modelo;
    
    public Factura(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        cargarTabla();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void cargarTabla() {
        String[] nombresColumnas = {"Fecha", "Nombre", "Producto", "Genero", "Categoria", "Precio", "Codigo"};
        modelo = new DefaultTableModel(null,nombresColumnas);
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        //Tabla.setBackground(new Color(0,0,0,0));
                
        ArrayList<String[]> productos = new ControladorUsuario().obtenerDatosFactura(usuario);
        
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
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 550, 10));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Salir X.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 30, 30));

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\VentanaPeque+¦a.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void TablaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TablaPropertyChange
            Tabla.getColumnModel().setColumnMargin(0);
    }//GEN-LAST:event_TablaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
