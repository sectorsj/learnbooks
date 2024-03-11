package ru.sectorsj.orailly.learnjava._237_animallist;

import ru.sectorsj.orailly.learnjava._201_animals.Animal;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add(Animal a) {
        if (nextIndex <animals.length){
            animals[nextIndex] = a;

            System.out.println("Animal добавил ячейку " + nextIndex);
            nextIndex++;
        }
    }
}