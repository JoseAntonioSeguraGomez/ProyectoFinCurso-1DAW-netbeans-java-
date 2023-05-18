package vista;

import javax.swing.JOptionPane;
import controlador.ControladorProducto;

public class Eliminar extends javax.swing.JFrame {

    //Inicializar componentes
    public Eliminar() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfirmar = new javax.swing.JButton();
        btnClick = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 160, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 550, 10));

        btnConfirmar.setBackground(new java.awt.Color(51, 204, 0));
        btnConfirmar.setFont(new java.awt.Font("Source Code Pro Black", 0, 12)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Confirmar.png"))); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 40));

        btnClick.setBackground(new java.awt.Color(23, 26, 33));
        btnClick.setFont(new java.awt.Font("Source Code Pro", 0, 12)); // NOI18N
        btnClick.setForeground(new java.awt.Color(255, 255, 255));
        btnClick.setText("Confirmo la eliminación de dicho producto...");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        getContentPane().add(btnClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 340, -1));

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, 20));

        jLabel2.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione la ID del producto a eliminar:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 480, 30));

        jLabel4.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar un producto:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 480, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VentanaPeque+¦a.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClickActionPerformed

    //Botón confirmar
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        //Recoger id y pasarlo a integer
        int id = Integer.parseInt(txtID.getText());
        
        //Recoger la selección del usuario
        boolean confirmado = btnClick.isSelected();
        
        //En caso de que el usuario haya dado click se eliminará el producto, en caso contrario saltará una alerta
        if (confirmado == true) {
           String resultado = new ControladorProducto().eliminarProducto(id);
            
           //En caso de un error (id incorrecto) saltará un mensaje de error, en caso contrario cerrará la vista
           if(resultado.equals("error")){
                 JOptionPane.showMessageDialog(null, "La id introducida es incorrecta", "Alerta", JOptionPane.WARNING_MESSAGE);
           }else{
               this.setVisible(false);
           }
        } else {
             JOptionPane.showMessageDialog(null, "Confirme la eliminación del producto", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnClick;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
