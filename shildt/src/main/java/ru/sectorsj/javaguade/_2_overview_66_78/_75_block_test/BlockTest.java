package ru.sectorsj.javaguade._2_overview_66_78._75_block_test;

/**
 * Адресатом этого оператора цикла for служит блок кода,
 * а не единственный оператор.
 *
 * На каждом шаге цикла будут выполняться три оператора из блока кода.
 *
 * Об этом свидетельствует и результат работы программы.
 *
 * Блоки кода обладают:
 *  - дополнительными свойствами
 *  - областями применения
 *
 * Их основное назначение - создание логически неразрывных единиц кода.
 */
public class BlockTest {

    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Значение x:" + x);
            System.out.println("Значение y:" + y);
            y = y - 2;
        }
    }
}