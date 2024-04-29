package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo.polymorph_example;

public class Test {
    public static void main(String[] args) {
        Shape redTriangle = new Triangle(100, 50);
        redTriangle.draw();
        redTriangle.setColor("красный");
    }
}
