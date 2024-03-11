package ru.sectorsj.java_for_biginners._10_lambdas._374_stat_meth_reference_demo;

public class StatMethReferenceDemo {

    public static void main(String[] args) {
        MyShow S = MyClass::show;
        MySum U = MyClass::sum;
        MyPrinter P = System.out::println;

        S.myshow();
        P.myprint("Сумма чисел: " + U.mysum(10));
    }
}
