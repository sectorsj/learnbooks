package ru.sectorsj.java_for_biginners._12_multithreading._434_new_thread_demo;

import lombok.extern.java.Log;

@Log
class NewThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Начинаем выполнение программы");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Дочерний поток:\t" + i);
                    try {
                        Thread.sleep(4500);
                    } catch (InterruptedException e) {
                        System.out.println("Прерывание дочернего потока");
                    }
                }
            }
        });
        System.out.println("Запускается дочерний поток");

        t.start();

        for (int k = 0; k <= 5; k++) {
            System.out.println("Главный поток:\t" + (char) ('A' + k));
            Thread.sleep(2000);
        }

        if (t.isAlive()) {
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}
