package ru.sectorsj._8_using_classes_and_objects._275_swap_fields_demo;

public class SwapFieldsDemo {

    public static void main(String[] args) {
        MyClass A = new MyClass(100);
        MyClass B = new MyClass(200);
        System.out.println("До вызова метода swap():A.number=" + A.number + " и B.number=" + B.number);

        swap(A,B);

        System.out.println("Поиск вызова метода swap():A.number=" + A.number + " и B.number=" + B.number);
    }

    static void swap(MyClass A, MyClass B) {
        System.out.println("Выполняется метода swap()");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);

        int number = B.number;
        B.number = A.number;
        A.number = number;
        System.out.println("Значения полей изменены");
        System.out.println("Объект A: " + A.number);
        System.out.println("Объект B: " + B.number);
        System.out.println("Завершено выполнение метода swap()");
    }
}
