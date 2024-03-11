package ru.sectorsj.java_for_biginners._9_generics_data_types._347_bounded_wildcards_demo;

class BoundedWildcardsDemo {
    static void show(MyClass<? extends Charlie> obj) {
        System.out.println(obj);
    }

    static void display(MyClass<? super Charlie> obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        MyClass<Alpha> A = new MyClass<>(new Alpha("Объект A"));
        MyClass<Bravo> B = new MyClass<>(new Bravo("Объект B"));
        MyClass<Charlie> C = new MyClass<>(new Charlie("Объект C"));
        MyClass<Delta> D = new MyClass<>(new Delta("Объект D"));
        MyClass<Echo> E = new MyClass<>(new Echo("Объект E"));

        display(A);
        display(B);
        display(C);
        show(C);
        show(D);
        show(E);
    }
}
