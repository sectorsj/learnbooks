package ru.sectorsj._8_using_classes_and_objects._309_anonymous_class_demo;

public class AnonymousClassDemo {

    public static void main(String[] args) {
        Base obj = new Base("Красный") {
            @Override
            void hello() {
                System.out.println("Объект анонимного класса");
            }
        };

        obj.show();
        obj.hello();

        new Base("Зеленый") {
            void hello() {
                System.out.println("Анонимный объект");
            }
            void showAll() {
                hello();
                show();
            }
        }.showAll();
    }
}
