/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessengerServer;

import demomessengerserver.SocketController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jmanu
 */
public class SocketMessenger {

    private int port;
    private String dirIP;
    private SocketController socketController;
    private ArrayList<String> users;
    private ArrayList<String> messageAll;
    private ArrayList<String> messagePrivate;
    private final SocketController sc;

    public SocketMessenger() {
        this.port = 21212;
        this.dirIP = "127.0.0.1";
        try {
            this.socketController = new SocketController(this.dirIP, this.port);
        } catch (IOException ex) {
            Logger.getLogger(SocketMessenger.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.sc = this.socketController;
        this.users = new ArrayList<>();
        this.messageAll = new ArrayList<>();
        this.messagePrivate = new ArrayList<>();
    }

    public ArrayList<String> getUserNames() {
        return users;
    }

    public ArrayList<String> getMessageAll() {
        return messageAll;
    }

    public ArrayList<String> getMessagePrivate() {
        return messagePrivate;
    }

    public void RgisterUser(String usuario) {
        String command = "REGISTER " + usuario;
        if (this.sc != null) {
            sc.writeText(command);
        }
    }

    public void read(String dato) {
        String[] datos = dato.split(" ");
        System.out.println("- " + datos[0] + " * " + datos[1]);

        if ("5000".equals(datos[0])) {
            System.out.println("entro user");
            String[] userList = datos[1].split(";");
            for (int i = 0; i < userList.length; i++) {
                this.users.add(userList[i]);
            }
            //System.out.println("lenus "+ users.size());
        }
        if ("4010".equals(datos[0])) {
            String message = "";
            for (int i = 1; i < datos.length; i++) {
                message += datos[i];
            }
            this.messagePrivate.add(message);
        }

        if ("2010".equals(datos[0]) || "2000".equals(datos[0]) ) {
            System.out.println("Entro all");
            String message = "";
            for (int i = 1; i < datos.length; i++) {
                message += datos[i];
            }
            this.messageAll.add(message);
        }
    }

    public void readText() {
        this.socketController.start(() -> {
            while (true) {
                read(sc.readText());
            }
        });
    }

    public Thread getThread() {
        return this.socketController.getThread();
    }

    public void getUsers() {
        if (this.socketController != null) {
            String command = "GETUSERNAMES";
            this.sc.writeText(command);
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
}
