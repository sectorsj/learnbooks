package ru.sectorsj.orailly.learnjava._533_runThreadsDemo;

public class RunThreadsDemo implements Runnable{
    public static void main(String[] args) {
        String str = "поток";
        RunThreadsDemo runner = new RunThreadsDemo();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName(str + " " + "Альфа");
        beta.setName(str + " " + "Бета");
        alpha.start();
        beta.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Сейчас работает " + threadName);
        }
    }
}