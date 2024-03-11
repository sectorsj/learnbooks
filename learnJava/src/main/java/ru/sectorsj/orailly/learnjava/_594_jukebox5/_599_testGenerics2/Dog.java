package ru.sectorsj.orailly.learnjava._594_jukebox5._599_testGenerics2;

public class Dog extends Animal {
    String type = "собака";
    String name;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Dog(String n) {
        name = n;
    }

    void bark(){
        System.out.println(type + " " + "гавкает");
    };

    @Override
    public String toString() {
        return (type);
    }

    @Override
    void eat() {
        System.out.println(type + " " + "ест");;
    }
}
