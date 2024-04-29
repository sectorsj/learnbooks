package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo.polymorph_example;

public class Circle extends Shape {
    
    public Circle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Круг нарисован.");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Круг раскрашен в " + color + " цвет.");
    }
}
