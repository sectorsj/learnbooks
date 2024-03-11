package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_5_2_5_3d_matrix_105;

/**
 * 3.5.2.5 - Многомерный массив (3d матрица)
 *
 * Пример 6:
 * 1) сначала создается трехмерный массив
 *    размерностью Зх4х5,
 * 2) каждый элемент массива заполняется
 *    произведением его индексов,
 * 3) эти произведения выводятся на экран.
 *
 * Эта программа выводит следующий результат:
 *  0   0   0   0   0
 *  0   0   0   0   0
 *  0   0   0   0   0
 *  0   0   0   0   0
 *
 *  0   1   4   9   16
 *  0   1   4   9   16
 *  0   1   4   9   16
 *  0   1   4   9   16
 *
 *  0   2   8   18   32
 *  0   2   8   18   32
 *  0   2   8   18   32
 *  0   2   8   18   32
 */
class ThreeDMatrix{
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        int i, j, k;

        System.out.println();
        for (i = 0; i < 3; i++){
            for(j = 0; j < 4; j++){
                for(k = 0; k < 5; k++){
                    threeD[i][j][k] = i * k * k;
                }
            }
        }

        for (i = 0; i < 3; i++){
            for(j = 0; j < 4; j++) {
                for(k = 0; k < 5; k++){
                    System.out.print(threeD[i][j][k] + "   ");
                }
                System.out.println();
            }
            System.out.println("  ");
        }
    }
}