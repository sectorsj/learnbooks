package ru.sectorsj._9_generics_data_types._344_using_wildcard_demo;

public class UsingWildcardDemo {

    static <T> void show(MyClass<T> obj) {
        System.out.print("Вызов метода show(): ");
        System.out.println(obj.value);
    }

    static void display(MyClass<?> obj) {
        System.out.print("Вызов метода display(): ");
        System.out.println(obj.value + "\n");
    }

    public static void main(String[] args) {
        MyClass<Integer> A = new MyClass<>(100);
        MyClass B = new MyClass<>('B');
        MyClass<?> C = new MyClass<>("Объект С");

        show(A);
        display(A);

        show(B);
        display(B);

        show(C);
        display(C);
    }
}
