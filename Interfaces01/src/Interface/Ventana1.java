package Interface;

public class Ventana1 extends javax.swing.JFrame {

    public Ventana1() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFileChooser = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        BotonIniciarEstudio = new javax.swing.JButton();
        CloseV1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Bienvenida.setText("Bienvenido");
        jPanel1.add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Análisis de la fuerte conectividad entre usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooserActionPerformed(evt);
            }
        });
        jPanel1.add(jFileChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 440, 270));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione el archivo que desea analizar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        BotonIniciarEstudio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonIniciarEstudio.setText("Iniciar estudio");
        BotonIniciarEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarEstudioActionPerformed(evt);
            }
        });
        jPanel1.add(BotonIniciarEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 160, 40));

        CloseV1.setText("X");
        CloseV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseV1ActionPerformed(evt);
            }
        });
        jPanel1.add(CloseV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseV1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseV1ActionPerformed

    private void BotonIniciarEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarEstudioActionPerformed
        Ventana2 ventana2 = new Ventana2();
        ventana2.setLocationRelativeTo(null);
        ventana2.show();
        this.dispose();
    }//GEN-LAST:event_BotonIniciarEstudioActionPerformed

    private void jFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooserActionPerformed

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton BotonIniciarEstudio;
    private javax.swing.JButton CloseV1;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}