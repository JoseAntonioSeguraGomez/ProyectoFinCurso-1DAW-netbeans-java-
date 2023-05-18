package vista;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import controlador.ControladorProducto;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import modelo.Producto;

public class MenuRoot extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    
    
    public MenuRoot() {
        initComponents();
        cargarTabla();
        iniciarComboBox();
        setLocationRelativeTo(null);
        setVisible(true);  
    }
    
    //Cargamos los elementos de la tabla
    private void cargarTabla() {
        //Introduzco en un array el nombre de las columnas
        String[] nombresColumnas = {"id", "nombre", "descripcion", "genero", "categoria", "precio", "unidades"};
        
        //Creamos un nuevo modelo para la tabla donde se introduzca el array anterior
        modelo = new DefaultTableModel(null,nombresColumnas);
        
        //Establecemos a la tabla el modelo y asignamos de forma predeterminada 0 filas
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        
        //Asignamos a la tabla un fondo opaco
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        //Recoge los datos de la tabla productos
        ArrayList<String[]> productos = new ControladorProducto().obtenerDatos();
         for (int i = 0; i < productos.size(); i++) {
            modelo.addRow(productos.get(i));
        }
         
         //Llama a redimensionar Tabla
         redimensionarTabla();
    }
    
    //Cargamos los elementos de la tabla con unos datos en concreto
    private void cargarTablaConDatos(ArrayList<String[]> productos) {
        //Introduzco en un array el nombre de las columnas
        String[] nombresColumnas = {"id", "nombre", "descripcion", "genero", "categoria", "precio", "unidades"};
        
        //Creamos un nuevo modelo para la tabla donde se introduzca el array anterior
        modelo = new DefaultTableModel(null,nombresColumnas);
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        
        //Establecemos a la tabla el modelo y asignamos de forma predeterminada 0 filas
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
                
        //Recoge los datos a la tabla productos
         for (int i = 0; i < productos.size(); i++) {
            modelo.addRow(productos.get(i));
        }
         
         redimensionarTabla();
    }
    
    //Permite ajustar la anchura de las columnas en proporción al contenido
    private void redimensionarTabla() {
        //Se crea un objeto para personalizar las celdas
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        
        //Alinear el texto a la izquierda
        renderer.setHorizontalAlignment(SwingConstants.LEFT);
        
        //Establecer un render
        Tabla.setDefaultRenderer(Object.class, renderer);
        
        //Se le asigna a la tabla un render automatico
        Tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        //Establecer el ancho de la tabla
            for(int column = 0; column < Tabla.getColumnCount(); column++) {
                int width = 108; // Ancho predeterminado de la columna
                
                //Pasa por cada fila de la columna
                for (int row = 0; row < Tabla.getRowCount(); row++) {
                    TableCellRenderer cellRenderer = Tabla.getCellRenderer(row, column);
                    Component comp = Tabla.prepareRenderer(cellRenderer, row, column);
                    width = Math.max(comp.getPreferredSize().width + 10, width);
                }
        //Se asigna el ancho a cada columna
        Tabla.getColumnModel().getColumn(column).setPreferredWidth(width);
        }
    }
    
    //Asignar valores al ComboBox
    public void iniciarComboBox(){
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(); 
        comboBoxModel.addElement("ID");
        comboBoxModel.addElement("Nombre");
        comboBoxModel.addElement("Genero");
        comboBoxModel.addElement("Categoria");
        comboBoxModel.addElement("MayorPrecio");
        comboBoxModel.addElement("MenorPrecio");
        comboBoxModel.addElement("MayorUnidades");
        comboBoxModel.addElement("MenorUnidades");


        //Establecer al ComboBox el modelo anteriormente asignado
        jComboBox1.setModel(comboBoxModel);
        
        //Posicionarse al primer elemento
        jComboBox1.setSelectedIndex(0);
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
        txtFiltro = new javax.swing.JTextField();
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
        Tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setMinWidth(3);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 810, 370));

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir X.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 60, 40));

        btnFiltrar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 40, 40));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(8, 7, 7));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basura.png"))); // NOI18N
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
        btnEditar.setForeground(new java.awt.Color(8, 7, 7));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setText(" Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 110, 40));

        btnVerProductos.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnVerProductos.setForeground(new java.awt.Color(8, 7, 7));
        btnVerProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnVerProductos.setText(" Actualizar");
        btnVerProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 810, 10));

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 90, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(8, 7, 7));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 80, 40));

        btnAnadir.setBackground(new java.awt.Color(0, 204, 0));
        btnAnadir.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnAnadir.setForeground(new java.awt.Color(8, 7, 7));
        btnAnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AnadirPequeño.png"))); // NOI18N
        btnAnadir.setText(" Añadir ");
        btnAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuRoot.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 654));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        //Recoge la elección del usuario
        String ordenar = (String) jComboBox1.getSelectedItem();

        //Envia al controlador la selección
        ArrayList<String[]> ordenar1 = new ControladorProducto().OrdenarProductos(ordenar);
        
        //Devuelve a la tabla los datos según lo que se ha querido filtrar
        cargarTablaConDatos(ordenar1);
    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Recoge los datos de la fila seleccionada
        int fila = Tabla.getSelectedRow();
        if(fila != -1){
        int id = Integer.parseInt(this.Tabla.getValueAt(fila, 0).toString());
        String nombre = this.Tabla.getValueAt(fila, 1).toString();
        String descripcion = this.Tabla.getValueAt(fila, 2).toString();
        String genero = this.Tabla.getValueAt(fila, 3).toString();
        int categoria = Integer.parseInt(this.Tabla.getValueAt(fila, 4).toString());
        float precio = Float.parseFloat(this.Tabla.getValueAt(fila, 5).toString());
        int unidades = Integer.parseInt(this.Tabla.getValueAt(fila, 6).toString());

        //Crea un producto con los datos recogidos
        Producto producto = new Producto(id, nombre, descripcion, genero, categoria, precio, unidades);
        
        //Llama al controlador y envia el producto
        new controlador.ControladorProducto().ActualizarProductos(producto);
        cargarTabla();
        }else{
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna fila", "Alerta", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Abre la vista eliminar
        new Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        //Recoge el dato del filtro
        String nombre = txtFiltro.getText();
        
        //Envia al controlador el filtro introducido por el usuario
        ArrayList<String[]> productos = new ControladorProducto().MostrarFiltro(nombre);
        
        //Actualiza la tabla con el dato introducido anteriormente
        cargarTablaConDatos(productos);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Sale del menuRoot para volver a la pantalla del Login
        this.setVisible(false);
        new Menu();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed

    }//GEN-LAST:event_txtFiltroActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        //Abre la vista Anadir 
        new Anadir();
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
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
