package ru.sectorsj._8_using_classes_and_objects._312_more_anonymous_class_demo;

public class MoreAnonymousClassDemo {

    public static void main(String[] args) {
        Base obj = new Base() {
            @Override
            public void hello() {
                System.out.println("Объект анонимного класса");
            }
        };

        obj.show();
        obj.hello();

        new Base() {
            public void hello() {
                System.out.println("Анонимный объект");
            }

            void showAll() {
                hello();
                show();
            }

        }.showAll();
    }
}
