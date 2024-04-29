package ru.sectorsj._8_using_classes_and_objects._288_copy_constructor_demo;

public class CopyConstructorDemo {

    public static void main(String[] args) {
        MyClass A = new MyClass("Желтый", 200);

        MyClass B = new MyClass(A);
        A.name = "Красный";
        A.code = 100;

        MyClass C = new MyClass(new MyClass("Зеленый", 300));

        System.out.println("Объект: A");
        A.show();
        System.out.println("Объект: B");
        B.show();
        System.out.println("Объект: C");
        C.show();
    }
}
