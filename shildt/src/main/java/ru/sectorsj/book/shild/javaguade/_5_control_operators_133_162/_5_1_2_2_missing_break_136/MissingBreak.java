package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_1_2_2_missing_break_136;

/**
 * Пример 1:
 *
 * 1) Указывать оператор break необязательно.
 *
 * 2) Если его опустить, то выполнение продолжится
 *    с оператора следующей ветви выбора case.
 *
 * 3) В некоторых случаях желательно
 *    использовать несколько операторов ветвей выбора case
 *    без разделяющих их операторов break.
 *
 * Эта программа выводит следующий результат:
 * меньше 5
 * меньше 5
 * меньше 5
 * меньше 5
 * меньше 5
 * меньше 10
 * меньше 10
 * меньше 10
 * меньше 10
 * меньше 10
 * равно или больше 10
 * равно или больше 10
 *
 * 4) Операторы выполняются
 *    в каждой ветви case до тех пор,
 *    пока не будет достигнут:
 *      - оператор break
 *      - конец оператора switch
 * 5) Несмотря на то, что пример 1:
 *    специально создан как демонстрационный,
 *    пропуск операторов break
 *    часто применяют в реальных программах.
 */
public class MissingBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i меньше 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i меньше 10");
                    break;
                default:
                    System.out.println("i равно или больше 10");
            }
        }
    }
}