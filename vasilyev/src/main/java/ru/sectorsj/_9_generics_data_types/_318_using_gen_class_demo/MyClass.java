package ru.sectorsj._9_generics_data_types._318_using_gen_class_demo;

class MyClass<X> {
    X data;

    MyClass(X data) {
        this.data = data;
    }

    void show() {
        System.out.println("Значение поля: " + data);
    }
}
