package ru.sectorsj.orailly.learnjava._598_testGenerics1;

public class TestGenerics1 {
    public static void main(String[] args) {
        new TestGenerics1().go();
    }

    private void go() {
        Animal[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        takeAnimals(dogs);
    }

    private void takeAnimals(Animal[] animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}