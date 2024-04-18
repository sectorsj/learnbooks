package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_2_3_3_using_comma_in_for_loop_146;


/**
 * 5.2.3.3 - Использование запятой в цикле For
 *
 * В ряде случаев требуется указать несколько операторов в
 * инициализирующей и итерационной частях оператора цикла for.
 *
 * Пример 1:
 * Неудачный пример цикла For
 *
 * public static void main(String[] args) {
 *     int a, b;
 *     b = 4;
 *     for(a = 1; a < b; a++) {
 *         System.out.println("a = " + a);
 *         System.out.println("b = " + b);
 *         b--;
 *     }
 * }
 *
 * В примере 1 управление этим циклом
 * осуществляется одновременно двумя переменными.
 *
 * А поскольку цикл управляется двумя переменными,
 * то их желательно включить в сам оператор цикла for,
 * а не выполнять обработку переменной "b" вручную.
 *
 * Для решения этой задачи в Java
 * предоставляется специальная возможность.
 *
 * Для того чтобы 2 переменные или больше
 * могли управлять циклом for,
 * в Java допускается указывать несколько операторов:
 * 1) в инициализирующей части
 * 2) в итерационной части
 * оператора цикла for, разделяя их запятыми.
 *
 * Пример 2:
 * Рациональная организация цикла for с помощью запятой.
 *
 * Результат выполнения программы:
 * a = 1
 * b = 4
 * a = 2
 * b = 3
 *
 * В примере 2 начальные значения обеих переменных:
 * - "а"
 * - "b"
 * управления циклом for
 * устанавливаются в инициализирующей части цикла.
 *
 * Оба разделяемых запятой оператора
 * в итерационной части цикла
 * выполняются при каждом повторении цикла.
 */
public class CommaInForLoop {

    // Пример 2:
    public static void main(String[] args) {
        int a, b;
        for(a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}