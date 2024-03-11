package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_2_1_0_constructor_overload_2__191;

/**
 * 7.2.1.0 - Инициализация объекта другим объектом
 *
 * Чаще всего объекты употребляются
 * в конструкторах в качестве параметров.
 *
 * Нередко новый объект приходится создавать таким образом,
 * чтобы он первоначально ничем не отличался
 * от уже существующего объекта.
 *
 * Для этого придется определить конструктор,
 * принимающий в качестве параметра ОБЪЕКТ своего класса.
 *
 * Пример 1.1, 1.2:
 * Класс Вох инициализирует один объект другим объектом
 *
 * Результат выполнения программы:
 * Объем myBox1 = 3000.0
 * Объем myBox2 = -1.0
 * Объем myCube = 343.0
 * Объем клона = 3000.0
 *
 * ВАЖНО!
 * При разработке своих классов,
 * нужно иметь в своем распоряжении
 * многие формы конструкторов.
 *
 * Это позволит
 *  - удобно
 *  - эффективно
 * создавать нужные объекты.
 *
 */

// Пример 1.1:
class Box {
    double width;
    double height;
    double depth;

    // Передаем объект конструктору
    // В качестве параметра в классе Box
    // используется объект типа Box
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // Конструктор, где нужны все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, где не нужны параметры
    // используем значение - 1
    // для обозначения неинициализированного параллелепипеда
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор, необходимый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

// Пример 1.2:
class ConstructorOverload2 {
    public static void main(String[] args) {

        // Создать параллелепипеды,
        // используя разные конструкторы
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        // Создаем копию объекта myBox1
        Box myClone = new Box(myBox1);

        double vol;

        // Получить объем 1-го параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);

        // Получить объем 2-го параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);

        // Получить объем куба
        vol = myCube.volume();
        System.out.println("Объем myCube = " + vol);

        // Получить объем клона
        vol = myClone.volume();
        System.out.println("Объем клона = " + vol);
    }
}