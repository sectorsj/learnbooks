package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_5_2_2_memory_reserve_104;

/**
 * 3.5.2.2 - Резервирование памяти
 *
 * При резервировании памяти
 * под многомерный массив необходимо:
 * 1) указать память только для 1го (левого) измерения массива.
 *
 * 2) для каждого из остальных измерений массива
 *    память можно резервировать отдельно.
 *
 *                    1е(левое) измерение
 *                        |
 * int twoD[][] = new int[4][];
 *                          |
 *                    2e(правое) измерение
 *
 * Пример 3:
 * 1) память резервируется только
 *    для 1го измерения массива twoD
 *    при его объявлении.
 * 2) резервирование памяти для 2го измерения массива
 *    осуществляется вручную
 *
 * Отдельное резервирование памяти
 * для 2го измерения массива
 * не дает никаких преимуществ,
 * но в других случаях это может быть полезно.
 */
class TwoDAlternative{
    public static void main(String[] args) {

        // Пример 3:
        int twoD[][] = new int[4][];
        twoD[0] = new int[5];
        twoD[1] = new int[5];
        twoD[2] = new int[5];
        twoD[3] = new int[5];
    }
}