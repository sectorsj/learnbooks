package ru.sectorsj.java_for_biginners._12_multithreading._445_multi_thread_demo;

import java.util.Random;

// Подкласс MyThread создается наследованием
// Суперкласс Thread
class MyThread extends Thread {
    // Количество сообщений
    private int count;

    public MyThread(String name, int count) {
        // Вызов конструктора суперкласса
        super(name);
        // Значение целочисленного поля
        this.count = count;
        start();
    }

    // Переопределение метода run():

    @Override
    public void run() {
        // Отображение сообщения о запуске потока:
        System.out.println("Выполняется поток " + getName());
        // Создание объекта класса Random
        // для генерации случайных чисел:

        Random rnd = new Random();
        // Оператор цикла, в котором выводятся сообщения:
        for (int k = 1; k <= count; k++) {
            // В сообщении выдается первый символ имени потока (A, B, C)
            System.out.println("Сообщение от потока " + getName() + ":\t" + getName().charAt(0) + k);
            try{
                // Задержка в выполнении потока:
                Thread.sleep(1000 + rnd.nextInt(2001));
            }
            catch(InterruptedException e) {
                System.out.println("Прерывание потока " + getName());
            }
        }
        // Сообщение о завершении выполнения потока:
        System.out.println("Поток " + getName() + " завершен");
    }
}
