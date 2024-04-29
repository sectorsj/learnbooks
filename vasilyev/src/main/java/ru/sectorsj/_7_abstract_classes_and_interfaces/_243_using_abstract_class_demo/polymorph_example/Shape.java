package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo.polymorph_example;

public abstract class Shape implements Colorable, Drawable {
    private int Width;
    private int Height;

    public Shape(int width, int height) {
        Width = width;
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
