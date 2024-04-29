package ru.sectorsj._9_generics_data_types._320_using_generics_demo;

class Bravo<X,Y> {
    Alpha<X> obj;
    Y second;

    public Bravo(X first, Y second) {
        obj = new Alpha<X>(first);
        this.second = second;
    }

    void show() {
        System.out.println("Значения: " + obj.get() + " и " + second);
    }
}
