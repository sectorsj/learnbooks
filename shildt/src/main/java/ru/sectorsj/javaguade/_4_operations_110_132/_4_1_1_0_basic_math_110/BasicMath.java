package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_1_1_0_basic_math_110;

/**
 * 4.1.1.0 - Основные арифметические операции
 *
 * Операции:
 * 1) арифметические операции
 *      - сложения
 *      - вычитания
 *      - умножения
 *      - деления
 *    воздействуют на числовые типы данных.
 * 2) унарное вычитания - изменяет знак своего
 *                        единственного операнда.
 * 3) унарное сложения  - просто возвращает
 *                        значение своего операнда.
 *
 * 4) Когда операция деления выполняется
 *    над целочисленным типом данных,
 *    ее результат не будет содержать дробный компонент.
 *
 * Пример 1:
 * применение арифметических операций.
 * Отличие в операциях деления:
 * - целых чисел
 * - чисел с плавающей точкой
 *
 * Результат выполнения программы:
 * арифметические операции над целыми числами
 * int a = 1 + 1;  a = 2
 * int b = a * 3;  b = 6
 * int c = b / 4;  c = 1
 * int d = c - a;  d = -1
 * int e = -d;     e = 1
 *
 * арифметические операции над числами с плавающей точкой
 * double da = 1 + 1;   da = 2.0
 * double db = da * 3;  db = 6.0
 * double dc = db / 4;  dc = 1.5
 * double dd = dc - a;  dd = -0.5
 * double de = -dd;     de = 0.5
 */
public class BasicMath {
    public static void main(String[] args) {
        // Пример 1:
        // арифметические операции над
        // целочисленными значениями
        System.out.println("арифметические операции над целыми числами");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("int a = 1 + 1;  a = " + a);
        System.out.println("int b = a * 3;  b = " + b);
        System.out.println("int c = b / 4;  c = " + c);
        System.out.println("int d = c - a;  d = " + d);
        System.out.println("int e = -d;     e = " + e);

        // арифметические операции
        // над значениями типа double
        System.out.println("\nарифметические операции над числами с плавающей точкой");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("double da = 1 + 1;   da = " + da);
        System.out.println("double db = da * 3;  db = " + db);
        System.out.println("double dc = db / 4;  dc = " + dc);
        System.out.println("double dd = dc - a;  dd = " + dd);
        System.out.println("double de = -dd;     de = " + de);
    }
}