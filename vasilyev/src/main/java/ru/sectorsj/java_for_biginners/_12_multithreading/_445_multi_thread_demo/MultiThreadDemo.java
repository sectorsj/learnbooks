package ru.sectorsj.java_for_biginners._12_multithreading._445_multi_thread_demo;

// Главный класс
class MultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинает выполняться главный поток");
        // Создание объектов - запуск потоков:
        MyThread A = new MyThread("ALPHA", 5);
        MyThread B = new MyThread("BRAVO", 3);
        MyThread C = new MyThread("CHARLIE", 7);

        // Сообщения главного потока
        for (int k = 1; k <= 4; k++) {
            System.out.println("Сообщение от главного потока:\t" + k);
            // Задержка в выполнении потока
            Thread.sleep(2000);
        }
        // Ожидание завершения дочерних потоков
        if (A.isAlive()) {
            A.join();
        }
        if (B.isAlive()) {
            B.join();
        }
        if (C.isAlive()) {
            C.join();
        }
        // Сообщение о завершении главного потока
        System.out.println("Главный поток завершен");
    }
}
