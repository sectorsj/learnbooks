package ru.sectorsj.java_for_biginners._12_multithreading._430_creating_thread_demo;

class CreatingThreadDemo {
    public static void main(String[] args) {
        System.out.println("Начинается выполнение программы");

        Thread t = new Thread(new MyTread());
        System.out.println("Запускаем дочерний поток");
        t.start();

        for (int k = 0; k <= 5; k++) {
            System.out.println("Главный поток:\t" + (char) ('A' + k));

            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                System.out.println("Прерывание главного потока");
            }
        }
        System.out.println("Выполнение программы закончено");
    }
}
