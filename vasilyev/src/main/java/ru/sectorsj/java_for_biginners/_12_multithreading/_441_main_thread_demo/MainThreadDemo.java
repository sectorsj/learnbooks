package ru.sectorsj.java_for_biginners._12_multithreading._441_main_thread_demo;


class MainThreadDemo {
    public static void main(String[] args) {
        // Объектная переменная для записи ссылки на поток:
        Thread t;
        //Получение ссылки на объект главного потока
        t = Thread.currentThread();

        // Отображение информации о потоке:
        System.out.println(t);

        // Изменение имени потока:
        t.setName("Главный поток");

        //Задается приоритет потока:
        t.setPriority(7);

        // Отображение информации о потоке:
        System.out.println(t);
    }
}

/**
 * Некоторые из методы для работы с потоками:
 *  activeCount()
 *  checkAccess()
 *  currentTread()
 *  enumerate()
 *  getId()
 *  getName()
 *  getPriority()
 *  getState()
 *  getThreadGroup()
 *  holdsLock()
 *  interrupt()
 *  interrupted()
 *  isAlive()
 *  isDaemon()
 *  isInterrupted()
 *  join()
 *  notify()
 *  notifyAll()
 *  run()
 *  setDaemon()
 *  setName()
 *  setPriority()
 *  sleep()
 *  start()
 *  wait()
 *  yield()
 */
