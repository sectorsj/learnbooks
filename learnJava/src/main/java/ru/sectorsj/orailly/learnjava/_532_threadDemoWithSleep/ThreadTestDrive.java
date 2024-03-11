package ru.sectorsj.orailly.learnjava._532_threadDemoWithSleep;

public class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable threadTask = new MyRunnable();
        Thread myThread = new Thread(threadTask);
        myThread.start();

        System.out.println("Возвращение в метод main");
    }
}