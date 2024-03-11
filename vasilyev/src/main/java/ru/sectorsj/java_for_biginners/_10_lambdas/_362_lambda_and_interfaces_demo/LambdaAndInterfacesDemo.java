package ru.sectorsj.java_for_biginners._10_lambdas._362_lambda_and_interfaces_demo;

public class LambdaAndInterfacesDemo {

    public static void main(String[] args) {
        Alpha A = () -> System.out.println("Используем лямбда выражение A");
        A.showA();

        Bravo B = () -> System.out.println("Используем лямбда выражение B");
        B.showB();

        Charlie C = A::showA;
        C.showC();
    }
}
