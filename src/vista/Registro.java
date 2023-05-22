package vista;

import modelo.Usuario;
import controlador.ControladorUsuario;
import controlador.ControladorSonido;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class Registro extends javax.swing.JFrame {

    //Inicializar componentes
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        resetearBordesNormales();
        setVisible(true);
    }
    
    // Método para restablecer los bordes de los campos de texto
    private void resetearBordesNormales() {
        Border bordeNormal = BorderFactory.createLineBorder(Color.BLACK);
        txtUsuario.setBorder(bordeNormal);
        txtContrasena.setBorder(bordeNormal);
        txtNombre.setBorder(bordeNormal);
        txtApellidos.setBorder(bordeNormal);
        txtNacimiento.setBorder(bordeNormal);
        txtTelefono.setBorder(bordeNormal);
        txtGmail.setBorder(bordeNormal);
        txtPais.setBorder(bordeNormal);
        txtProvincia.setBorder(bordeNormal);
        txtCiudad.setBorder(bordeNormal);
        txtConfirmarContrasena.setBorder(bordeNormal);
        txtConfirmarGmail.setBorder(bordeNormal);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarse = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtCiudad = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNacimiento = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtAlerta = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtConfirmarContrasena = new javax.swing.JPasswordField();
        txtConfirmarGmail = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1158, 654));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarse.setBackground(new java.awt.Color(0, 102, 204));
        btnRegistrarse.setFont(new java.awt.Font("Source Code Pro Black", 0, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 150, 40));

        btnVolver.setBackground(new java.awt.Color(0, 102, 204));
        btnVolver.setFont(new java.awt.Font("Source Code Pro Black", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, 40));

        txtCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiudadActionPerformed(evt);
            }
        });
        txtCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 480, 180, -1));

        txtProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProvinciaActionPerformed(evt);
            }
        });
        txtProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvinciaKeyTyped(evt);
            }
        });
        jPanel1.add(txtProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 180, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("  Provincia:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 80, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(" Ciudad:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 60, 20));

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });
        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisKeyTyped(evt);
            }
        });
        jPanel1.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 180, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" País:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 40, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DATOS DOMICILIO:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 180, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 180, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirmar:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 80, 20));

        txtGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGmailActionPerformed(evt);
            }
        });
        txtGmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 180, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" Usuario:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 70, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATOS CONTACTO:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 170, -1));

        txtNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacimientoActionPerformed(evt);
            }
        });
        txtNacimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNacimientoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 180, -1));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 180, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 180, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Nacimiento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 90, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellidos:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Nombre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 70, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATOS PERSONALES:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 180, -1));

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        txtContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContrasenaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, 20));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 180, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 70, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DATOS USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRARSE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 240, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 710, 10));

        txtAlerta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAlerta.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(txtAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, 340, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 10, 40));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 10, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 10, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 10, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 236, 10, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("*");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 10, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("*");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 236, 10, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("*");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 10, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("*");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 10, 40));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Contraseña:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, 20));

        txtConfirmarContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarContrasenaActionPerformed(evt);
            }
        });
        txtConfirmarContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmarContrasenaKeyTyped(evt);
            }
        });
        jPanel1.add(txtConfirmarContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 180, -1));

        txtConfirmarGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarGmailActionPerformed(evt);
            }
        });
        txtConfirmarGmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmarGmailKeyTyped(evt);
            }
        });
        jPanel1.add(txtConfirmarGmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 180, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Email:");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 278, 50, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 0, 0));
        jLabel28.setText("*");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 10, 40));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 0, 0));
        jLabel29.setText("*");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 10, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Registro.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1155, 652));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacimientoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProvinciaActionPerformed

    private void txtCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCiudadActionPerformed

    //Volver a la ventana anterior
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        new ControladorSonido().sonidoFinalizar();
        new Menu();
    }//GEN-LAST:event_btnVolverActionPerformed

    //Botón de registro
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        //Declaro un borde rojo
        Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
        
        //Reiniciar bordes
        resetearBordesNormales();

        //Recogemos todos los datos introducidos por el usuario
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String nacimiento = txtNacimiento.getText();
        String gmail = txtGmail.getText();
        String pais = txtPais.getText();
        String provincia = txtProvincia.getText();
        String ciudad = txtCiudad.getText();
        
        //Se comprueba primeramente que el campo telefono este relleno para futuras verificaciones
        int telefono = 0;
        
        if(txtTelefono.getText().equals("")){
            telefono = 0;
        }else{
            telefono = Integer.parseInt(txtTelefono.getText());
        }   
        
        //Crea un nuevo usuario con los datos introducidos
        Usuario usuario1 = new Usuario(usuario, contrasena, nombre, apellidos, nacimiento, telefono, gmail, pais, provincia, ciudad);

        //Se envia al controlador para que verifique que todos los datos son correctos
        ArrayList<String> respuesta = new ControladorUsuario().AnadirUsuarios(usuario1, txtConfirmarGmail.getText(), txtConfirmarContrasena.getText());
        String resultado = respuesta.get(0);
        String alerta = respuesta.get(1);

        

        //Se comprueba si el usuario es correcto, en caso afirmativo se cierra la ventana y en caso negativo se notifica una alerta
        if(resultado.equals("Usuario")){
            txtUsuario.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        }  else if(resultado.equals("Error")){
            txtUsuario.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Contrasena")){
            txtContrasena.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Contrasena2")){
            txtConfirmarContrasena.setBorder(bordeRojo);
            txtContrasena.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Nombre")){
            txtNombre.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Apellidos")){
            txtApellidos.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Nacimiento")){
            txtNacimiento.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Telefono")){
            txtTelefono.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Email")){
            txtGmail.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Email2")){
            txtConfirmarGmail.setBorder(bordeRojo);
            txtGmail.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Pais")){
            txtPais.setBorder(bordeRojo);
            txtAlerta.setText(alerta);
        } else if(resultado.equals("Hecho")){
            new ControladorSonido().sonidoConfirmar();
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, alerta, "Alerta", JOptionPane.WARNING_MESSAGE);
        }else{
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    //Comprobaciones sobre que caracteres se deben poner en todos los txt
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        //No podra exceder los 20 caracteres
        if(txtUsuario.getText().length() == 20){
            evt.consume();
        }
        
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Solo podra escribir caracteres y no digitos
        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios)){
            evt.consume();
        }
        
        if(txtNombre.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        //Solo podra escribir caracteres y no digitos

        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios)){
            evt.consume();
        }
        
        if(txtApellidos.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtNacimientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNacimientoKeyTyped

        if(txtNacimiento.getText().length() == 50){
            evt.consume();
        }
    }//GEN-LAST:event_txtNacimientoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        //Solo podra escribir numeros 
        
        int key =evt.getKeyChar();
        
        boolean numeros = key >= 48 && key <= 57;

        if(!numeros){
            evt.consume();
        }
        
        if(txtTelefono.getText().length() == 9){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyTyped
        //Solo podra escribir texto
        
        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios)){
            evt.consume();
        }
        
        if(txtPais.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtPaisKeyTyped

    private void txtProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvinciaKeyTyped
        //Solo podra escribir texto
        
        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios)){
            evt.consume();
        }
        
        if(txtProvincia.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtProvinciaKeyTyped

    private void txtCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadKeyTyped
        //Solo podra escribir texto
        
        int key =evt.getKeyChar();
        
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacios = key >= 32;

        if(!(mayusculas || minusculas || espacios)){
            evt.consume();
        }
        
        if(txtCiudad.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtCiudadKeyTyped

    private void txtConfirmarContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarContrasenaActionPerformed

    private void txtConfirmarContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarContrasenaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarContrasenaKeyTyped

    private void txtConfirmarGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarGmailActionPerformed

    private void txtConfirmarGmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarGmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarGmailKeyTyped

    private void txtGmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGmailKeyTyped
        if(txtGmail.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtGmailKeyTyped

    private void txtGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGmailActionPerformed

    private void txtContrasenaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContrasenaKeyTyped
        //No podra exceder los 20 caracteres
        if(txtContrasena.getText().length() == 20){
            evt.consume();
        }
    }//GEN-LAST:event_txtContrasenaKeyTyped

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtAlerta;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JPasswordField txtConfirmarContrasena;
    private javax.swing.JTextField txtConfirmarGmail;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
