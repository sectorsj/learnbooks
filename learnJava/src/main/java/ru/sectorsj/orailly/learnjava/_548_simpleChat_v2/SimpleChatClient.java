package ru.sectorsj.orailly.learnjava._548_simpleChat_v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    // TODO Создаем GUI и подключаем слушатель для событий к кнопке отправки
    // TODO Вызываем метод setUPNetworking()
    public void go() {
        JFrame frame = new JFrame("Simple Chat Client");
        JPanel mainPanel = new JPanel();

        // Добавлено
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);
        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        // Добавлено
        mainPanel.add(qScroller);

        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        setUPNetworking();

        // Добавлено
        Thread readerThread = new Thread(new IncomingReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(600, 500);
        frame.setVisible(true);
    }

    // TODO Создаем Socket и PrintWriter
    // TODO Присваиваем PrintWriter переменной writer
    public void setUPNetworking() {
        try {
            socket = new Socket("127.0.0.1", 5000);

            // Добавлено
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);

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
               writer.println(outgoing.getText());
               writer.flush();

           } catch (Exception ex){
               ex.printStackTrace();
           }
           outgoing.setText("");
           outgoing.requestFocus();
        }
    }

    // Добавлено
    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            String message;
            try {
                while ((message = reader.readLine()) != null) {
                    System.out.println("read " + message);
                    // final String finalMessage  = message;
                    // SwingUtilities.invokeLater(() -> incoming.append(finalMessage + "\n"));
                    incoming.append(message + "\n");
                }
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }
}