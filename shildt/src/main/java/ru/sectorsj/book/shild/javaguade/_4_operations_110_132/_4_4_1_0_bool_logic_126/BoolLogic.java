package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_4_1_0_bool_logic_126;

/**
 * Пример 1:
 * выполняются практически те же самые действия,
 * что и в представленном в примере программы BitLogic (4.2.1.0)
 *
 * Результат выполнения программы:
 * a           = true
 * b           = false
 * a|b         = true
 * а&b         = false
 * а^b         = true
 * !a&b | a&!b = true
 * !a          = false
 *
 * Различия:
 * а) BoolLogic - оперирует логическими значениями типа boolean
 * б) BitLogic  - оперирует двоичными разрядами
 *
 * 1) К значениям типа boolean применяются
 *    те же самые логические правила,
 *    что и к двоичным разрядам.
 *
 * 2) В Java строковым представлением
 *    значения типа boolean служит
 *    значение одного из литералов:
 *    - true
 *    - false
 */
public class BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;

        System.out.println("              a = " + a);
        System.out.println("              b = " + b);
        System.out.println("          a | b = " + c);
        System.out.println("          a & b = " + d);
        System.out.println("          a ^ b = " + e);
        System.out.println("!a & b | a & !b = " + f);
        System.out.println("             !a = " + g);
    }
}
