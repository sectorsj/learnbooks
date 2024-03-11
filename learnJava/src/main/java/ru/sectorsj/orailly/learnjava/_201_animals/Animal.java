package ru.sectorsj.orailly.learnjava._201_animals;


abstract public class Animal {
    private String picture;
    private String food;
    private int hunger;
    private int[] boundaries;
    private int[] location;

    void makeNoise(){}
    public  abstract void eat();
    void sleep(){}
    void roam(){}
}