package ru.sectorsj.orailly.learnjava._516_simpleChatA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClientA {
    JTextField outging;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }

    // TODO Создаем GUI и подключаем слушатель для событий к кнопке отправки
    // TODO Вызываем метод setUPNetworking()
    public void go() {
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();
        outging = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outging);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        setUPNetworking();
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    // TODO Создаем Socket и PrintWriter
    // TODO Присваиваем PrintWriter переменной writer
    public void setUPNetworking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("network established");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public class SendButtonListener implements ActionListener {

        // TODO Получаем текст из текстового поля
        //  и отправляем его на сервер с помощью переменной writer(PrintWriter)
        @Override
        public void actionPerformed(ActionEvent e) {
           try {
               writer.println(outging.getText());
               writer.flush();

           } catch (Exception ex){
               ex.printStackTrace();
           }
           outging.setText("");
           outging.requestFocus();
        }
    }
}