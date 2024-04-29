package ru.sectorsj._12_multithreading._439_extending_thread_demo;

class ExtendingThreadDemo {
    public static void main(String[] args)throws InterruptedException {
        MyThread t = new MyThread();
        System.out.println("Запускается дочерний поток");
        t.start();

        for (int k = 0; k <= 5; k++) {
            System.out.println("Главный поток:\t" + (char)('A' + k));
            Thread.sleep(2000);
        }
        if (t.isAlive()) {
            t.join();
        }
        System.out.println("Выполнение программы завершено");
    }
}
