package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._284_object_factory_demo;

public class ObjectFactoryDemo {

    public static void main(String[] args) {
        Base obj;

        for (int i = 1; i <= 3; i++) {
            obj = createObject(i);
            obj.show();
        }
    }

    static Base createObject(int n) {
        if (n == 1) return new Alpha();
        if (n == 2) return new Bravo();
        return new Alpha();
    }
}
