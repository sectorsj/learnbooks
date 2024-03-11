package ru.sectorsj.java_for_biginners._9_generics_data_types._347_bounded_wildcards_demo;

class MyClass<T> {
    private T obj;

    @Override
    public String toString() {
        return obj.toString();
    }

    MyClass(T arg) {
        obj = arg;
    }
}
