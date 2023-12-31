/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author ernesto
 */
public class VentanaAgregar extends javax.swing.JFrame {

    /**
     * Creates new form AgregarUsuario
     */
    public VentanaAgregar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TFAgregar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RegresoDeAgregar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CloseVentanaAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(TFAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 280, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("NOMBE DE USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        RegresoDeAgregar.setText("REGRESAR");
        RegresoDeAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoDeAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(RegresoDeAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        jButton2.setText("AGREGAR");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        CloseVentanaAgregar.setText("X");
        CloseVentanaAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseVentanaAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(CloseVentanaAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFAgregarActionPerformed

    private void RegresoDeAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresoDeAgregarActionPerformed
        VentanaModificar v = new VentanaModificar();
        v.setLocationRelativeTo(null);
        v.show();
        this.dispose();
    }//GEN-LAST:event_RegresoDeAgregarActionPerformed

    private void CloseVentanaAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseVentanaAgregarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseVentanaAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseVentanaAgregar;
    private javax.swing.JButton RegresoDeAgregar;
    private javax.swing.JTextField TFAgregar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
