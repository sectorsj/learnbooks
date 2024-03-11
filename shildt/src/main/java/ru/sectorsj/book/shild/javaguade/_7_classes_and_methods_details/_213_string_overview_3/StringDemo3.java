package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._213_string_overview_3;

/**
 * Могут существовать и массивы символьных строк,
 * подобно массивам объектов любого других типов.
 */

// Демонстрация применения массивов
// объектов типа String
class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"один", "два", "три"};

        for (int i = 0; i < str.length; i++) {
            System.out.println("str[" + i + "]: " + str[i]);
        }
    }

    /**
     * Программа выводит следующий результат:
     *
     * str[0]: один
     * str[1]: два
     * str[2]: три
     *
     * Строковые массивы играют важную роль во многих программах на Java.
     */
}
