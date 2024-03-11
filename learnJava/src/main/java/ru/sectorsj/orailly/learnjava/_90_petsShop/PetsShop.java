package ru.sectorsj.orailly.learnjava._90_petsShop;

public class PetsShop {
    public static void main(String[] args) {
        String[] pets = {"Фидо", "Зевс", "Бин"};
        int x = pets.length;
        //int x = (int) 24.6;
        String s = pets[0];
        String s1 = pets[1];
        String s2 = pets[2];
        s = s + " " + "- собака";
        System.out.println(s);
    }
}
