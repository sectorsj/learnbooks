package ru.sectorsj.orailly.learnjava._594_jukebox5._599_testGenerics2;

public class Animal {

    String type = "животное";

    public String getType() {
        return type;
    }

    void eat(){
        System.out.println( type + " " + "ест");
    }

    @Override
    public String toString() {
        return type;
    }
}
