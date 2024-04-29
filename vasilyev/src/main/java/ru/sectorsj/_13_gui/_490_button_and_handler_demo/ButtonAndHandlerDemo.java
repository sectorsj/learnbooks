package ru.sectorsj._13_gui._490_button_and_handler_demo;

import javax.swing.*;

// Главный класс:
class ButtonAndHandlerDemo {
    // Главный метод:
    public static void main(String[] args) {
        // Текстовое значение:
        String txt = "<html>Это жираф.<br>Он большой.<br>Он все видит.</html>";

        // Объект для изображения:
        ImageIcon img = new ImageIcon("D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\giraffe.png");

        // Создание объекта окна:
        new MyFrame("Обработчик - объект кнопки", txt, img);
    }
}
