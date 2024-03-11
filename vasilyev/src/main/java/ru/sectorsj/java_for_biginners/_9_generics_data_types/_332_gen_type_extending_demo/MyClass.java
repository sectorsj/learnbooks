package ru.sectorsj.java_for_biginners._9_generics_data_types._332_gen_type_extending_demo;

class MyClass <X extends Base> {
    X obj;

    MyClass(X obj) {
        this.obj = obj;
    }

    void show() {
        System.out.println("Объект класса MyClass");
        obj.show();
    }
}
