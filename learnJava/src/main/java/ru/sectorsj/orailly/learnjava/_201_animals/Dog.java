package ru.sectorsj.orailly.learnjava._201_animals;

public class Dog extends Canine implements Pet {
    @Override
    public void eat() {
        System.out.println("Я ем как Собака");
    }

    @Override
    public void beFriendly() {
        System.out.println("Я дружелюбная Собака");
    }

    @Override
    public void play() {
        System.out.println("Я играю с Вами как Собака");
    }
}