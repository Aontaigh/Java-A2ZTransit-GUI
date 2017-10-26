package GUIs;

import java.util.Locale;

public class UserSelection extends javax.swing.JFrame {
    
    public UserSelection() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        flagPanel = new javax.swing.JPanel();
        englishButton = new javax.swing.JButton();
        frenchButton = new javax.swing.JButton();
        spanishButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A2Z");

        flagPanel.setLayout(new java.awt.GridLayout(3, 0));

        englishButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/british-flag.png"))); // NOI18N
        englishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishButtonActionPerformed(evt);
            }
        });
        flagPanel.add(englishButton);

        frenchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/french-flag.png"))); // NOI18N
        frenchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchButtonActionPerformed(evt);
            }
        });
        flagPanel.add(frenchButton);

        spanishButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/spanish-flag.png"))); // NOI18N
        spanishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spanishButtonActionPerformed(evt);
            }
        });
        flagPanel.add(spanishButton);

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(flagPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void englishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishButtonActionPerformed
        Main.setMyLocale(new Locale("en", "GB"));
        Main myMain = new Main();
        myMain.setVisible(true); 
        dispose();
    }//GEN-LAST:event_englishButtonActionPerformed

    private void frenchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frenchButtonActionPerformed
        Main.setMyLocale(new Locale("fr", "FR"));
        Main myMain = new Main();
        myMain.setVisible(true); 
        dispose();
    }//GEN-LAST:event_frenchButtonActionPerformed

    private void spanishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spanishButtonActionPerformed
        Main.setMyLocale(new Locale("es", "ES"));
        Main myMain = new Main();
        myMain.setVisible(true); 
        dispose();
    }//GEN-LAST:event_spanishButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton englishButton;
    private javax.swing.JPanel flagPanel;
    private javax.swing.JButton frenchButton;
    private javax.swing.JButton spanishButton;
    // End of variables declaration//GEN-END:variables
}
