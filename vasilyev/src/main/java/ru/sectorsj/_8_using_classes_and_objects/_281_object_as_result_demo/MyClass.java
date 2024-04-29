package ru.sectorsj._8_using_classes_and_objects._281_object_as_result_demo;

class MyClass {
    private int code;
    private String name;

    MyClass(int n, String s) {
        code = n;
        name = s;

        System.out.println("Создание объекта:");

        set(n,s).show();
    }

    MyClass set(int n) {
        code = n;
        return this;
    }

    MyClass set(String s) {
        name = s;
        return this;
    }

    MyClass set(int n, String s) {
        return set(n).set(s);
    }

    void show() {
        System.out.println("Поле code=" + code);
        System.out.println("Поле name=" + name);
        System.out.println("-----------------");
    }
}
