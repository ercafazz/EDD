/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author ernesto
 */
public class AgregarRelacion extends javax.swing.JFrame {

    /**
     * Creates new form AgregarRelacion
     */
    public AgregarRelacion() {
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
        jLabel2 = new javax.swing.JLabel();
        TFUsuarioOrigen = new javax.swing.JTextField();
        CloseVentanaAgregarRelacion = new javax.swing.JButton();
        CambiosRelacion = new javax.swing.JButton();
        RegresoDeAgregarRelacion = new javax.swing.JButton();
        TFUsuarioDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setText("Usuario origen");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        TFUsuarioOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioOrigenActionPerformed(evt);
            }
        });
        jPanel1.add(TFUsuarioOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 280, 50));

        CloseVentanaAgregarRelacion.setText("X");
        CloseVentanaAgregarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseVentanaAgregarRelacionActionPerformed(evt);
            }
        });
        jPanel1.add(CloseVentanaAgregarRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, 30));

        CambiosRelacion.setText("GUARDAR CAMBIOS");
        jPanel1.add(CambiosRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        RegresoDeAgregarRelacion.setText("REGRESAR");
        RegresoDeAgregarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoDeAgregarRelacionActionPerformed(evt);
            }
        });
        jPanel1.add(RegresoDeAgregarRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        TFUsuarioDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(TFUsuarioDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 280, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setText("Usuario destino");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFUsuarioOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioOrigenActionPerformed

    private void CloseVentanaAgregarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseVentanaAgregarRelacionActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseVentanaAgregarRelacionActionPerformed

    private void RegresoDeAgregarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresoDeAgregarRelacionActionPerformed
        VentanaModificar v = new VentanaModificar();
        v.setLocationRelativeTo(null);
        v.show();
        this.dispose();
    }//GEN-LAST:event_RegresoDeAgregarRelacionActionPerformed

    private void TFUsuarioDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioDestinoActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRelacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiosRelacion;
    private javax.swing.JButton CloseVentanaAgregarRelacion;
    private javax.swing.JButton RegresoDeAgregarRelacion;
    private javax.swing.JTextField TFUsuarioDestino;
    private javax.swing.JTextField TFUsuarioOrigen;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
