package ru.sectorsj.orailly.learnjava._237_animallist;

import ru.sectorsj.orailly.learnjava._201_animals.Cat;
import ru.sectorsj.orailly.learnjava._201_animals.Dog;

public class AnimaTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        list.add(a);
        list.add(c);
    }
}
