package ru.sectorsj._9_generics_data_types._318_using_gen_class_demo;

public class UsingGenClassDemo {

    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<>(100);
        MyClass<Character> B = new MyClass<>('B');
        MyClass<String> C = new MyClass<>("Зеленый");

        A.show();
        B.show();
        C.show();
    }
}
