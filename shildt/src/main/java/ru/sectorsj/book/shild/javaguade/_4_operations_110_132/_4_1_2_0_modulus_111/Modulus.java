package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_1_2_0_modulus_111;


/**
 * 4.1.2.0 - Операция деления по модулю
 *
 * Деления по модулю "%" - возвращает остаток от деления.
 * Эту операцию можно выполнять над:
 * 1) числовыми типами данных с плавающей точкой,
 * 2) целочисленным типами данных.
 *
 * Пример 1:
 * применение операции "%"
 *
 * Результат выполнения программы:
 * int x = 42
 * double y = 42.25
 *
 * x mod 10 = 2
 * y mod 10 = 2.25
 */

public class Modulus {
    // Пример 1:
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;
        System.out.println("int x = 42");
        System.out.println("double y = 42.25\n");

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}
