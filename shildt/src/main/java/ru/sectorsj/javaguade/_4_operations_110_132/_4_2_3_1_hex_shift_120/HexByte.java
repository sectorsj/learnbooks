package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_2_3_1_hex_shift_120;

/**
 * 1) Результат сдвига значения -1 вправо всегда равен -1,
 *    поскольку расширение знака
 *    приводит к переносу дополнительных единиц
 *    в старшие двоичные разряды.
 *
 * 2) Иногда при выполнении сдвига вправо
 *    расширение знака числовых значений нежелательно.
 *
 * 3) Значение типа byte преобразуется в соответствующее
 *    шестнадцатеричное строковое представление.
 *
 * 4) Для индексации массива символов,
 *    обозначающих шестнадцатеричные цифры,
 *    сдвинутое вправо исходное значение
 *    маскируется значением 0х0f в поразрядной логической операции И,
 *    что приводит к отбрасыванию любых двоичных разрядов расширения знака.
 *
 * Эта программа выводит следующий результат:
 * b = 0xf1
 */
public class HexByte {
    public static void main(String[] args) {
        char hex [] = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}