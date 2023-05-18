package vista;

import controlador.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import modelo.*;

public class MenuUsuario extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    private Usuario usuario;


    public MenuUsuario(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        cargarTabla();
        iniciarComboBox();
        cargarElementosMenu();
        obtenerFotoPerfil();
        cargarDisenoCuadros();
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
             //Si las unidades son 0 entonces no imprimira nada
             if(productos.get(i)[6].equals("0")){
                 
            }else{
                modelo.addRow(productos.get(i));
            }
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
             //Si las unidades son 0 entonces no imprimira nada
             if(productos.get(i)[6].equals("0")){
                 
            }else{
                modelo.addRow(productos.get(i));
            }
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
    
    public void cargarElementosMenu(){
        //Crear un usuario que recoja todos los datos del usuario + contraseña introducidos.
        Usuario usuarioMenu = new ControladorUsuario().recogerDatosUsuario(this.usuario);
        String numeroJuegos;
        
        //Pasar los fondos a String
        float fondos = usuarioMenu.getFondos();
        
        //Redondear Fondos
        float resultado = (float) Math.round(fondos * 100) / 100;
        
        String fondosString = Float.toString(fondos);
        
        //Obtener numeroJuegos
        ArrayList<String[]> productos = new ControladorUsuario().obtenerDatosFactura(usuario);

        if (productos != null && !productos.isEmpty()) {
            numeroJuegos = Integer.toString(productos.size());
        } else {
            numeroJuegos = "0";
        }

        //Establecer valores del dinero y nombre en el menu
        txtNombre.setText(usuarioMenu.getUsuario());
        txtDinero.setText(fondosString + " €");
        txtJuegos.setText(numeroJuegos);
    }
    
    public void obtenerFotoPerfil(){
        //LLama al controlador para recoger el foto de perfil relacionada al usuario
        String urlImagen = new ControladorUsuario().recogerFoto(this.usuario);
            try {
                //Establecer un nuevo objecto llamado url con la url
                URL url = new URL(urlImagen);
                ImageIcon icono = new ImageIcon(url);
                Image imagen = icono.getImage();
                
                //Redimensionar la imagen
                Image imagenRedimensionada = imagen.getScaledInstance(190, 170, Image.SCALE_SMOOTH);
                ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
                
                //Establecer imagen
                btnFoto.setIcon(iconoRedimensionado);
            } catch (MalformedURLException e) {
                // La URL de la imagen es incorrecta
                e.printStackTrace();
            } 
    }
    
    public void cargarDisenoCuadros(){
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.BLACK);
        btnCerrarSesion.setBorder(border);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnFiltrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtFiltro = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnComprar = new javax.swing.JButton();
        btnAnadirFondos = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnFoto = new javax.swing.JButton();
        txtDinero = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtJuegos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        Tabla.getColumnModel().getColumn(0).setMaxWidth(2);
        Tabla.getColumnModel().getColumn(0).setPreferredWidth(2);

        Tabla.getColumnModel().getColumn(1).setMaxWidth(2);
        Tabla.getColumnModel().getColumn(1).setPreferredWidth(2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 810, 370));

        btnFiltrar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        btnFiltrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 40, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 190, 20));

        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 90, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 130, 40));

        btnComprar.setBackground(new java.awt.Color(0, 255, 204));
        btnComprar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprar.png"))); // NOI18N
        btnComprar.setText(" Comprar");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 120, 40));

        btnAnadirFondos.setBackground(new java.awt.Color(0, 255, 204));
        btnAnadirFondos.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnAnadirFondos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnAnadirFondos.setText("Añadir Fondos");
        btnAnadirFondos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAnadirFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirFondosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadirFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 160, 40));

        btnFactura.setBackground(new java.awt.Color(0, 255, 204));
        btnFactura.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/factura.png"))); // NOI18N
        btnFactura.setText("Ver Facturas");
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 40));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(9, 9, 9));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 170, 30));

        btnActualizar.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 70, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(4, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 10, 430));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(4, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 10, 430));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 810, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 190, 20));

        btnFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\imagenUsuario.png")); // NOI18N
        btnFoto.setText("   ");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 170, 160));

        txtDinero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDinero.setForeground(new java.awt.Color(255, 255, 255));
        txtDinero.setText("***");
        jPanel1.add(txtDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 100, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Juegos Adquiridos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 150, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bienvenido de nuevo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 170, 40));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setText("***");
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, 40));

        txtJuegos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtJuegos.setForeground(new java.awt.Color(255, 255, 255));
        txtJuegos.setText("***");
        jPanel1.add(txtJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 70, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fondos:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MenuUsuario.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        //Recoge el contenido del filtro
        String nombre = txtFiltro.getText();

        //Llama al controlador con los datos de la tabla filtrada
        ArrayList<String[]> productos = new ControladorProducto().MostrarFiltro(nombre);
        
        //Carga la tabla filtrada
        cargarTablaConDatos(productos);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed

    }//GEN-LAST:event_txtFiltroActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        //Verifica si esta pulsada alguna fila
        if (Tabla.getSelectedRow() == -1) {
            return; 
        }
        
        //Recoge los datos de la fila la cual deseé comprar
        int fila = Tabla.getSelectedRow();
        int id = Integer.parseInt(this.Tabla.getValueAt(fila, 0).toString());
        String nombre = this.Tabla.getValueAt(fila, 1).toString();
        String descripcion = this.Tabla.getValueAt(fila, 2).toString();
        String genero = this.Tabla.getValueAt(fila, 3).toString();
        int categoria = Integer.parseInt(this.Tabla.getValueAt(fila, 4).toString());
        float precio = Float.parseFloat(this.Tabla.getValueAt(fila, 5).toString());
        int unidades = Integer.parseInt(this.Tabla.getValueAt(fila, 6).toString());

        //Crea un producto con los datos recogidos
        Producto producto = new Producto(id, nombre, descripcion, genero, categoria, precio, unidades);
        
        //LLama al controlador dando el usuario y producto a comprar
        String resultado = new ControladorUsuario().realizarCompra(usuario, producto);
        
        //Envia una alerta en caso de fallo o exito
        JOptionPane.showMessageDialog(null, resultado, "Alerta", JOptionPane.WARNING_MESSAGE);
        
        cargarElementosMenu();
        cargarTabla();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Recoge el dato seleccionado por el usuario
        String ordenar = (String) jComboBox1.getSelectedItem();

        //Recoge la tabla filtrada
        ArrayList<String[]> ordenar1 = new ControladorProducto().OrdenarProductos(ordenar);
        
        //Carga la tabla con los datos
        cargarTablaConDatos(ordenar1);
        
        //Carga la foto de perfil
        obtenerFotoPerfil();
        
        //Carga los elementos por pantalla
        cargarElementosMenu();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //Abre la vista Menu y cierra la actual
        this.setVisible(false);
        new Menu();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        //Abre la vista factura
        boolean resultado = new Factura(usuario).cargarTabla();
        if(resultado == true){
            new Factura(usuario).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No tienes ninguna factura", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void btnAnadirFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirFondosActionPerformed
        //Abre la vista Anadir
        new AnadirFondos(usuario);
        
    }//GEN-LAST:event_btnAnadirFondosActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        //Abre la vista editar
        new EditarURL(usuario);
    }//GEN-LAST:event_btnFotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAnadirFondos;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnFoto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel txtDinero;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JLabel txtJuegos;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables

    public void refreshUsuario() {
        btnActualizarActionPerformed(null);
    }
}
