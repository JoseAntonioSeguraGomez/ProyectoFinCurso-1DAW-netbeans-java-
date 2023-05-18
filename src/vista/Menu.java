package vista;

import bbdd.conector;
import controlador.ControladorSonido;
import modelo.Usuario;
import controlador.ControladorUsuario;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Menu extends javax.swing.JFrame {


    public Menu() {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnRegistrarme = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(1152, 648));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Introduzca la contraseña:");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 310, 30));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 310, 30));

        txtContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrasenaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 310, 30));

        btnRegistrarme.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        btnRegistrarme.setForeground(new java.awt.Color(0, 102, 204));
        btnRegistrarme.setText("Registrarme");
        btnRegistrarme.setBorderPainted(false);
        btnRegistrarme.setContentAreaFilled(false);
        btnRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarmeActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarme, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 102, 204));
        btnIniciarSesion.setFont(new java.awt.Font("Source Code Pro Black", 0, 14)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 160, 40));

        btnExit.setFont(new java.awt.Font("Source Code Pro Black", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 110, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 300, 30));

        jLabel6.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setText("Accede desde el teléfono:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 280, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/QR.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, 200));

        jLabel5.setFont(new java.awt.Font("Source Sans Pro Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Introduzca el nombre del usuario:");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 310, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoContrase+¦a.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoUsuario.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarSesion.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrasenaActionPerformed
    
    //Botón de registro
    private void btnRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarmeActionPerformed
        this.setVisible(false);
        new ControladorSonido().sonidoFinalizar();
        new Registro();
    }//GEN-LAST:event_btnRegistrarmeActionPerformed

    //Botón Salir de la aplicación
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        conector.CerrarConexion();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        //Declaro un borde rojo
        Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
        resetearBordesNormales();
        
        //Iniciar Sesion
        //Recogemos los datos introducidos por el usuario
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasena.getText();
        
        //Crea un nuevo usuario con los datos recogidos
        Usuario usuario1 = new Usuario(usuario, contrasena);
        
        //Se comprueba si existe el usuario devolviendo su rol
        String resultadoInicioSesion = new ControladorUsuario().IniciarSesion(usuario1);

        //Si el rol no es nulo, significa que existe con lo cual se comprueba el rol y se abre su respectiva vista
            if(resultadoInicioSesion.equals("Vacio")){
                txtUsuario.setBorder(bordeRojo);
                txtContrasena.setBorder(bordeRojo);
                jLabel8.setText("Algunos de los campos estan vacios");
            
                //En caso de que los datos introducidos sean incorrectos 
            }else if(resultadoInicioSesion.equals("Incorrecto")){
                txtUsuario.setBorder(bordeRojo);
                txtContrasena.setBorder(bordeRojo);
                jLabel8.setText("Las credenciales introducidas son incorrectas");
            }else if(resultadoInicioSesion.equals("correcto")){
                new ControladorSonido().sonidoFinalizar();
                this.setVisible(false);
            }
                
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrarme;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
