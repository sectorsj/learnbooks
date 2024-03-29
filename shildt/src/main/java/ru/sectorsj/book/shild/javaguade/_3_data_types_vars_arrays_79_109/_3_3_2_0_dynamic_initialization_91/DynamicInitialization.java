package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_3_2_0_dynamic_initialization_91;

/**
 * 3.3.2.0 - Динамическая инициализация
 *
 * Ранее в качестве начальных значений
 * были использованы только константы.
 *
 * Однако Java допускается и динамическая инициализация переменных
 * с помощью любого выражения,
 * действительного в момент объявления переменной.
 *
 *
 * Пример 1:
 * Вычислить длину гипотенузы прямоугольного треугольника
 * по длине его катетов.
 *
 * В данном примере программы объявляются три локальные переменные: а, b, c.
 * а, b -  инициализируются константами,
 * с    -  инициализируется динамически,
 *         принимая значение длины гипотенузы,
 *         вычисляемое по теореме Пифагора.
 *
 * Для вычисления квадратного корня аргумента
 * в этой программе вызывается встроенный в Java метод sqrt(),
 * sqrt() - метод который является членом класса Math.
 *
 * ВАЖНО!
 * В инициализирующем выражении
 * можно использовать любые элементы,
 * действительные во время инициализации,
 * в том числе:
 *  1) вызовы методов
 *  2) другие переменные
 *  3) константы
 */
public class DynamicInitialization {

    public static void main(String[] args) {

        // Пример 1:
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной "c"
        double c = Math.sqrt(a * a * b * b);
        System.out.println("Гипотенуза прямоугольного треугольника = " + c);
    }
}