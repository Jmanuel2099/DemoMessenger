/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessengerServer;

import demomessengerserver.SocketController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmanu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SocketMessenger socketMessenger = new SocketMessenger();
        socketMessenger.RgisterUser("usuario99");
        socketMessenger.readText();
        //socketMessenger.getUsers();
        //socketMessenger.sendPrivateMessage("hola usuaro1", "usuario1");
        socketMessenger.sendPublicMessage("hola a todos");

        //socketMessenger.exit();
        try {
            socketMessenger.getThread().sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < socketMessenger.getUserNames().size(); i++) {
            System.out.println(socketMessenger.getUserNames().get(i));
        }
        System.out.println("lenssss " + socketMessenger.getUserNames().size());

        /* SocketController socketController = null;
        try {
            socketController = new SocketController("127.0.0.1", 21212);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (socketController != null) {
            final SocketController sc = socketController;
            sc.writeText("REGISTER usuario1");
            socketController.start(() -> {
                while (true) {
                    System.out.println(sc.readText());
                }
            });
        }*/
    }
}
