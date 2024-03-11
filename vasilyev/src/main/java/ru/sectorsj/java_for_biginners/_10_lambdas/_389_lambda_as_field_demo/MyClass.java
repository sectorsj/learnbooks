package ru.sectorsj.java_for_biginners._10_lambdas._389_lambda_as_field_demo;

class MyClass {
    private MyInterface ref;

    MyClass(MyInterface mi) {
        set(mi);
    }

    void set(MyInterface mi){
        ref = mi;
    }

    int get(int n) {
        return ref.getNumber(n);
    }
}
