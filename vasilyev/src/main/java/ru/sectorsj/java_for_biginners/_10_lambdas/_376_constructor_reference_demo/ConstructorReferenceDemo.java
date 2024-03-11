package ru.sectorsj.java_for_biginners._10_lambdas._376_constructor_reference_demo;

class ConstructorReferenceDemo {

    public static void main(String[] args) {
        MyInterface ref = MyClass::new;

        MyClass obj = ref.create(100);
        obj.show();
        obj.set(200);
        obj.show();
    }
}
