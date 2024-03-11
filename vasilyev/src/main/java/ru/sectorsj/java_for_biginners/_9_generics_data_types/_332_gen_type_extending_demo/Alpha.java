package ru.sectorsj.java_for_biginners._9_generics_data_types._332_gen_type_extending_demo;

public class Alpha extends Base {
    int number;

    public Alpha(String txt, int n) {
        super(txt);
        number = n;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Целочисленное поле: " + number);
    }
}
