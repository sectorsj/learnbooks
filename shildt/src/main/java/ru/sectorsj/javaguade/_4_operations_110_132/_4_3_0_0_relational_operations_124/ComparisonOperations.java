package ru.sectorsj.book.shild.javaguade._4_operations_110_132._4_3_0_0_relational_operations_124;

/**
 *
 * 4.3.0.0 - Операции отношения (сравнения)
 *
 * Операции отношения - иначе операциями сравнения,
 *                      определяют отношение одного операнда к другому.
 *
 * 1) Они определяют равенство и упорядочение.
 *
 * Все доступные в Java операции отношения перечислены в табл. 4.4.
 *
 * Таблица 4.4 Операции отношения в Java
 * | Операция |     Описание       |
 * |----------|--------------------|
 * |    ==    |  Равно             |
 * |    !=    |  Не равно          |
 * |    >     |  Больше            |
 * |    <     |  Меньше            |
 * |    >=    |  Больше или равно  |
 * |    <=    |  Меньше или равно  |
 * |----------|--------------------|
 *
 * 2) Результатом операции отношения
 *    является логическое значение.
 *
 * 3) Чаще всего операции отношения
 *    применяются в выражениях:
 *    а) управляющих условным оператором if
 *    б) различными операторами цикла
 *
 * В языке Java допускается сравнивать значения любых типов,
 * в том числе:
 *     а) целочисленные значения,
 *     б) числовые значения с плавающей точкой,
 *     в) символы
 *     г) логические значения,
 * выполняя проверку:
 *  а) на равенство ==
 *  б) неравенство !
 *
 * В Java:
 *  == - это равенство
 *  =  - это операция присваивания
 *
 * Сравнение с помощью операций упорядочения
 * допускается только для числовых типов данных.
 *
 * Сравнение, позволяющее определить,
 * какой из двух операндов:
 *  - больше
 *  - меньше
 * можно выполнить только над:
 * а) целочисленными операндами
 * б) числовыми операндами с плавающей точкой
 * в) символьными операндами
 *
 * Пример 1:
 * В данном примере логическое значение false,
 * получающееся в результате выполнения операции a < b,
 * сохраняется в переменной "c".
 *
 * int a = 4;
 * int b = 1;
 * boolean c = a < b;
 *
 * С/С++:
 * очень часто встречаются
 * приведенные ниже типы операторов:
 *
 * int done;
 * // ...
 * if (!done)...    // Допустимо в С/С++,
 * if (done)...     // но не в Java.
 *
 *
 * в Java:
 * эти операторы должны быть
 * написаны следующим образом:
 * if (done == 0)... // Это стиль Java
 * if (done != 0)...
 *
 * В Java определение:
 * - "истинное" значение
 * - "ложное" значение
 * отличается от их определения в С/С++.
 *
 * 1) В языках С/С++:
 *      а) истинное значение - любое ненулевое значение
 *      б) ложное значение   - нулевое
 * 2) в Java:
 *      а) логические значения true (истинно)
 *      б) логическое значение false (ложно)
 *    являются нечисловыми и никак не связаны с:
 *    - нулевым значением
 *    - ненулевым значением
 *
 *    Поэтому в выражениях на Java
 *    приходится явно указывать
 *    одну или несколько операций отношения,
 *    чтобы проверить значение на:
 *    - равенство нулю
 *    - неравенство нулю
 */
public class ComparisonOperations {
    public static void main(String[] args) {

        // Пример 1:
        int a = 4;
        int b = 1;
        boolean c = a < b;
    }
}