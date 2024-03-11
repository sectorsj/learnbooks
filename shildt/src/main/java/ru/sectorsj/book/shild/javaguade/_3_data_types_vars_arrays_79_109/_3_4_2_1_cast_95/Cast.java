package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_4_2_1_cast_95;

/**
 * Эта программа выводит следующий результат:
 * Переменные до преобразования:
 * b = 0
 * i = 257
 * d = 323.142
 *
 * Преобразование типа int в тип byte:
 * i = 257
 * b = (byte)i -> b = 1
 *
 * Преобразование типа double в тип int:
 * d = 323.142
 * i = (int)d -> i = 323
 *
 * Преобразование типа double в тип byte:
 * i = 323.142
 * b = (byte)d -> d = 67
 *
 * Рассмотрим каждое из этих преобразований:
 * 1) Когда значение 257 приводится к типу byte,
 *    его результатом будет остаток от деления 257 на 256
 *    (256 - это диапазон допустимых значений типа byte),
 *    который в данном случае равен 1.
 *
 * 2) Когда значение переменной d преобразуется в тип int,
 *    его дробная часть отбрасывается (это усечение).
 *
 * 3) Когда значение переменной d преобразуется в тип byte,
 *    его дробная часть отбрасывается
 *    и значение уменьшается до результата
 *    деления по модулю на 256,
 *    который в данном случае равен 67.
 */
public class Cast{
    public static void main(String[] args) {

        // объявляем и инициализируем переменные
        byte b = 0;
        int i = 257;
        double d = 323.142;

        System.out.println("Переменные до преобразования:");
        System.out.println("b = " + b);
        System.out.println("i = " + i);
        System.out.println("d = " + d);

        System.out.println("\nПреобразование типа int в тип byte:");
        b = (byte) i;
        System.out.println("i = " + i);
        System.out.println("b = (byte)i -> b = " + b);

        System.out.println("\nПреобразование типа double в тип int:");
        i = (int) d;
        System.out.println("d = " + d);
        System.out.println("i = (int)d -> i = " + i);

        System.out.println("\nПреобразование типа double в тип byte:");
        b = (byte) d;
        System.out.println("i = " + d);
        System.out.println("b = (byte)d -> d = " + b);
    }
}