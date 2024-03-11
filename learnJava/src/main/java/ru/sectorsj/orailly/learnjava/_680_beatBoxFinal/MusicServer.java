package ru.sectorsj.orailly.learnjava._680_beatBoxFinal;

import java.io.*;
import java.net.*;
import java.util.*;

public class MusicServer {
    ArrayList<ObjectOutputStream> clientOutputStreams;  // Создание списка для хранения потоков вывода клиентов

    public static void main(String[] args) {
        new MusicServer().go(); // Создание экземпляра класса MusicServer и вызов метода go()
    }

    // Метод, отвечающий за установку сервера и прослушивание подключений клиентов
    private void go() {
        clientOutputStreams = new ArrayList<ObjectOutputStream>();   // Инициализация списка для хранения потоков вывода клиентов
        try {
            ServerSocket serverSock = new ServerSocket(4242);   // Создание серверного сокета, прослушивающего порт 4242
            while (true) {                                           // Бесконечный цикл для прослушивания новых подключений
                Socket clientSocket = serverSock.accept();           // Принятие нового клиентского сокета
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());    // Получение потока вывода для отправки данных клиенту
                clientOutputStreams.add(out);   // Добавление потока вывода в список

                Thread t = new Thread(new ClientHandler(clientSocket)); // Создание нового потока для обработки данных от клиента
                t.start();  // Запуск потока

                System.out.println("Соединение установлено...");        // Вывод сообщения об установлении соединения с клиентом
            }
        } catch (Exception ex) {    // Обработка исключений
            ex.printStackTrace();   // Трассировка исключения
        }
    }

    // Внутренний класс, реализующий Runnable для обработки данных от клиентов
    public class ClientHandler implements Runnable {
        ObjectInputStream in;                   // Поток для чтения данных от клиента
        Socket clientSocket;                    // Сокет клиента
        public ClientHandler(Socket socket) {   // Конструктор класса ClientHandler
            try {
                clientSocket = socket;          // Присвоение сокета
                in = new ObjectInputStream(clientSocket.getInputStream());  // Получение потока ввода для чтения данных от клиента
            } catch (Exception ex) {    // Обработка исключений
                ex.printStackTrace();   // Трассировка исключения
            }
        }

        // Метод, который будет выполнен в потоке для обработки данных от клиента
        @Override
        public void run() {
            Object o2 = null;   // Объект для второго прочитанного сообщения
            Object o1 = null;   // Объект для первого прочитанного сообщения

            try {
                // Чтение данных от клиента и отправка их всем остальным клиентам
                while ((o1 = in.readObject()) != null) {            // Чтение первого объекта
                    o2 = in.readObject();                           // Чтение второго объекта
                    System.out.println("Считываем два объекта..."); // Вывод сообщения о чтении двух объектов
                    tellEveryone(o1, o2);                           // Отправка двух объектов всем клиентам
                }
            } catch (Exception ex) {    // Обработка исключений
                ex.printStackTrace();   // Трассировка исключения
            }
        }
    }

    // Метод, отправляющий два объекта всем клиентам
    public void tellEveryone(Object one, Object two) {
        Iterator<ObjectOutputStream> it = clientOutputStreams.iterator();   // Получение итератора для списка потоков вывода клиентов

        try {
            ObjectOutputStream out = (ObjectOutputStream) it.next();    // Получение следующего потока вывода из списка
            out.writeObject(one);   // Отправка первого объекта
            out.writeObject(two);   // Отправка второго объекта
        } catch (Exception ex) {    // Обработка исключений
            ex.printStackTrace();   // Трассировка исключения
        }
    }
}