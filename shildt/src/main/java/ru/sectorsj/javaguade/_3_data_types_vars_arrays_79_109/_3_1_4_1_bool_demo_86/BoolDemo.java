package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_1_4_1_bool_demo_86;

/**
 * Демонстрация применения логического типа данных - boolean
 *
 * Эта программа выводит следующий результат:
 * b равно false
 * b равно true
 * Этот код выполняется.
 * 10 > 9 = true
 *
 * В приведенном выше примере программы есть 3 важных момента.
 * 1) при выводе значения типа boolean
 *    в консоль с помощью метода println()
 *    на экране появляется слово "true" или "false"
 *
 * 2) одного значения переменной типа boolean
 *    оказывается достаточно для управления
 *    условным оператором if.
 *    Записывать условный оператор:
 *    if так -> if(b == true)...
 *    совсем не обязательно.
 * 3) результатом выполнения операции сравнения
 *    вроде "<" является логическое значение типа boolean.
 *    Именно поэтому выражение:
 *      10 > 9
 *    приводит к выводу слова "true".
 *    Более того, выражение:
 *      10 > 9
 *    должно быть заключено в дополнительный ряд круглых скобок,
 *    поскольку операция "+",
 *    имеет более высокую степень предшествования,
 *    чем операция ">".
 */
class BoolDemo {
    public static void main(String[] args) {
        // объявление переменной
        boolean b;

        // присвоение значения - ложь, переменной "b"
        b = false;

        // вывод в консоль результата программы
        System.out.println("b равно " + b);

        // присвоение значения - истина, переменной "b"
        b = true;

        // вывод в консоль результата программы
        System.out.println("b равно " + b);

        // Значение типа boolean может управлять оператором if
        if (b == true) System.out.println("Этот код выполняется.");
        b = false;
        if (b) System.out.println("Этот код не выполняется.");

        // Результат сравнения - значения типа boolean
        System.out.println( "10 > 9 = " + (10 > 9));
    }
}