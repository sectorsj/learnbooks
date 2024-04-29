package ru.sectorsj._9_generics_data_types._340_more_gen_interface_demo;

public class Alpha implements MyMethods<Integer>{

    private Integer value;

    @Override
    public Integer get() {
        return value;
    }

    @Override
    public void set(Integer arg) {
        value = arg;
    }

    void show() {
        System.out.println("Целочисленное поле: " + get());
    }

    public Alpha(Integer arg) {
        value = arg;
    }
}
