package ru.sectorsj._12_multithreading._450_daemon_thread_demo;

import static javax.swing.JOptionPane.*;

public class DaemonThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        // Создание объекта для дочернего потока. Первый
        // Аргумент конструктору является лямбда-выражением
        // Второй аргумент - название потока:
        Thread t = new Thread(()->{

            // Индексная переменная и переменная для записи суммы чисел
            int k = 1, s = 0;
            // Бесконечный цикл для вычисления суммы:
            while (true) {
                // Отображение сообщения:
                System.out.println(Thread.currentThread().getName() + ": " + s);
                try {
                    // Задержка в выполнении потока:
                    Thread.sleep(1000);
                } // Обработка исключения
                catch(InterruptedException e) {}

                // Прибавление слагаемого к сумме:
                // Тут может более сложная логика
                s += k;

                // Увеличение значения индексной переменной
                k++;
            }
        }, "Вычисление суммы");

        // Статус демон-потока:
        t.setDaemon(true);

        // Переменная для записи,
        // результат выбора пользователя (нажата кнопка):
        int res;

        // Запуск потока на выполнение:
        t.start();

        // Отображение диалогового окна:
        do {
            // Задержка в выполнении потока:
            Thread.sleep(3000);

            // Отображение окна и запоминание выбора пользователя:
            res = showConfirmDialog(null,
                    // Текст в окне:
                    "Закончить вычисление суммы?",
                    // Название окна:
                    "Сумма чисел",
                    // Кнопки в окне:
                    YES_NO_OPTION);
        } while(res != YES_OPTION);
    }
}
