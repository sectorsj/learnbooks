package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_5_1_1_recursion_2_198;

/**
 * 7.5.2.0 - Еще один пример организации рекурсии.
 *
 * Пример 1.1, 1.2:
 * Рекурсивный метод printArray()
 * выводит первые i элементов из массива values.
 *
 * Результат выполнения программы:
 * [0] 0
 * [1] 1
 * [2] 2
 * [3] 3
 * [4] 4
 * [5] 5
 * [6] 6
 * [7] 7
 * [8] 8
 * [9] 9
 */

// Пример 1.1:
class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    // Вывести рекурсивно элементы массива
    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}

// Пример 1.2:
class Recursion2 {
    public static void main(String[] args) {
        RecTest obj = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) {
            obj.values[i] = i;
        }
        obj.printArray(10);
    }
}