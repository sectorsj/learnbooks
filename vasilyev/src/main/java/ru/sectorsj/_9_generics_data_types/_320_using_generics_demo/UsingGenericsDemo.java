package ru.sectorsj._9_generics_data_types._320_using_generics_demo;

public class UsingGenericsDemo {

    public static void main(String[] args) {
        Bravo<Integer, Character> A = new Bravo<Integer, Character>(100, 'A');
        A.show();

        Bravo<String, Double> B = new Bravo<>("BRAVO", 12.345);
        B.show();
    }
}
