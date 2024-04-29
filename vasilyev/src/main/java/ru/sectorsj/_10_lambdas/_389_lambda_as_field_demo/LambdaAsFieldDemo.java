package ru.sectorsj._10_lambdas._389_lambda_as_field_demo;

public class LambdaAsFieldDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass((int n) -> {return n*n;});
        System.out.println("Аргумент:");
        for (int k = 0; k <= 5; k++) {
            System.out.print(k + "\t");
        }

        System.out.println("\nАргумент в квадрате:");
        for (int k = 0; k <= 5; k++) {
            System.out.print(obj.get(k) + "\t");
        }

        obj.set((int n) -> {return n * n * n;});
        System.out.println("\nАргумент в кубе:");
        for (int k = 0; k <= 5; k++) {
            System.out.print(obj.get(k) + "\t");
        }
        System.out.println("");
    }
}
