package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._243_using_abstract_class_demo.polymorph_example;

public class Square extends Shape{
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Квадрат нарисован.");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Квадрат раскрашен в " + color + " цвет.");
    }
}
