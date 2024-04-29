package ru.sectorsj._10_lambdas._374_stat_meth_reference_demo;

class MyClass {
    static void show() {
        System.out.println("Метод класса " + MyClass.class.getSimpleName());
    }

    static int sum(int n) {
        int k, s = 0;
        for (k = 1; k <= n; k++) {
            s += k;
        }
        return s;
    }
}
