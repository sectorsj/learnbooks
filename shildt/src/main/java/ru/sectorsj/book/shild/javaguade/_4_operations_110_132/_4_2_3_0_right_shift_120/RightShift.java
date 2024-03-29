package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_2_3_0_right_shift_120;

/**
 * 4.2.3.0 - Сдвиг вправо
 *
 * ">>" - операция сдвига вправо смещает вправо
 *        все двоичные разряды заданного значения
 *        на указанное количество позиций.
 *
 *        Общая форма:
 *        значение >> количество
 *
 *        Параметры:
 *        количество - число позиций,
 *                     на которое следует сдвинуть вправо
 *                     двоичные разряды в заданном значении.
 *
 * Пример 1:
 * значение 32 сдвигается вправо на две позиции.
 *
 * int a = 32;
 * теперь переменная "a"
 * содержит значение 8
 *
 * a  = a >> 2;
 *    00100011    32
 * >> 2
 * _________________
 *    00001000     8
 *
 * 1) При каждом сдвиге вправо
 *    выполняется деление заданного значения на 2
 *    с отбрасыванием любого остатка.
 *
 * 2) Этой особенностью данной операции
 *  можно воспользоваться для
 *  эффективного целочисленного деления на 2.
 *
 * 3) Однако следует проявлять осторожность,
 *    чтобы не потерять двоичные разряды,
 *    безвозвратно сдвинутые за пределы
 *    правой границы числового значения.
 *
 * 4) При выполнении операции сдвига вправо
 *    старшие двоичные разряды на крайних слева позициях
 *    освобождаются и заполняются предыдущим содержимым
 *    старшего двоичного разряда.
 *
 * 5) В итоге происходит так называемое расширение знака,
 *    которое служит для сохранения знака
 *    отрицательных чисел при их сдвиге вправо.
 *
 * Пример:
 * результат выполнения операции -8 >> 1 = -4,
 * что в двоичном представлении выглядит следующим образом:
 *
 * 11111000    -8
 * >> 1
 * ______________
 * 11111100    -4
 */
public class RightShift {
}
