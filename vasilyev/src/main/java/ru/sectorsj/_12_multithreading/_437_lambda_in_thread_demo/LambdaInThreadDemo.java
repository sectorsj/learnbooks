package ru.sectorsj._12_multithreading._437_lambda_in_thread_demo;

class LambdaInThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинается выполнение программы");

        Runnable r = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Дочерний поток:\t" + i);
                try {
                    Thread.sleep(4500);
                }
                catch (InterruptedException e) {
                    System.out.println("Прерывание дочернего потока");
                }
            }
        };

        Thread t = new Thread(r);

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
