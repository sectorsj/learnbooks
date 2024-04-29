package ru.sectorsj._12_multithreading._454_synchronized_threads_demo;

// Главный класс:
public class SynchronizedThreadsDemo {

    // Главный метод:
    public static void main(String[] args) {

        // Целочисленные переменные:
        int n = 100, count = 5, time = 1000, dt = 200;

        // Создание объекта с целочисленным полем:
        MyNumber obj = new MyNumber();

        // Присваивание полю объекта значения:
        obj.number = n;

        // Создание 1-го потока:
        MyThread Alpha = new MyThread("Alpha", obj, time + dt, count, true);

        // Создание 2-го потока:
        MyThread Bravo = new MyThread("Bravo", obj, time - dt, count, false);

        // Контролируемый код:
        try {
            // Ожидание завершения потока:
            if (Alpha.isAlive()) Alpha.join();
            if (Bravo.isAlive()) Bravo.join();
        }
        catch (InterruptedException e) {
            System.out.println("something went wrong" + e);
        }
    }
}
