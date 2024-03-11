package ru.sectorsj.java_for_biginners._10_lambdas._376_constructor_reference_demo;

class MyClass {
    private int number;

    public MyClass(int n) {
        number = n;
    }

    void show() {
        System.out.println("Значение поля " + number);
    }

    void set(int n) {
        number = n;
    }
}
