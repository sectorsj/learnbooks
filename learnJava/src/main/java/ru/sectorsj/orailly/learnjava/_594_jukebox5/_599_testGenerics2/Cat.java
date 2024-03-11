package ru.sectorsj.orailly.learnjava._594_jukebox5._599_testGenerics2;

public class Cat extends Animal {
    String type = "кошка";

    public String getType() {
        return type;
    }

    void meow(){
        System.out.println(type + " " + "мяукает");
    }

    @Override
    public String toString() {
        return type;
    }

    @Override
    void eat() {
        System.out.println(type + " " + "ест");
    }
}