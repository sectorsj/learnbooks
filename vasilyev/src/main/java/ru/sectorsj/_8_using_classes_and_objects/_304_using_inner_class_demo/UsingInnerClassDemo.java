package ru.sectorsj._8_using_classes_and_objects._304_using_inner_class_demo;

public class UsingInnerClassDemo {

    public static void main(String[] args) {
        BankAccount ivanov = new BankAccount(
                "Иванов Иван",
                1000.0,
                5,
                8.0
        );
        ivanov.show();
    }
}
