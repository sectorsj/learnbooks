package ru.sectorsj.java_for_biginners._9_generics_data_types._329_extending_gen_class_demo;

public class Bravo extends Base<String>{

    Bravo(String txt) {
        super(txt);
    }

    @Override
    void show() {
        System.out.print("Текстовое поле: ");
        super.show();
    }
}