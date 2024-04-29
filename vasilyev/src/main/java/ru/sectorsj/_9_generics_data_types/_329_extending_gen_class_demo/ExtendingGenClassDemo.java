package ru.sectorsj._9_generics_data_types._329_extending_gen_class_demo;

public class ExtendingGenClassDemo {

    public static void main(String[] args) {
        Alpha objA = new Alpha(123);
        Bravo objB = new Bravo("Объект B");
        Charlie objC = new Charlie('C');

        objA.show();
        objB.show();
        objC.show();
    }

}
