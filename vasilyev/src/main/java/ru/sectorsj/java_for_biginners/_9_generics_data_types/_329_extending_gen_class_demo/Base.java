package ru.sectorsj.java_for_biginners._9_generics_data_types._329_extending_gen_class_demo;

public class Base<X> {
    X data;

    Base(X data) {
        this.data = data;
    }

    void show() {
        System.out.println(data);
    }
}
