package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_2_1_5_apply_bitwise_op_117;

/**
 * 4.2.1.5 - Применение поразрядных логических операций
 *
 * Пример 1:
 * последовательность двоичных разрядов
 * в переменных a и b
 * представляют все четыре возможные комбинации
 * двух двоичных цифр:
 * 0 - 0
 * 0 - 1
 * 1 - 0
 * 1 - 1
 *
 * О воздействии операций:
 *  - "|"
 *  - "&"
 * на каждый двоичный разряд
 * можно судить по результирующим
 * значениям переменных c и d.
 *
 * Значения, присвоенные переменным е и f,
 * иллюстрируют действие операции:
 *  - "^".
 *
 * Массив символьных строк binary
 * содержит удобочитаемые
 * двоичные представления чисел
 * от О до 15.
 *
 * Этот массив индексирован,
 * что позволяет увидеть
 * двоичное представление
 * каждого результирующего значения.
 *
 * Он построен таким образом,
 * чтобы соответствующее строковое представление
 * двоичного значения "n"
 * хранилось в элементе массива binary [n].
 *
 * Значение ~a уменьшается до величины меньше 16
 * в результате поразрядной логической операции И
 * со значением 0x0f
 * (0000 1111 в двоичном представлении),
 * чтобы вывести его в двоичном представлении
 * из массива binary.
 *
 * Эта программа выводит следующий результат:
 * int a         = 3 => 0011
 * int b         = 6 => 0110
 * int c = a | b = 7 => 0111
 * int d = a & b = 2 => 0010
 * int e = a ^ b = 5 => 0101
 * int f = (~a & b) | (a & ~b) = 5 => 0101
 * int g = ~a & 0x0f = 12 => 1100

 */
class ApplyBitLogicOp {
    // Пример 1:
    public static void main(String[] args) {
        String binary[] = {
                // 0       1       2       3       4       5
                "0000", "0001", "0010", "0011", "0100", "0101",
                // 6       7       8       9      10      11
                "0110", "0111", "1000", "1001", "1010", "1011",
                //12      13      14      15
                "1100", "1101", "1110", "1111",
        };
        // 0 + 2 + 1
        // 0011 - в двоичном представлении
        int a = 3;

        // 4 + 2 + 0
        // 0110 - в двоичном представлении
        int b = 6;

        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        // вывод в консоль результата выполнения программы
        // соотносим результаты со строковым массивом
        System.out.println("int a = " + a + " => " + binary[a]);
        System.out.println("int b = " + b + " => " + binary[b]);
        System.out.println("int c = a | b = " + c + " => " + binary[c]);
        System.out.println("int d = a & b = " + d + " => " + binary[d]);
        System.out.println("int e = a ^ b = " + e + " => " + binary[e]);
        System.out.println("int f = (~a & b) | (a & ~b) = " + f + " => " + binary[f]);
        System.out.println("int g = ~a & 0x0f = " + g + " => " + binary[g]);
    }
}