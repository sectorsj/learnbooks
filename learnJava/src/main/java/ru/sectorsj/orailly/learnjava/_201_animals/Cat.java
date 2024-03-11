package ru.sectorsj.orailly.learnjava._201_animals;

public class Cat extends Feline implements Pet {
    @Override
    public void eat() {
        System.out.println("Я ем как Кошка");
    }

    @Override
    public void beFriendly() {
        System.out.println("Я дружелюбная Кошка");
    }

    @Override
    public void play() {
        System.out.println("Я играю как Кошка");
    }
}