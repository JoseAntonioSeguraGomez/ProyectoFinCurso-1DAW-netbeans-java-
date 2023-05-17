package vista;

import javax.swing.DefaultComboBoxModel;
import modelo.Producto;
import controlador.ControladorProducto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Anadir extends javax.swing.JFrame {

    public Anadir() {
        initComponents();
        setLocationRelativeTo(null);
        IniciarComboBox();
        resetearBordesNormales();
        setVisible(true);
    }
    
    //Carga el ComboBox asignando los valores a elegir
    public void IniciarComboBox(){
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(); 
        comboBoxModel.addElement("3");
        comboBoxModel.addElement("7");
        comboBoxModel.addElement("12");
        comboBoxModel.addElement("16");
        comboBoxModel.addElement("18");

        //Establecer modelo inpuesto al comboBox
        jComboBox1.setModel(comboBoxModel);
        
        //Seleccionar de forma predeterminada la posicion 0
        jComboBox1.setSelectedIndex(0);
    }
    
    // Método para restablecer los bordes de los campos de texto
    private void resetearBordesNormales() {
        Border bordeNormal = BorderFactory.createLineBorder(Color.BLACK);
        txtNombre.setBorder(bordeNormal);
        txtDescripcion.setBorder(bordeNormal);
        txtGenero.setBorder(bordeNormal);
        jComboBox1.setBorder(bordeNormal);
        txtPrecio.setBorder(bordeNormal);
        txtUnidades.setBorder(bordeNormal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtAlerta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 540, 10));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 140, 20));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, 20));

        jLabel8.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Precio:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 20));

        jLabel7.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("  Unidades:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        jLabel6.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Categoría:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 20));

        txtUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadesActionPerformed(evt);
            }
        });
        txtUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadesKeyTyped(evt);
            }
        });
        getContentPane().add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 140, 20));

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        txtGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGeneroKeyTyped(evt);
            }
        });
        getContentPane().add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 140, -1));

        btnConfirmar.setBackground(new java.awt.Color(51, 204, 0));
        btnConfirmar.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 40));

        jLabel5.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 20));

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Género:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, 20));

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Introduzca la siguiente información:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 480, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jLabel9.setFont(new java.awt.Font("Source Code Pro", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripción:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 20));

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 20));

        txtAlerta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAlerta.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(txtAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 380, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaPeque+¦a.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //Declaro un borde rojo
        Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
        resetearBordesNormales();

        //Recoge los datos introducidos por el usuario
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        String genero = txtGenero.getText();
        
        //Pasar de String a los valores adecuados
        int categoria = Integer.parseInt((String) jComboBox1.getSelectedItem());
        float precio;
        int unidades;
        
        //Verificar si los campos numericos estan vacios
        if (!txtPrecio.getText().isEmpty()) {
            precio = Float.parseFloat(txtPrecio.getText());
        } else {
            precio = 0;
        }
        
        if (!txtUnidades.getText().isEmpty()) {
            unidades = Integer.parseInt(txtUnidades.getText());
        } else {
            unidades = 0;
        }
        
        //Crear un nuevo producto con los datos recogidos
        Producto producto = new Producto(nombre, descripcion, genero, categoria, precio, unidades);
        
        //Levar al controlador el producto para su correcta implementacion
        ArrayList<String> respuesta = new ControladorProducto().AnadirProducto(producto);
        String resultado = respuesta.get(0);
        String alerta = respuesta.get(1);
        
        //En caso de que la implementacion ha sido correcta se cerrará la ventana
        if(resultado.equals("Hecho")){
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, alerta, "Alerta", JOptionPane.WARNING_MESSAGE);
            } else if(resultado.equals("Nombre")){
                txtNombre.setBorder(bordeRojo);
                txtAlerta.setText(alerta);
            } else if(resultado.equals("Existe")){
                txtNombre.setBorder(bordeRojo);
                txtAlerta.setText(alerta);
            } else if(resultado.equals("Descripcion")){
                txtDescripcion.setBorder(bordeRojo);
                txtAlerta.setText(alerta);
            } else if(resultado.equals("Genero")){
                txtGenero.setBorder(bordeRojo);
                txtAlerta.setText(alerta);
            } else if(resultado.equals("Precio")){
                txtPrecio.setBorder(bordeRojo);
                txtAlerta.setText(alerta);
            } else if(resultado.equals("Unidades")){
                txtUnidades.setBorder(bordeRojo);
                txtAlerta.setText(alerta);
            } else {
                this.setVisible(false);
            }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidadesActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    //Condiciones para que no se puedan añadir ciertos elementos
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Limitar el tamaño de escritura
        
        if(txtNombre.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        //Limitar el tamaño de escritura
        
        if(txtDescripcion.getText().length() == 255){
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtGeneroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGeneroKeyTyped
        //Limitar el tamaño de escritura y solo permita letras
        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios)){
            evt.consume();
        }
        
        if(txtGenero.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_txtGeneroKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        //Limitar el tamaño de escritura y permitir decimales
        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean decimales= key == '.';
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios || decimales)){
            evt.consume();
        }
        if(txtUnidades.getText().length() == 5){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadesKeyTyped
       //Limitar el tamaño de escritura y solo permite numeros
        
        int key =evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;

        if(!numeros){
            evt.consume();
        }
        
        if(txtUnidades.getText().length() == 4){
            evt.consume();
        }
    }//GEN-LAST:event_txtUnidadesKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtAlerta;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
