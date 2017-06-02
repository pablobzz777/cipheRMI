
package cipher;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cipher extends javax.swing.JFrame {
    public EncryptMsg ec;
    public Registry registry;
    public MetodosRemotos mr;

    public Cipher() throws RemoteException, NotBoundException {
        initComponents();
        registry = LocateRegistry.getRegistry(1099);
        mr = (MetodosRemotos) registry.lookup("cipheRMI");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        windowTItle = new javax.swing.JLabel();
        inputDataPanel = new javax.swing.JPanel();
        message = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        generateMsgBtn = new javax.swing.JButton();
        ecMessagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        descifrarMessageBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ecMessageField = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dcMessageField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(53, 53, 53));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));

        windowTItle.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        windowTItle.setForeground(new java.awt.Color(255, 255, 255));
        windowTItle.setText("¡cipheRMI!");

        inputDataPanel.setBackground(new java.awt.Color(53, 53, 53));
        inputDataPanel.setPreferredSize(new java.awt.Dimension(250, 210));

        message.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText("Mensaje:");

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        generateMsgBtn.setText("Cifrar mensaje");
        generateMsgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateMsgBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputDataPanelLayout = new javax.swing.GroupLayout(inputDataPanel);
        inputDataPanel.setLayout(inputDataPanelLayout);
        inputDataPanelLayout.setHorizontalGroup(
            inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputDataPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generateMsgBtn)
                .addGap(76, 76, 76))
            .addGroup(inputDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(inputDataPanelLayout.createSequentialGroup()
                        .addComponent(message)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inputDataPanelLayout.setVerticalGroup(
            inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateMsgBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ecMessagePanel.setBackground(new java.awt.Color(53, 53, 53));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mensaje cifrado:");

        descifrarMessageBtn.setText("Descifrar mensaje");
        descifrarMessageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descifrarMessageBtnActionPerformed(evt);
            }
        });

        ecMessageField.setEditable(false);
        ecMessageField.setColumns(20);
        ecMessageField.setRows(5);
        jScrollPane2.setViewportView(ecMessageField);

        javax.swing.GroupLayout ecMessagePanelLayout = new javax.swing.GroupLayout(ecMessagePanel);
        ecMessagePanel.setLayout(ecMessagePanelLayout);
        ecMessagePanelLayout.setHorizontalGroup(
            ecMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecMessagePanelLayout.createSequentialGroup()
                .addGroup(ecMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ecMessagePanelLayout.createSequentialGroup()
                        .addGroup(ecMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ecMessagePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(ecMessagePanelLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(descifrarMessageBtn)))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        ecMessagePanelLayout.setVerticalGroup(
            ecMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ecMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descifrarMessageBtn)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(53, 53, 53));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mensaje descifrado:");

        dcMessageField.setEditable(false);
        dcMessageField.setColumns(20);
        dcMessageField.setRows(5);
        jScrollPane3.setViewportView(dcMessageField);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(inputDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(ecMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(windowTItle)
                .addGap(253, 253, 253))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(windowTItle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ecMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateMsgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateMsgBtnActionPerformed
        if (messageTextArea.getText() != ""){
            try {
                ec = mr.cifrarMensaje(messageTextArea.getText());
                ecMessageField.setText(ec.ecMessageField);
            } catch (RemoteException ex) {
                Logger.getLogger(Cipher.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }        
    }//GEN-LAST:event_generateMsgBtnActionPerformed

    private void descifrarMessageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descifrarMessageBtnActionPerformed
       
        if(!ec.ecMessage.isEmpty()){
            try {
                dcMessageField.setText(mr.descifrarMensaje(ec.ecMessage));
            } catch (RemoteException ex) {
                Logger.getLogger(Cipher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_descifrarMessageBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Cipher().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(Cipher.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NotBoundException ex) {
                    Logger.getLogger(Cipher.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dcMessageField;
    private javax.swing.JButton descifrarMessageBtn;
    private javax.swing.JTextArea ecMessageField;
    private javax.swing.JPanel ecMessagePanel;
    private javax.swing.JButton generateMsgBtn;
    private javax.swing.JPanel inputDataPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel message;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel windowTItle;
    // End of variables declaration//GEN-END:variables
}
