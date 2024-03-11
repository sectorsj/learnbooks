package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_5_1_1_ternary_128;

/**
 * Пример 1:
 * применение тернарной операции ?,
 * для получения абсолютного значения переменной.
 *
 * Эта программа выводит следующий результат:
 * Абсолютное значение 10 равно 10
 * Абсолютное значение -10 равно 10
 */
public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        // получить абсолютное значение переменной i
        k = i < 0 ? -i : i;
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        // получить абсолютное значение переменной i
        k = i < 0 ? -i : i;

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}