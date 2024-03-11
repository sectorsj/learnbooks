package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_2_2_0_left_shift_118;

/**
 * 4.2.2.0 - Сдвиг влево
 *
 * 1) "<<" - смещает влево двоичные разряды
 *           заданного значения на количество позиций,
 *           указанных в операнде количество.
 *
 *           Общую форма:
 *           значение << количество
 *
 *           Параметры:
 *           количество - число позиций,
 *                        на которое следует сдвинуть влево
 *                        двоичные разряды в заданном значении.
 *
 * 2) При каждом сдвиге влево
 *    а) самый старший двоичный разряд
 *       смещается за пределы
 *       допустимого диапазона значений
 *       (и при этом теряется),
 *    б) а справа добавляется нуль.
 *
 * 3) При выполнении операции сдвига влево:
 *    а) Если  операнда относится к типу int,
 *       то двоичные разряды теряются
 *       как только они сдвигаются за пределы 31-й позиции.
 *
 *    б) Если же операнд относится к типу long,
 *       то двоичные разряды теряются
 *       после сдвига за пределы 63-й позиции.
 *
 * 4) Автоматическое продвижение типа в Java
 *    приводит к непредвиденным результатам.
 *    при сдвиге влево двоичных разрядов
 *    в значениях типа byte и short.
 *
 * 5) Типы:
 *      - byte
 *      - short
 *    продвигаются к типу int
 *    при вычислении выражения.
 *
 *    Результат вычисления такого выражения
 *    имеет тип int.
 *    В результате сдвига влево двоичных разрядов
 *    значения типа byte или short
 *    получится значение типа int,
 *    и сдвинутые влево двоичные разряды
 *    не будут отброшены до тех пор,
 *    пока они не сдвинутся за пределы 31-й позиции.
 *
 *    При продвижении к типу int
 *    отрицательное значение типа:
 *      - byte
 *      - short
 *    приобретает дополнительный знаковый разряд.
 *
 *    Старшие двоичные разряды заполняются единицами.
 *
 *    Поэтому выполнение операции сдвига влево
 *    по отношению к значению типа:
 *      - byte
 *      - short
 *   подразумевает отбрасывание
 *   старших байтов результата типа int.
 */
public class LeftShift {
}

