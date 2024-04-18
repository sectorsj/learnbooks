package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_1_2_4_string_switch_138;


    /**
     * Начиная с JDK 7,
     * для управления оператором switch
     * можно использовать символьные строки.
     *
     * Пример 1:
     * Символьная строка,
     * содержащаяся в переменной "str"
     * (в данном случае "два"),
     * сравнивается с константами
     * в операторах ветвей case.
     *
     * Результат выполнения этой программы:
     *  два
     *
     * Как только обнаружится совпадение
     * (в операторе case 2й ветви выбора},
     * выполняется связанная с ним последовательность кода.
     *
     * Возможность использовать символьные строки
     * в операторе switch зачастую упрощает дело.
     *
     * Применение оператора switch
     * с символьными строками является
     * значительным усовершенствованием
     * по сравнению с эквивалентной последовательностью
     * операторов:
     *  - if
     *  - else.
     *
     * Но с точки зрения эффективности кода,
     * выбор среди символьных строк
     * обходится дороже выбора среди целых чисел.
     *
     * Поэтому символьные строки
     * лучше применять только в тех случаях,
     * когда управляющие данные
     * уже находятся в строковой форме.
     *
     * ВАЖНО!
     * Не следует пользоваться символьными строками
     * в операторе switch без особой необходимости.
     */
public class StringSwitch {
    public static void main(String[] args) {

        // Пример 1:
        String str = "два";
        switch(str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("не совпало");
                break;
        }
    }
}