package ru.sectorsj.java_for_biginners._9_generics_data_types._327_using_gen_methods_demo;

class MyClass {
    String name;
    <X> void show(X arg) {
        System.out.println(name + ": " + arg);
    }

    MyClass(String txt) {
        name = txt;
    }
}
