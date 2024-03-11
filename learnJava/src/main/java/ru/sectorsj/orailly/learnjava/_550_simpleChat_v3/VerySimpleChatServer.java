package ru.sectorsj.orailly.learnjava._550_simpleChat_v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class VerySimpleChatServer {
    ArrayList clientOutputStream;

    public static void main(String[] args) {
        new VerySimpleChatServer().go();
    }

    private void go() {
        clientOutputStream = new ArrayList();
        try {
            ServerSocket serverSock = new ServerSocket(5000);
            while (true) {
                Socket clientSocket = serverSock.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientOutputStream.add(writer);

                SimpleChatClient client = new SimpleChatClient("имя_клиента"); // Здесь вы должны установить имя клиента
                Thread thread = new Thread(new ClientHandler(clientSocket, client.getClientName()));
                thread.start();
                System.out.println("got a connection");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;
        String clientName;

        public ClientHandler(Socket clientSocket, String clientName) {
            try {
                sock = clientSocket;
                this.clientName = clientName;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    tellEveryone(message);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void tellEveryone(String message) {
        Iterator it = clientOutputStream.iterator();
        while (it.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) it.next();
                writer.println(message);
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
