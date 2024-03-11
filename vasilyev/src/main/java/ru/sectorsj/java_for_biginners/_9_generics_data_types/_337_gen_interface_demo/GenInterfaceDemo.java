package ru.sectorsj.java_for_biginners._9_generics_data_types._337_gen_interface_demo;

public class GenInterfaceDemo {

    public static void main(String[] args) {
        MyMethods ref;

        MyClass<Integer> A = new MyClass<>(123);
        MyClass<Character> B = new MyClass<>('A');

        A.show();

        ref = A;
        ref.set(321);

        A.show();
        B.show();

        ref=B;
        ref.set('B');

        B.show();
    }
}
