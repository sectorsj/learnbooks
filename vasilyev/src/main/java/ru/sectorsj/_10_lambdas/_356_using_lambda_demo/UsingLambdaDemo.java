package ru.sectorsj._10_lambdas._356_using_lambda_demo;

public class UsingLambdaDemo {

    public static void main(String[] args) {
        MyNums A = (int n) -> {
            int i, sum = 0;

            for (i = 1; i <= n; i++) {
                sum += i;
            }
            // sum = 1+2+3+4+5+6+7+8+9+10 = 55
            return sum;
        };

        System.out.println("Используем лямбда-выражение");
        A.show(10);

        System.out.println("Проверка: " + A.get(10));
        MyNums B = A;

        System.out.println("Новое лямбда-выражение:");
        A = n -> n * n;

        System.out.println("Вызываем метод show() из A: ");
        A.show(10);

        System.out.println("Вызываем метод show() из B: ");
        B.show(10);
    }
}
