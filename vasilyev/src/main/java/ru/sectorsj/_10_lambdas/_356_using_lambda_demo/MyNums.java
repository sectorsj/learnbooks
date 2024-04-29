package ru.sectorsj._10_lambdas._356_using_lambda_demo;

interface MyNums {
    default void show(int n) {
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }

    int get(int n);
}
