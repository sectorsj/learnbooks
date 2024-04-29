package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo.polymorph_example;

public class Triangle extends Shape{
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Треугольник нарисован.");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Треугольник раскрашен в " + color + " цвет.");
    }
}
