package ru.sectorsj.book.shild.javaguade._3_data_types_vars_arrays_79_109._3_2_0_0_about_literals_86;

/**
 * 3.2.0.0 - Подробнее о литералах
 *
 * Литералы упоминались в главе 2.
 *
 * Когда формально описаны
 * встроенные примитивные типы данных,
 * можно рассмотреть литералы более подробно.
 */
public class AboutLiterals {

    public static void main(String[] args) {
        integerLiterals();
        floatingPointLiterals();
        booleanLiterals();
        characterLiterals();
        stringLiterals();
    }

    /**
     * Целочисленные литералы
     */
    private static void integerLiterals() {
        System.out.println("\nЦелочисленные литералы");

        float num1 = 0x7ffffffffffffffL;
        System.out.println("0x7ffffffffffffffL = " + num1);

        float num2 = 9223372036854775807L;
        System.out.println("9223372036854775807L = " + num2);

        int num3 = 0b1010;
        System.out.println("0b1010 = " + num3);

        int num4 = 123_456_789;
        System.out.println("123_456_789 = " + num4);

        int num5 = 123____456____789;
        System.out.println("123____456____789 = " + num5);

        int num6 = 0b1101_0101_0001_1010;
        System.out.println("0b1101_0101_0001_1010 = " + num6);
    }

    /**
     * Литералы с плавающей точкой
     */
    private static void floatingPointLiterals() {
        System.out.println("\nЛитералы с плавающей точкой");

        double num7 = 6.022E23;
        System.out.println("6.022E23 = " + num7);

        double num8 = 314159E-05;
        System.out.println("314159E-05 = " + num8);

        double num9 = 2e+100;
        System.out.println("2e+100 = " + num9);

        double num10 = 0x12.2P2;
        System.out.println("0x12.2P2 = " + num10);

        double num11 = 9_423_497.1_0_9;
        System.out.println("9_423_497.1_0_9 = " + num11);

        double num12 = 9_423_497_862.0;
        System.out.println("9_423_497_862.0 = " + num12);
    }

    /**
     * Логические литералы
     */
    private static void booleanLiterals() {
        System.out.println("\nЛогические литералы");

        boolean a = true;
        System.out.println("boolean a = " + a);

        boolean b = false;
        System.out.println("boolean b = " + b);
    }

    /**
     * Символьные литералы
     */
    private static void characterLiterals() {
        System.out.println("\nСимвольные литералы");

        char ch1 = 'а';
        System.out.println("char ch1 = " + ch1);

        char ch2 = 'z';
        System.out.println("char ch2 = " + ch2);

        char ch3 = '@';
        System.out.println("char ch3 = " + ch3);

        char ch4 = '\'';
        System.out.println("char ch4 = " + ch4);

        char ch5 = '\n';
        System.out.println("char ch5 = " + ch5);

        char ch6 = '\141';
        System.out.println("char ch6 = " + ch6);

        char ch7 = '\u0061';
        System.out.println("char ch7 = " + ch7);

        // Управляющие конструкции:
        //  \ddd    - Восьмеричный символ (ddd)
        //  \\uxxxx - Шестнадцатеричный символ в Юникоде
        //  \'      - Одинарная кавычка
        //  \"      - Двойная кавычка
        //  \\      - Обратная косая черта
        //  \r      - Возврат каретки
        //  \n      - Новая строка (или перевод строки)
        //  \f      - Подача страницы
        //  \t      - Табуляция
        //  \b      - Возврат на одну позицию ("забой")
    }

    /**
     * Строковые литералы
     */
    private static void stringLiterals() {
        System.out.println("\nСтроковые литералы");

        String s1 = "Hello World";
        System.out.println("String s1 = " + s1);

        String s2 = "two\n lines";
        System.out.println("String s2 = " + s2);

        String s3 = "\"This is in quotes\"";
        System.out.println("String s3 = " + s3);
    }
}
