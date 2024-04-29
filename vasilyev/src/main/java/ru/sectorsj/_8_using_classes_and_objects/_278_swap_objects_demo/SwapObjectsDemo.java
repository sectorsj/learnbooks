package ru.sectorsj._8_using_classes_and_objects._278_swap_objects_demo;

public class SwapObjectsDemo {

    public static void main(String[] args) {
        MyClass A = new MyClass(100);
        MyClass B = new MyClass(200);
        System.out.println("До вызова метода swap():" +
                "A.number=" + A.number +
                " и B.number=" + B.number);
        swap(A, B);

        System.out.println("После вызова метода swap():" +
                "A.number=" + A.number +
                " и B.number=" + B.number);
    }

    static void swap(MyClass A, MyClass B) {
        System.out.println("Выполняется метода swap()");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);

        MyClass X = B;
        B = A;
        A = X;

        System.out.println("Значения аргументов изменены");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }
}
