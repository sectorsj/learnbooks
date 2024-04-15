package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_2_5_1_op_bit_equals_123;

/**
 * Пример 1:
 * 1) создаются несколько целочисленных переменных,
 * 2) используются составные побитовые операторы
 *    с присваиванием для манипулирования этими переменными:
 *
 * Результат выполнения программы:
 * a = 3;
 * b = 1;
 * c = 6;
 */
public class OpBitEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}