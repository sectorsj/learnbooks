package ru.sectorsj.orailly.learnjava._511_dailyAdviceService;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
    String[] adviceList = {
            "Ешьте меньшими порциями",
            "Купите облегающие джинсы. Нет, они не делают Вас полнее.",
            "Два слова: не годится",
            "Будьте честны хотя бы сегодня.",
            "Скажите своему начальнику все, что вы *на самом деле* о нем думаете.",
            "Возможно Вам стоит подобрать другую прическу."
    };

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    private void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true){
                Socket socket =serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }
}
