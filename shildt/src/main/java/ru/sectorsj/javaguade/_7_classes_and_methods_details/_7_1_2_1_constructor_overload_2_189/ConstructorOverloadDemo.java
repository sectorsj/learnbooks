package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_1_2_1_constructor_overload_2_189;

/**
 * 7.1.2.1 -
 *
 * Перегрузка конструктор Вох(),
 * чтобы принять во внимание следующие требования:
 * 1) инициализировать параллелепипед, а его начальные размеры:
 *      а) не имеют значения
 *            или
 *      б) вообще неизвестны
 *
 * 2) инициализировать куб,
 *    указав одно значение
 *    для всех трех измерений
 *
 * Пример 1.1, 1.2:
 * Конструкторы определяются в классе Вох
 * для инициализации размеров параллелепипеда
 * 3 разными способами.
 *
 * Результат выполнения программы:
 * Объем myBox1 = 3000.0
 * Объем myBox2 = -1.0
 * Объем myCube = 343.0
 *
 * Соответствующий перегружаемый конструктор
 * вызывается в зависимости от параметров,
 * указываемых при выполнении операции "new".
 */
// Пример 1.1:
class Box{
    double width;
    double height;
    double depth;

    // Конструктор, где нужны все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, где не нужны параметры
    // используем значение - 1,
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
class ConstructorOverloadDemo {
    public static void main(String[] args) {

        // Создать параллелепипеды,
        // используя разные конструкторы
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        // Получить объем 1го параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объем myBox1 = " + vol);

        // Получить объем 2го параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объем myBox2 = " + vol);

        // Получить объем куба
        vol = myCube.volume();
        System.out.println("Объем myCube = " + vol);
    }
}