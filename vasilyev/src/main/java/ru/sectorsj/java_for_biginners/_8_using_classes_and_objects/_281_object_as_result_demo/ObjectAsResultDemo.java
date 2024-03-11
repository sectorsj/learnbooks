package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._281_object_as_result_demo;

public class ObjectAsResultDemo {

    public static void main(String[] args) {
        MyClass obj = createObject(100, "alpha");
        obj.set(200).show();
        obj.set("bravo").show();
        obj.show();
        createObject(300, "charlie").set(400, "delta").show();
    }

    static MyClass createObject(int n, String s){
        return new MyClass(n, s);
    }
}
