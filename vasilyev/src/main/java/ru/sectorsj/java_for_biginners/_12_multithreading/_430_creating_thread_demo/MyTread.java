package ru.sectorsj.java_for_biginners._12_multithreading._430_creating_thread_demo;

class MyTread implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Дочерний поток:\t" + i );
            try {
                Thread.sleep(1200);
            }
            catch (InterruptedException e) {
                System.out.println("Прерывание дочернего потока");
            }
        }
    }
}
