package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_5_2_1_2d_array_again_104;

/**
 * 3.5.2.1 - Двумерные массивы
 *
 * Пример 2:
 * 1) элементы массива нумеруются:
 *    - слева направо
 *    - сверху вниз
 * 2) выводятся их значения:
 *
 * Эта программа выводит следующий результат:
 *  0   1   2   3   4
 *  5   6   7   8   9
 * 10  11  12  13  14
 * 15  16  17  18  19
 */
class TwoDArray{
    public static void main(String[] args) {

        // Пример 2:
        int twoD[][] = new int[4][5];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)

                // вывод в консоль итогов программы
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}