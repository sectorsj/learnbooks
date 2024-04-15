package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._212_string_overview_2;

/**
 * В классе String содержится ряд методов, которыми можно пользоваться, программируя на Java.
 * Обсудим вкратце некоторые из них.
 * Так, с помощью метода equals() можно проверить две символьные строки на равенство,
 * а метод length () позволяет выяснить длину символьной строки.
 * Вызывая метод charAt(), можно получить символ по заданному индексу.
 * Ниже приведены общие формы этих трех методов.
 * boolean еquаls(вторая_строка)
 * int length()
 * char сhаrАt(индекс)
 *
 * Применение этих методов демонстрируется в следующем примере программы:
 */

 // Демонстрация некоторых методов из класса String
class StringDemo2 {
    public static void main(String[] args) {
        String strObj1 = "Первая строка";
        String strObj2 = "Вторая строка";
        String strObj3 = strObj1;

        System.out.println("Длинна строки strObj1: " + strObj1.length());
        System.out.println("Символ по индексу 3 в стоке strObj1: " + strObj1.charAt(3));

        if (strObj1.equals(strObj2)) {
            System.out.println("strObj1 == strObj2");
        }
        else {
            System.out.println("strObj1 != strObj2");
        }

        if (strObj1.equals(strObj3)) {
            System.out.println("strObj1 == strObj3");
        }
        else {
            System.out.println("strObj1 != strObj3");
        }
    }

    /**
     * Программа выводит следующий результат:
     *
     * Длинна строки strObj1: 13
     * Символ по индексу 3 в стоке strObj1: в
     * strObj1 != strObj2
     * strObj1 == strObj3
     */
}
