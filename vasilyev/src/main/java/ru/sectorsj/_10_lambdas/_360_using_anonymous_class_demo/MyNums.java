package ru.sectorsj._10_lambdas._360_using_anonymous_class_demo;

interface MyNums {
    default void show(int n) {
        System.out.println("Аргумент: " + n);
        System.out.println("Результат: " + get(n));
    }

    int get(int n);
}
