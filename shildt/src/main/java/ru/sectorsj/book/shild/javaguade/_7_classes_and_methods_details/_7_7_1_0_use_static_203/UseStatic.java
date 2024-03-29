package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_7_1_0_use_static_203;

/**
 * 7.7.1.0 - Демонстрация статических переменных, методов и блока кода
 *
 * Пример 1:
 * Демонстрируется класс,
 * который содержит:
 *  1) статический метод
 *  2) несколько статических переменных
 *  3) статический блок инициализации
 *
 * Результат выполнения программы:
 * Статический блок инициализирован.
 * x = 42
 * а = 3
 * b = 12
 *
 * Как только загружается класс UseStatic:
 * 1) выполняются все статические операторы:
 *    а) в переменной "а" устанавливается значение 3
 *
 * 2) выполняется статический блок кода:
 *    а) выводится сообщение
 *       "Статический блок инициализирован."
 *    б) переменная "b" инициализируется значением
 *       "12" (а * 4)
 *
 * 3) вызывается метод main()
 *
 * 4) в методе main() вызывается метод meth()
 *    а) параметру "х" передается значение "42",
 *       указанное в качестве аргумента метода meth(),
 *    б) выводятся значения переменных:
 *       - x
 *       - a
 *       - b
 *
 * В 3х вызовах метода println() делаются ссылки на:
 *  *  1) a (статическая переменная)
 *  *  2) b (статическая переменная)
 *  *  3) x (локальная переменная)
 */
// Пример 1:
public class UseStatic {

    // 1 действие:
    static int a = 3;
    static int b;

    // 4 действие:
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // 2 действие:
    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }

    // 3 действие:
    public static void main(String[] args) {
        meth(42);
    }
}