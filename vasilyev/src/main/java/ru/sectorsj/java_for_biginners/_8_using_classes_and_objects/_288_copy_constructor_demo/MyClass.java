package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._288_copy_constructor_demo;

class MyClass extends Base{
    int code;

    MyClass(String txt, int n) {
        super(txt);
        code = n;
    }

    MyClass(MyClass obj) {
        super(obj);
        code = obj.code;
    }

    void show(){
        System.out.println("Текстовое поле: " + name);
        System.out.println("Целочисленное поле: " + code);
    }
}
