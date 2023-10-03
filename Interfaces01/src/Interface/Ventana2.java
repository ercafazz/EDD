package Interface;

public class Ventana2 extends javax.swing.JFrame {

    public Ventana2() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BotonVerGrafo = new javax.swing.JButton();
        BotonModificarGrafo = new javax.swing.JButton();
        RegresarDeV2 = new javax.swing.JButton();
        CloseV2 = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Bienvenida.setText("Bienvenido");
        jPanel1.add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Análisis de la fuerte conectividad entre usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));
        jPanel1.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 440, 270));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Seleccione el archivo que desea estudiar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Iniciar estudio");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 160, 40));

        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 700, 500));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonVerGrafo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        BotonVerGrafo.setText("VER GRAFO");
        BotonVerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerGrafoActionPerformed(evt);
            }
        });
        jPanel2.add(BotonVerGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        BotonModificarGrafo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        BotonModificarGrafo.setText("MODIFICAR GRAFO");
        BotonModificarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarGrafoActionPerformed(evt);
            }
        });
        jPanel2.add(BotonModificarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        RegresarDeV2.setText("REGRESAR");
        RegresarDeV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarDeV2ActionPerformed(evt);
            }
        });
        jPanel2.add(RegresarDeV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        CloseV2.setText("X");
        CloseV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseV2ActionPerformed(evt);
            }
        });
        jPanel2.add(CloseV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegresarDeV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarDeV2ActionPerformed
       Ventana1 v1 = new Ventana1();
       v1.setLocationRelativeTo(null);
       v1.show();
       this.dispose();
    }//GEN-LAST:event_RegresarDeV2ActionPerformed

    private void CloseV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseV2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_CloseV2ActionPerformed

    private void BotonModificarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarGrafoActionPerformed
        VentanaModificar v3 = new VentanaModificar();
        this.dispose();
        v3.setLocationRelativeTo(null);
        v3.show();
    }//GEN-LAST:event_BotonModificarGrafoActionPerformed

    private void BotonVerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerGrafoActionPerformed
        Grafo v = new Grafo();
        this.dispose();
        v.setLocationRelativeTo(null);
        v.show();
    }//GEN-LAST:event_BotonVerGrafoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton BotonModificarGrafo;
    private javax.swing.JButton BotonVerGrafo;
    private javax.swing.JButton CloseV2;
    private javax.swing.JButton RegresarDeV2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}