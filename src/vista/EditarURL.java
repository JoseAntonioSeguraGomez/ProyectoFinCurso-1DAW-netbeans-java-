package vista;

import controlador.ControladorUsuario;
import javax.swing.JOptionPane;
import modelo.Usuario;

public class EditarURL extends javax.swing.JFrame {
    private Usuario usuario;
    
    public EditarURL(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        txtURL = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 550, 10));
        getContentPane().add(txtURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 370, 20));

        btnConfirmar.setBackground(new java.awt.Color(51, 204, 0));
        btnConfirmar.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\Confirmar.png")); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 40));

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("URL:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 20));

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escriba la URL que desea utilizar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 480, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\joans\\Desktop\\Imagenes\\VentanaPeque+¦a.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        this.setVisible(false);
        String url = txtURL.getText();
        
        String resultado = new ControladorUsuario().establecerFoto(usuario, url);
        
        if (resultado.equals("hecho")){
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, resultado, "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
