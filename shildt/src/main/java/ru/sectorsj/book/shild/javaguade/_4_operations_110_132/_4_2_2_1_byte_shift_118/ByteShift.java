package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_2_2_1_byte_shift_118;

/**
 * Пример 1:
 * 1) При сдвиге влево двоичных разрядов значения типа byte
 * сначала происходит продвижение
 * к типу int и только затем сдвиг.
 *
 * 2) Чтобы получить требуемое,
 * сдвинутое влево значение типа byte
 * придется отбросить три старших байта результата.
 *
 * Для этого нужно привести результат обратно к типу byte.
 *
 * Эта программа выводит следующий результат:
 * Первоначальное значение a: 64
 * i and b: 256 0
 *
 * Для целей вычисления:
 * 1) тип переменной "a" продвигается к типу int,
 * 2) сдвиг влево значения 64 (0100 0000)
 * на 2 позиции приводит к значению 256 (1 0000 0000),
 * присваиваемому переменной "i".
 *
 * 3) Но переменная "b" содержит нулевое значение,
 * поскольку после сдвига
 * в младшем двоичном разряде устанавливается "0".
 *
 * 4) Единственный единичный двоичный разряд
 * оказывается сдвинутым за пределы
 * допустимого диапазона значений.
 */
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение а: " + a);
        System.out.println("i and b: " + i + " " + b);
    }
}
