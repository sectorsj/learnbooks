package ru.sectorsj.java_for_biginners._9_generics_data_types._329_extending_gen_class_demo;

public class Alpha extends Base<Integer>{

    Alpha(Integer n) {
        super(n);
    }

    @Override
    void show() {
        System.out.print("Целочисленное поле: ");
        super.show();
    }
}