package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._7_9_0_0_more_about_arrays_205;

/**
 * 7.9.0.0 - ЕЩЕ О МАССИВАХ
 *
 * Массивы были представлены в главе 3 (стр. 99).
 *
 * Имея представление о классах,
 * можно сделать важный вывод относительно массивов:
 * все массивы реализованы как объекты.
 *
 * При программировании на Java,
 * для массивов существует специальное средство -
 *  "размер массива",
 * которым выгодно воспользоваться.
 *
 * "Размер массива" - количество элементов,
 *                    которые может содержать массив,
 *                    хранится в его переменной экземпляра length.
 *
 * Все массивы обладают этой переменной как свойством,
 * которое всегда содержит размер массива.
 *
 * Пример 1:
 * демонстрации свойства массивов - length,
 * определяющего длину массива.
 *
 * Программа выводит следующий результат:
 * длинна массива a1 = 10
 * длинна массива a2 = 8
 * длинна массива a3 = 4
 *
 * 1) В программе выводится размер каждого массива.
 *
 * 2) Значение свойства length отражает количество элементов,
 *    которое может содержать массив.
 *
 * 3) Значение свойства length никак не связано
 *    с количеством используемых элементов массива.
 */

// Пример 1:
public class Length {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = {3, 5, 7, 1, 8, 99, 44, -10};
        int[] a3 = {4, 3, 2, 1};

        System.out.println("длинна массива a1 = " + a1.length);
        System.out.println("длинна массива a2 = " + a2.length);
        System.out.println("длинна массива a3 = " + a3.length);
    }
}