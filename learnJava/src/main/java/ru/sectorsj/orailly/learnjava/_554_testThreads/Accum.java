package ru.sectorsj.orailly.learnjava._554_testThreads;

class Accum {
    private static Accum a = new Accum();
    private int counter = 0;

    private Accum () {}

    public static Accum getAccum() {
        return a;
    }

    public void updateCounter(int add){
        counter += add;
    }

    public int getCount() {
        return counter;
    }
}