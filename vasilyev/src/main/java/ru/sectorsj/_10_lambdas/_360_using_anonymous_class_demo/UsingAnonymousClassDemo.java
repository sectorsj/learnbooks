package ru.sectorsj._10_lambdas._360_using_anonymous_class_demo;

public class UsingAnonymousClassDemo {
    public static void main(String[] args) {
        MyNums A = new MyNums() {

            @Override
            public int get(int n) {
                int i, s = 0;

                for (i = 1; i <= n; i++) {
                    s =+ i;
                }
                return s;
            }
        };

        System.out.println("Используем анонимный класс");
        A.show(10);

        System.out.println("Проверка: " + A.get(10));
        MyNums B = A;

        System.out.println("Новый анонимный класс:");

        A = new MyNums() {
            @Override
            public int get(int n) {
                return n * n;
            }
        };

        System.out.println("Вызываем метод show() из A: ");
        A.show(10);

        System.out.println("Вызываем метод show() из B: ");
        B.show(10);

    }
}
