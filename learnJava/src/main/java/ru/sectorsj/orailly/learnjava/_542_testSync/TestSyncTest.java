package ru.sectorsj.orailly.learnjava._542_testSync;

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync task = new TestSync();
        Thread one = new Thread(task);
        Thread two = new Thread(task);
        one.start();
        two.start();
    }
}
