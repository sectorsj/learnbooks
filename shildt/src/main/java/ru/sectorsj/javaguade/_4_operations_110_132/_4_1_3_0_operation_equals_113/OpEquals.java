package ru.sectorsj.javaguade._4_operations_110_132._4_1_3_0_operation_equals_113;

/**
 * 4.1.3.0 - Составные арифметические операции с присваиванием
 *
 * В языке Java имеются специальные операции,
 * объединяющие арифметические операции
 * с операцией присваивания.
 *
 * Операция присваивания "="
 * встречаются в программах достаточно часто.
 *
 * Однако здесь идет речь
 * о совместном применении:
 * - арифметических операций
 * - операций присваивания.
 *
 * Пример 1:
 * выполняется увеличение
 * значение переменной a на 4.
 *
 * Равнозначные записи:
 * a = a + 4;
 * а += 4;
 *
 * Обе операции выполняют
 * одно и то же действие:
 *
 * Пример 2:
 * Равнозначные записи:
 * a = a % 2;
 * а %= 2;
 *
 * Пример 3:
 * Равнозначные записи:
 * a = a % 2;
 * a %= 2;
 *
 * вычисляется остаток от деления
 * вычисляется деление по модулю
 * a / 2,
 * а результат размещается обратно
 * в переменной "a".
 *
 *
 * В данном случае
 * при выполнении операции "%="
 * вычисляется остаток от деления a/ 2,
 * а результат размещается обратно в переменной "а".
 *
 * 1) Составные операции с присваиванием
 *    существуют для всех арифметических операций
 *    с двумя операндами.
 *
 * 2) Любую операцию следующей формы:
 *    переменная = переменная операция выражение;
 *
 *    можно записать так:
 *    переменная операция = выражение;
 *
 * Составные операции с присваиванием дают 2 преимущества:
 * 1) они позволяют уменьшить объем вводимого кода,
 *    поскольку являются "сокращенным" вариантом
 *    соответствующих длинных форм.
 *
 * 2) их реализация в исполняющей системе Java
 *    оказывается эффективнее реализации
 *    эквивалентных длинных форм.
 *
 *    В программах, профессионально написанных на Java,
 *    составные операции с присваиванием
 *    встречаются довольно часто.
 *
 * Пример 1:
 * демонстрация составных операций с присваиванием.
 *
 * Результат выполнения программы:
 * int a = 1;  a += 5;      a = 6
 * int b = 2;  b *= 4;      b = 8
 * int c = 3;  c += a * b;  c = 51
 * c = 51;     c %= 6;      c = 3
 */
public class OpEquals {

    // Пример 1:
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        System.out.println("int a = 1;  a += 5;      a = " + a);
        System.out.println("int b = 2;  b *= 4;      b = " + b);
        System.out.println("int c = 3;  c += a * b;  c = " + c);
        c %= 6;
        System.out.println("c = 51;     c %= 6;      c = " + c);
    }
}