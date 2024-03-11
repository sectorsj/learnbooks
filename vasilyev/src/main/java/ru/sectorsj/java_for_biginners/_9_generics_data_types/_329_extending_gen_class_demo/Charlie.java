package ru.sectorsj.java_for_biginners._9_generics_data_types._329_extending_gen_class_demo;

public class Charlie extends Base<Character>{

    Charlie(Character s) {
        super(s);
    }

    @Override
    void show() {
        System.out.print("Символьное поле: ");
        super.show();
    }
}