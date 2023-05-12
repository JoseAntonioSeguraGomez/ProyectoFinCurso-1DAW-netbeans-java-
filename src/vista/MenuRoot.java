package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controlador.ControladorProducto;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import modelo.Producto;


public class MenuRoot extends javax.swing.JFrame {

    
    
    public MenuRoot() {
        initComponents();
        cargarTabla();
        setLocationRelativeTo(null);
        setVisible(true);  
    }
    
    private void cargarTabla() {
        String[] nombresColumnas = {"id", "nombre", "descripcion", "genero", "categoria", "precio", "unidades"};
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        //Tabla.setBackground(new Color(0,0,0,0));
                
        ArrayList<String[]> productos = new ControladorProducto().obtenerDatos();
         for (int i = 0; i < productos.size(); i++) {
            modelo.addRow(productos.get(i));
        }
         
         redimensionarTabla();
    }
    
    private void redimensionarTabla() {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT);
        Tabla.setDefaultRenderer(Object.class, renderer);
        Tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            for(int column = 0; column < Tabla.getColumnCount(); column++) {
                int width = 108; // Ancho predeterminado de la columna
                for (int row = 0; row < Tabla.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = Tabla.getCellRenderer(row, column);
                    Component comp = Tabla.prepareRenderer(cellRenderer, row, column);
                    width = Math.max(comp.getPreferredSize().width + 10, width);
                }
        Tabla.getColumnModel().getColumn(column).setPreferredWidth(width);
        }
    }
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnAnadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla.setBackground(new java.awt.Color(23, 26, 33));
        Tabla.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripción", "Género", "Categoría", "Precio", "Unidades"
            }
        ));
        Tabla.setRowHeight(32);
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

        btnFiltrar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnFiltrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Lupa.png")); // NOI18N
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 40, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Basura.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 120, 40));

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\editar.png")); // NOI18N
        btnEditar.setText(" Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 110, 40));

        btnVerProductos.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnVerProductos.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\BD.png")); // NOI18N
        btnVerProductos.setText(" Actualizar");
        btnVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 810, 10));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 80, 40));

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnAnadir.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\anadir.png")); // NOI18N
        btnAnadir.setText(" Añadir ");
        btnAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\MenuRoot.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        cargarTabla();

    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = Tabla.getSelectedRow();
        String id = this.Tabla.getValueAt(fila, 0).toString();
        String nombre = this.Tabla.getValueAt(fila, 1).toString();
        String descripcion = this.Tabla.getValueAt(fila, 2).toString();
        String genero = this.Tabla.getValueAt(fila, 3).toString();
        String categoria = this.Tabla.getValueAt(fila, 4).toString();
        String precio = this.Tabla.getValueAt(fila, 5).toString();
        String unidades = this.Tabla.getValueAt(fila, 6).toString();

        Producto producto = new Producto(id, nombre, descripcion, genero, categoria, precio, unidades);
        
        new controlador.ControladorProducto().ActualizarProductos(producto);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        new Eliminar();
        cargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        Filtrar filtrar = new Filtrar();
        filtrar.setVisible(true);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        new Menu();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        Anadir anadir = new Anadir();
        anadir.setVisible(true);
    }//GEN-LAST:event_btnAnadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerProductos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
