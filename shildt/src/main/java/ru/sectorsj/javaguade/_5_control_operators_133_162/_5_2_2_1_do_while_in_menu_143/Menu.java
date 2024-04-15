package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_2_2_1_do_while_in_menu_143;

import java.io.IOException;


/**
 * 5.2.2.1 Применение DoWhile
 *
 * 1) do-while особенно удобен при выборе пунктов меню,
 *    поскольку требуется, чтобы тело цикла меню
 *    выполнялось по меньшей мере один раз.
 *
 * Пример 1:
 * Реализация системы справки по операторам выбора и цикла в Java:
 *
 *
 * В данном примере:
 * 1) проверка допустимости
 *    введенного пользователем значения
 *    осуществляется в цикле do-while.
 *
 * 2) Если это значение недопустимо,
 *    то пользователю предлагается повторить ввод.
 *
 * 3) Поскольку меню должно отобразиться хотя бы 1 раз,
 *    то цикл do-while оказывается идеальным средством
 *    для решения этой задачи.
 *
 * У данной программы имеется ряд других особенностей.
 *
 * 4) Для ввода символов с клавиатуры
 *    вызывается метод System.in.read(),
 *    выполняющий одну из функций
 *    консольного ввода в Java.
 *
 *    Методы консольного ввода-вывода (главе 13)
 *
 * 5) В данном случае метод System.in.read()
 *    служит для получения результата выбора,
 *    сделанного пользователем.
 *     а) Этот метод вводит символы
 *        из стандартного потока ввода,
 *     б) Откуда они возвращаются в виде
 *        ЦЕЛОЧИСЛЕННЫХ ЗНАЧЕНИЙ (int).
 *
 *        Именно поэтому тип возвращаемого значения
 *        приводится к типу СИМВОЛОВ (char).
 *
 * ВАЖНО!
 * По умолчанию данные из стандартного потока ввода
 * размещаются в буфере построчно,
 * поэтому нужно нажать клавишу <Enter>,
 * чтобы любые введенные символы были переданы программе.
 *
 * 6) Данная программа должна содержать выражение
 *      throws java.io.IOException,
 *    поскольку в ней используется метод System.in.read().
 *
 *    Это выражение необходимо
 *    для обработки ошибок ввода,
 *    и является составной частью
 *    системы обработки исключений в Java.
 *
 * Обработка исключений (глава 10)
 */
public class Menu {

    // Пример 1
    // Использование оператора цикла do-while для выбора пункта меню
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Справка по операторам: ");
            System.out.println("           1. if ");
            System.out.println("           2. switch ");
            System.out.println("           3. while ");
            System.out.println("           4. do-while ");
            System.out.println("           5. for\n ");
            System.out.println(" Выберите нужный пункт: ");
            choice = (char) System.in.read();

        } while (choice < '1' || choice > '5');
        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("if: \n");
                System.out.println("if (условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch: \n");
                System.out.println("switch(выражение) {");
                System.out.println("   case константа:");
                System.out.println("   последовательность операторов");
                System.out.println("   break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while: \n");
                System.out.println("while (условие) оператор;");
                break;
            case '4':
                System.out.println("do-while: \n");
                System.out.println("do {");
                System.out.println("    оператор");
                System.out.println("} while (условие);");
                break;
            case '5':
                System.out.println("for: \n");
                System.out.println("for (инициализация; условие; итерация) ");
                System.out.println("   оператор;");
                break;
        }
    }
}