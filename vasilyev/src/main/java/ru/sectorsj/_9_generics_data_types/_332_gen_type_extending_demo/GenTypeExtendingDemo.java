package ru.sectorsj._9_generics_data_types._332_gen_type_extending_demo;

public class GenTypeExtendingDemo {

    public static void main(String[] args) {
        MyClass<Alpha> A = new MyClass<>(new Alpha("Alpha", 123));
        MyClass<Alpha> B = new MyClass<>(new Bravo("Bravo", 123, 'B'));

        A.show();
        B.show();
    }
}
