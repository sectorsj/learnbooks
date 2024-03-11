package ru.sectorsj.orailly.learnjava._508_serverClientConnectionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReadSocketData {
    public static void main(String[] args) {
        ReadSocketData app = new ReadSocketData();
        app.go();
    }

    private void go() {
        try {
            Socket chatSocket = new Socket("127.0.0.1", 5000);
            InputStreamReader isr = new InputStreamReader(chatSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String message = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
