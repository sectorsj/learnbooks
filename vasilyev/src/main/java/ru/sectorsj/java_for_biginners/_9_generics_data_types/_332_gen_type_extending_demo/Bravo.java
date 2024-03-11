package ru.sectorsj.java_for_biginners._9_generics_data_types._332_gen_type_extending_demo;

public class Bravo extends Alpha{

    char symbol;

    public Bravo(String txt, int n, char s) {
        super(txt, n);
        symbol = s;
    }

    @Override
    void show() {
        super.show();
        System.out.println("Символьное поле: " + symbol);
    }
}
