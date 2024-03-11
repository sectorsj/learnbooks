package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_1_2_1_sample_switch_136;

/**
 * Пример 1:
 * применение оператора switch.
 *
 * Эта программа выводит следующий результат:
 * i равно нулю.
 * i равно единице.
 * i равно двум.
 * i равно трем.
 * i больше трех.
 * i больше трех.
 *
 * 1) На каждом шаге цикла
 *    выполняются операторы,
 *    связанные с константой
 *    в той ветви выбора case,
 *    которая соответствует значению переменной i,
 *    а все остальные операторы пропускаются.
 *
 * 2) выполняется оператор default,
 *    после того как значение переменной i
 *    становится больше 3,
 *    оно перестает соответствовать значению константы
 *    в любой ветви выбора case.
 */
public class SampleSwitch {
    public static void main(String[] args) {
        // Пример 1
        for (int i = 0; i < 6; i++) {
            switch(i){
                case 0:
                    System.out.println("i равно нулю.");
                    break;
                case 1:
                    System.out.println("i равно единице.");
                    break;
                case 2:
                    System.out.println("i равно двум.");
                    break;
                case 3:
                    System.out.println("i равно трем.");
                    break;
                default:
                    System.out.println("i больше трех.");
            }
        }
    }
}