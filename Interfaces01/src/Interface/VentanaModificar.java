/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

/**
 *
 * @author ernesto
 */
public class VentanaModificar extends javax.swing.JFrame {

    /**
     * Creates new form VentanaModificar
     */
    public VentanaModificar() {
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
        BotonAgregarRelacion = new javax.swing.JButton();
        BotonEliminarUsuario = new javax.swing.JButton();
        BotonAgregarUsuario = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        RegresarDeModificar = new javax.swing.JButton();
        CloseVentanaModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAgregarRelacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonAgregarRelacion.setText("AGREGAR RELACIÓN");
        BotonAgregarRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarRelacionActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAgregarRelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        BotonEliminarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonEliminarUsuario.setText("ELIMINAR USUARIO");
        BotonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BotonEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        BotonAgregarUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotonAgregarUsuario.setText("AGREGAR USUARIO");
        BotonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(BotonAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jButton4.setText("GUARDAR CAMBIOS");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        RegresarDeModificar.setText("REGRESAR");
        RegresarDeModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarDeModificarActionPerformed(evt);
            }
        });
        jPanel1.add(RegresarDeModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        CloseVentanaModificar.setText("X");
        CloseVentanaModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseVentanaModificarActionPerformed(evt);
            }
        });
        jPanel1.add(CloseVentanaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 730, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarRelacionActionPerformed
        AgregarRelacion v = new AgregarRelacion();
        v.setLocationRelativeTo(null);
        v.show();
        this.dispose();
    }//GEN-LAST:event_BotonAgregarRelacionActionPerformed

    private void BotonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarUsuarioActionPerformed
        VentanaAgregar v = new VentanaAgregar();
        v.setLocationRelativeTo(null);
        v.show();
        this.dispose();
    }//GEN-LAST:event_BotonAgregarUsuarioActionPerformed

    private void RegresarDeModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarDeModificarActionPerformed
        Ventana2 v2 = new Ventana2();
        this.dispose();
        v2.setLocationRelativeTo(null);
        v2.show();
    }//GEN-LAST:event_RegresarDeModificarActionPerformed

    private void CloseVentanaModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseVentanaModificarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseVentanaModificarActionPerformed

    private void BotonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarUsuarioActionPerformed
        VentanaEliminar v = new VentanaEliminar();
        v.setLocationRelativeTo(null);
        v.show();
        this.dispose();
    }//GEN-LAST:event_BotonEliminarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarRelacion;
    private javax.swing.JButton BotonAgregarUsuario;
    private javax.swing.JButton BotonEliminarUsuario;
    private javax.swing.JButton CloseVentanaModificar;
    private javax.swing.JButton RegresarDeModificar;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}