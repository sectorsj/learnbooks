package ru.sectorsj.orailly.learnjava._508_serverClientConnectionDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class WriteSocketData {
    public static void main(String[] args) {
        WriteSocketData app = new WriteSocketData();
        app.go();
    }

    private void go() {
        try {
            Socket chatSocket = new Socket("127.0.0.1", 5000);
            PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
            writer.println("Сообщение для отправки");
            writer.print("Другое сообщение");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
