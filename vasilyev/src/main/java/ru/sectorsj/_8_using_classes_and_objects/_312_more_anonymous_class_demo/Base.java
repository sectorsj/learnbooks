package ru.sectorsj._8_using_classes_and_objects._312_more_anonymous_class_demo;

public interface Base {
    default void show() {
        System.out.println("Интерфейс Base");
    }
    void hello();
}
