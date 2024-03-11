//package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._218_overloading_methods_with_variable_length_args;
package ru.sectorsj.book.shild.javaguade._7_classes_and_methods_details._218_overloading_methods_with_variable_length_args;

/**
 * Перегрузка методов с аргументами переменной длинны
 *
 * Метод, принимающий аргументы переменной длины, можно перегружать.
 * метод vaTest() перегружается трижды.
 *
 * Пример 1:
 * демонстрируются 2 возможных способа
 * перегрузки метода с аргументами переменной длины:
 * 1) у параметра данного метода с переменным
 *    количеством аргументов могут быть разные типы.
 *
 *    Именно это имеет место в вариантах метода:
 *      vaTest (int ...)
 *      vaTest (boolean ...)
 *    Языковая конструкция "..." вынуждает компилятор
 *    обрабатывать параметр как массив заданного типа.
 *
 *    Используя разные типы аргументов переменной длины,
 *    можно выполнять перегрузку методов
 *    с переменным количеством аргументов таким же образом,
 *    как и обычных методов с массивом разнотипных параметров.
 *
 *    Тогда исполняющая система Java использует отличие
 *    в типах аргументов для выбора нужного варианта перегружаемого метода.
 *
 * 2) добавить 1 или несколько обычных параметров.
 *    Именно это и было сделано при объявлении метода:
 *      vaTest (String, int ...).
 *    В данном случае для выбора нужного варианта метода
 *    исполняющая система Java использует не только количество аргументов,
 *    но и их тип.
 *
 * ВАЖНО!
 * Метод, поддерживающий переменное количество аргументов,
 * может быть также перегружен методом,
 * который не поддерживает такую возможность.
 *
 * В примере 1, метод vaTest() может быть
 * перегружен методом vaTest(int х).
 *
 * Этот специализированный вариант вызывается
 * только при наличии аргумента типа int.
 *
 * Если же передаются 2 или более аргумента типа int,
 * то будет выбран вариант метода vaTest (int ... v)
 * с аргументами переменной длины.
 */
class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.println("vaTest(int ...): "
                + "Количество аргументов: "
                + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ...) " +
                " Количество аргументов: " +
                v.length + " Содержимое: ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String, int ...): " +
                msg + v.length + " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Проверка: ", 10, 20);
        vaTest(true, false, false);
    }

}
