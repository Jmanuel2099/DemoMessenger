package gui;

import MessengerServer.SocketMessenger;
import demomessengerserver.SocketController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jmanu
 */
public class Gui extends javax.swing.JFrame {

    private int port;
    private String dirIP;
    private SocketController socketController;
    private ArrayList<String> users;
    private ArrayList<String> messagesAll;
    private ArrayList<String> messagesPrivate;
    private final SocketController sc;

    //private SocketMessenger socketMessenger;
    public Gui() {
        this.port = 21212;
        this.dirIP = "127.0.0.1";
        try {
            this.socketController = new SocketController(this.dirIP, this.port);
        } catch (IOException ex) {
            Logger.getLogger(SocketMessenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sc = this.socketController;
        this.users = new ArrayList<>();
        this.messagesAll = new ArrayList<>();
        this.messagesPrivate = new ArrayList<>();
        initComponents();
        this.CB_Users.removeAllItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitleMessPublic = new javax.swing.JLabel();
        lbTitleUsers = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        T_F_Message = new javax.swing.JTextField();
        T_F_NameUser = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbUsers = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbMessagePublic = new javax.swing.JLabel();
        lbTitleMessPrivate = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbMessPrivate = new javax.swing.JLabel();
        CB_Users = new javax.swing.JComboBox<>();
        lbUsersCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat");
        setResizable(false);

        lbTitleMessPublic.setText("Mensajes Publicos");

        lbTitleUsers.setText("Usuarios");

        btnEnviar.setBackground(new java.awt.Color(51, 51, 51));
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(51, 51, 51));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        T_F_Message.setBackground(new java.awt.Color(153, 153, 153));
        T_F_Message.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        T_F_Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_F_MessageActionPerformed(evt);
            }
        });

        T_F_NameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_F_NameUserActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lbUsers.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(lbUsers);

        lbMessagePublic.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane2.setViewportView(lbMessagePublic);

        lbTitleMessPrivate.setText("Mensajes privados");

        lbMessPrivate.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane3.setViewportView(lbMessPrivate);

        CB_Users.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CB_Users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_UsersActionPerformed(evt);
            }
        });

        lbUsersCount.setText("Uuarios conectados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(T_F_NameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(lbTitleMessPublic)
                                        .addGap(303, 303, 303))
                                    .addComponent(lbTitleMessPrivate, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTitleUsers)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lbUsersCount))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(T_F_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEnviar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CB_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_F_NameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitleUsers)
                    .addComponent(lbTitleMessPublic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbUsersCount)
                        .addGap(18, 18, 18)
                        .addComponent(T_F_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnviar)
                            .addComponent(CB_Users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbTitleMessPrivate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String message = this.T_F_Message.getText();
        if (message.length() != 0) {
            String destination = this.CB_Users.getSelectedItem().toString();
            if (destination.equals("Publico")) {
                sendPublicMessage(message);
                this.lbMessagePublic.setText(getMessagesPublic());
            } else {
                sendPrivateMessage(message, destination);
                this.lbMessPrivate.setText(getMessagesPrivate());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Mensaje vacio. ", "CAMPO VACIO", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnEnviarActionPerformed

    private void T_F_MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_F_MessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_F_MessageActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        /*this.socketMessenger.exit();
        this.btnRegistrar.setEnabled(true);
        this.T_F_NameUser.setText(null);
        this.T_F_NameUser.setEditable(true);*/
    }//GEN-LAST:event_btnSalirActionPerformed

    private void T_F_NameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_F_NameUserActionPerformed

    }//GEN-LAST:event_T_F_NameUserActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nameUser = this.T_F_NameUser.getText();
        if (nameUser.length() != 0) {
            this.RegisterUser(nameUser);
            this.btnRegistrar.setEnabled(false);
            this.T_F_NameUser.setEditable(false);
            this.readText();
        } else {
            JOptionPane.showMessageDialog(null, "Campo vacio. ", "CAMPO VACIO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void CB_UsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_UsersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_UsersActionPerformed

    public void RegisterUser(String usuario) {
        String command = "REGISTER " + usuario;
        if (this.sc != null) {
            sc.writeText(command);
        }
    }

    public void readText() {
        this.socketController.start(() -> {
            while (true) {
                read(sc.readText());
            }
        });
    }

    public void read(String dato) {
        String[] datos = dato.split(" ");
        if ("5000".equals(datos[0])) {
            String[] userList = datos[1].split(";");
            this.lbUsers.setText(getUsers(userList));
            setUsersConnect(userList.length);
            setItemBox(userList);
        }
        if ("4000".equals(datos[0])) {
            this.messagesPrivate.add(sentMessage());
            this.lbMessPrivate.setText(getMessagesPrivate());
        }
        if ("4010".equals(datos[0]) ) {
            String message = datos[1] + ": ";
            for (int i = 2; i < datos.length; i++) {
                message += datos[i] + " ";
            }
            this.messagesPrivate.add(message);
            this.lbMessPrivate.setText(getMessagesPrivate());
        }

        if ("2000".equals(datos[0])) {
            this.messagesAll.add(sentMessage());
            this.lbMessagePublic.setText(getMessagesPublic());
        }
        if ("2010".equals(datos[0])) {
            String message = datos[1] + ": ";
            for (int i = 2; i < datos.length; i++) {
                message += datos[i] + " ";
            }
            this.messagesAll.add(message);
            this.lbMessagePublic.setText(getMessagesPublic());
        }
    }

    public void sendPrivateMessage(String message, String user) {
        String command = "SEND " + user + " " + message;
        this.sc.writeText(command);
    }

    public void sendPublicMessage(String message) {
        String command = "SENDALL " + message;
        this.sc.writeText(command);
    }

    public void exit() {
        String command = "QUIT";
        this.socketController.writeText(command);
    }

    private String getUsers(String[] usersName) {
        String usersM = "<html>";
        for (int i = 0; i < usersName.length; i++) {
            usersM += usersName[i] + " <br>";
        }
        usersM = usersM + "<html>";
        return usersM;
    }

    private String getMessagesPublic() {
        String messages = "<html>";
        for (int i = 0; i < this.messagesAll.size(); i++) {
            messages += this.messagesAll.get(i) + " <br>";
        }
        messages = messages + "<html>";
        return messages;
    }

    private String getMessagesPrivate() {
        String messages = "<html>";
        for (int i = 0; i < this.messagesPrivate.size(); i++) {
            messages += this.messagesPrivate.get(i) + " <br>";
        }
        messages = messages + "<html>";
        return messages;
    }

    public void setItemBox(String[] userList) {
        this.CB_Users.removeAllItems();
        this.CB_Users.addItem("Publico");
        for (int i = 0; i < userList.length; i++) {
            if (!userList[i].equals(this.T_F_NameUser.getText())) {
                this.CB_Users.addItem(userList[i]);
            }
            
        }
    }
    
    public void setUsersConnect(int usersCount){
        this.lbUsersCount.setText("usuarios conectados: " + usersCount);
    }
    
    public String sentMessage(){
        return "Tu: " + this.T_F_Message.getText();   
    }

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
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_Users;
    private javax.swing.JTextField T_F_Message;
    private javax.swing.JTextField T_F_NameUser;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbMessPrivate;
    private javax.swing.JLabel lbMessagePublic;
    private javax.swing.JLabel lbTitleMessPrivate;
    private javax.swing.JLabel lbTitleMessPublic;
    private javax.swing.JLabel lbTitleUsers;
    private javax.swing.JLabel lbUsers;
    private javax.swing.JLabel lbUsersCount;
    // End of variables declaration//GEN-END:variables
}
