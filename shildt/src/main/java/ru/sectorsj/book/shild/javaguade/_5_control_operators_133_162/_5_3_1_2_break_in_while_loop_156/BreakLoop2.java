package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_3_1_2_break_in_while_loop_156;

/**
 * 5.3.1.2 -  break в цикле while
 *
 * Оператор break можно применять в любых циклах,
 * доступных в Java, включая преднамеренно бесконечные циклы.
 *
 * Пример 1:
 * Переделанный вариант примера программы 5.3.1.1,
 * где применяется цикл while.
 *
 * Применение оператора break для выхода из цикла while.
 *
 * Результат выполнения программы:
 * i: 0
 * i: 1
 * i: 2
 * i: 3
 * i: 4
 * i: 5
 * i: 6
 * i: 7
 * i: 8
 * i: 9
 * Цикл прерван.
 */
public class BreakLoop2 {
    public static void main(String[] args) {

        // Пример 1:
        int i = 0;

        while (i < 100) {

            // выход из цикла while,
            // если значение переменной i = 10
            if (i == 10) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл прерван");
    }
}