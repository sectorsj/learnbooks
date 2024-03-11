package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_2_1_1_while_140;

/**
 * 5.2.1.1 - Цикл While
 *
 * Пример 1:
 * выполняется обратный отсчет начиная с 10,
 * выводится ровно 10 строк "тактов":
 *
 * Программа выводит следующий результат:
 * такт 10
 * такт 9
 * такт 8
 * такт 7
 * такт 6
 * такт 5
 * такт 4
 * такт 3
 * такт 2
 * такт 1
 */
class While {
    public static void main(String[] args) {

        // Пример 1:
        int n = 10;
        while (n > 0) {
            System.out.println("такт " + n);
            n--;
        }
    }
}
