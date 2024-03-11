package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_2_3_6_foreach_150;

/**
 * 5.2.3.6 - Пример 1 Foreach
 *
 * Пример 1:
 * применение цикла for в стиле for each.
 * для вывода суммирования значений
 *
 * Результат выполнения программы:
 * Значение равно: 1
 * Значение равно: 2
 * Значение равно: 3
 * Значение равно: 4
 * Значение равно: 5
 * Значение равно: 6
 * Значение равно: 7
 * Значение равно: 8
 * Значение равно: 9
 * Значение равно: 10
 * Сумма равна: 55
 *
 * 1) Как следует из этого результата,
 *    оператор цикла for в стиле foreach
 *    автоматически перебирает элементы массива,
 *    от наименьшего индекса к наибольшему.
 *
 * 2) Повторение цикла for в стиле for each выполняется до тех пор,
 *    пока не будут перебраны все элементы массива,
 *    но этот цикл можно прервать и раньше,
 *    используя оператор break.
 */
public class ForEach {

    // Пример 1:
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum +=x;
        }

        System.out.println("Сумма равна: " + sum);
    }
}