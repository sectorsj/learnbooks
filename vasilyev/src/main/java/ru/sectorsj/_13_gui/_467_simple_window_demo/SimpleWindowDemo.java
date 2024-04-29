package ru.sectorsj._13_gui._467_simple_window_demo;

class SimpleWindowDemo {
    // Главный метод:
    public static void main(String[] args) {
        // Создание анонимного класса
        // т.к. не планируем выполнять действия с окном
        // по этому не запоминаем ссылку на объект окна
        new MyFrame("Обычное окно");
    }
}