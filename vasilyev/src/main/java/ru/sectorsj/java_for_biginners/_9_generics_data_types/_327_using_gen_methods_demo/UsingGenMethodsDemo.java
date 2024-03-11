package ru.sectorsj.java_for_biginners._9_generics_data_types._327_using_gen_methods_demo;

public class UsingGenMethodsDemo {

    public static void main(String[] args) {
        MyClass A = new MyClass("Объект A");
        MyClass B = new MyClass("Объект B");

        A.show(123);
        A.show("Alpha");
        A.show('A');

        A.show(456);
        A.show("Bravo");
        A.show('B');
    }
}
