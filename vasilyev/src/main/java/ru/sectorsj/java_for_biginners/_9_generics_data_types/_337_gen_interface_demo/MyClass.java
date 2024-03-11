package ru.sectorsj.java_for_biginners._9_generics_data_types._337_gen_interface_demo;

class MyClass<X> implements MyMethods<X> {
    private X value;

    @Override
    public X get() {
        return value;
    }

    @Override
    public void set(X arg) {
        value = arg;
    }

    void show() {
        System.out.println("Значение поля: " + get());
    }

    MyClass(X arg) {
        value = arg;
    }
}
