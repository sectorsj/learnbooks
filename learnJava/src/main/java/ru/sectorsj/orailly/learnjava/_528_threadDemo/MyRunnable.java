package ru.sectorsj.orailly.learnjava._528_threadDemo;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("Вершина стека");
    }
}