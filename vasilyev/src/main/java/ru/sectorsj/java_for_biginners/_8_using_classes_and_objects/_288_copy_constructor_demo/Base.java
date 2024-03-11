package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._288_copy_constructor_demo;

public class Base {
    String name;

    public Base(String txt) {
        name = txt;
    }

    Base (Base obj) {
        name = obj.name;
    }
}
