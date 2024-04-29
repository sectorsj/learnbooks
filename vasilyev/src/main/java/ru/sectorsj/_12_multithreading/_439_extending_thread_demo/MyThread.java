package ru.sectorsj._12_multithreading._439_extending_thread_demo;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Дочерний поток:\t" + i);
            try {
                Thread.sleep(4500);
            }
            catch (InterruptedException e) {
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
