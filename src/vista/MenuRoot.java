package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controlador.ControladorProducto;


public class MenuRoot extends javax.swing.JFrame {


    public MenuRoot() {
        initComponents();
        String[] nombresColumnas = {"id", "nombre", "descripcion", "plataforma", "precio", "unidades"};
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        //Tabla.setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnFiltrarProductos = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setAutoCreateColumnsFromModel(false);
        Tabla.setBackground(new java.awt.Color(23, 26, 33));
        Tabla.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Categoría", "Precio", "Unidades"
            }
        ));
        Tabla.setShowGrid(false);
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setMinWidth(3);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 810, 370));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Salir X.png")); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 60, 40));

        btnFiltrarProductos.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnFiltrarProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Lupa.png")); // NOI18N
        btnFiltrarProductos.setText(" Filtrar Productos");
        btnFiltrarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiltrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrarProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 210, 40));

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Basura.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 160, 40));

        btnAñadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAñadir.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnAñadir.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\anadir.png")); // NOI18N
        btnAñadir.setText(" Añadir ");
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 160, 40));

        btnVerProductos.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        btnVerProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\BD.png")); // NOI18N
        btnVerProductos.setText(" Ver Productos");
        btnVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 180, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 810, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\MenuRoot.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1158, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        String[] nombresColumnas = {"id", "nombre", "descripcion", "plataforma", "precio", "unidades"};
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Tabla.setModel(modelo);

        ArrayList<String[]> productos = new ControladorProducto().obtenerDatos();
         for (int i = 0; i < productos.size(); i++) {
            modelo.addRow(productos.get(i));
        }

    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        Anadir anadir = new Anadir();
        anadir.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar eliminar = new Eliminar();
        eliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarProductosActionPerformed
        Filtrar filtrar = new Filtrar();
        filtrar.setVisible(true);
    }//GEN-LAST:event_btnFiltrarProductosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrarProductos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
