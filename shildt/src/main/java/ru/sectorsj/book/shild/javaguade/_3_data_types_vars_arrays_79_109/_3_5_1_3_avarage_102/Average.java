package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_5_1_3_avarage_102;

/**
 * Пример 3:
 * программа с использованием одномерного массив,
 * где вычисляется среднее значение ряда чисел.
 */
class Average{
    public static void main(String[] args) {
        double nums[]= {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        for(int i = 0; i < 5; i++){
            result = result + nums[i];
        }
        System.out.println( "Среднее значение = " + result / 5);
    }
}