package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_2_5_0_string_literals_90;

/**
 * 3.2.5.0 - Строковые литералы
 *
 * Строковые литералы обозначаются в Java так же ,
 * как и в других языках программирования.
 *
 * С этой целью последовательность символов
 * заключается в двойные кавычки.
 *
 * Примеры 1:
 * строковых литералов:
 *   "Hello World"
 *   "two\nlines"
 *   "\"This is in quotes\""
 *
 * Управляющие символы и:
 * 1) 8-разрядная
 *          или
 * 2) 16-разрядная форма записи,
 * определенные для символьных литералов,
 * действуют точно так же и в строковых литералах.
 *
 * Но в Java символьные строки
 * должны начинаться и оканчиваться в одной строке.
 *
 * В отличие от других языков программирования,
 * в Java отсутствует специальный
 * управляющий символ для продолжения строки.
 *
 * ВАЖНО!
 * В некоторых языках символьные строки
 * реализованы в виде массивов символов.
 *
 * Но совсем иначе дело состоит в Java.
 * На самом деле символьные строки представляют собой объектные типы.
 *
 * В Java символьные строки реализованы в виде объектов,
 * поэтому в Java предоставляется целый ряд
 * - эффективных
 * - простых
 * в использовании средств для их обработки.
 */
public class StringLiterals {
    String s1 = "Hello World";
    String s2 = "two\n lines";
    String s3 = "\"This is in quotes\"";
}
