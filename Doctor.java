/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmc;

/**
 *
 * @author DELL
 */
public class Doctor extends javax.swing.JFrame {

   
    /**
     * Creates new form Doctor
     */
    public Doctor() {
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
        homebtn = new javax.swing.JButton();
        AddDoc = new javax.swing.JButton();
        DeleteDoc = new javax.swing.JButton();
        UpdateDoc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        homebtn.setBackground(new java.awt.Color(255, 255, 0));
        homebtn.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        homebtn.setText("HOME");
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        jPanel1.add(homebtn);
        homebtn.setBounds(820, 521, 120, 40);

        AddDoc.setBackground(new java.awt.Color(255, 255, 255));
        AddDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddDoc.setForeground(new java.awt.Color(0, 0, 204));
        AddDoc.setText("Add Doctors");
        AddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDocActionPerformed(evt);
            }
        });
        jPanel1.add(AddDoc);
        AddDoc.setBounds(510, 110, 180, 40);

        DeleteDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteDoc.setForeground(new java.awt.Color(0, 0, 204));
        DeleteDoc.setText("Delete Doctors");
        DeleteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteDocActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteDoc);
        DeleteDoc.setBounds(770, 110, 190, 40);

        UpdateDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateDoc.setForeground(new java.awt.Color(0, 0, 204));
        UpdateDoc.setText("Update Doctors");
        UpdateDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateDocActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateDoc);
        UpdateDoc.setBounds(620, 220, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hmc/d3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-70, 0, 1270, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
       // Doctor.setVisible(false);
        hms second = new hms();
        second.setVisible(true);
        dispose();
    }//GEN-LAST:event_homebtnActionPerformed

    private void AddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDocActionPerformed
        // TODO add your handling code here:
        new adddoctor().setVisible(true);
    }//GEN-LAST:event_AddDocActionPerformed

    private void DeleteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteDocActionPerformed
        // TODO add your handling code here:
        new DeleteDoctor().setVisible(true);
    }//GEN-LAST:event_DeleteDocActionPerformed

    private void UpdateDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateDocActionPerformed
        // TODO add your handling code here:
        new updatedoctor().setVisible(true);
    }//GEN-LAST:event_UpdateDocActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDoc;
    private javax.swing.JButton DeleteDoc;
    private javax.swing.JButton UpdateDoc;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    
}
