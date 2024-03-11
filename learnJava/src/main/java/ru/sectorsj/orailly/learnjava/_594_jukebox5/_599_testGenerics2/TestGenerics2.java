package ru.sectorsj.orailly.learnjava._594_jukebox5._599_testGenerics2;

import java.util.ArrayList;

public class TestGenerics2 {
    public static void main(String[] args) {
        new TestGenerics2().go();
    }

    private void go() {
        ArrayList<Animal> animals =new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog("Галстук"));
        animals.add(new Cat());
        animals.add(new Dog("Лесси"));
        takeAnimals(animals);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Найда"));
        dogs.add(new Dog("Бобик"));

        // Будет ошибка компиляция если не изменить
        // аргументы метода takeAnimals()
        takeAnimals(dogs);
        takeSomeThing(dogs, dogs);
    }

    //private void takeAnimals(ArrayList<Animal> animals) {
    private void takeAnimals(ArrayList<? extends Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
    // Альтернативный синтаксис метода takeAnimals()
    // если нужно передавать больше чем 1 аргумент
    private <T extends Animal > void takeSomeThing(ArrayList<T> one, ArrayList<T> two){
        System.out.println("Скрестили " + one + " и " + two);
    }
}