package ru.sectorsj.java_for_biginners._9_generics_data_types._340_more_gen_interface_demo;

public class Bravo implements MyMethods<Character>{

    private Character value;

    @Override
    public Character get() {
        return value;
    }

    @Override
    public void set(Character arg) {
        value = arg;
    }

    void show() {
        System.out.println("Символьное поле: " + get());
    }

    public Bravo(Character arg) {
        value = arg;
    }
}
