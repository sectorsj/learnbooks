package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_1_1_3_if_else_demo_134;

/**
 * Пример 1:
 * конструкция if-else-if служит
 * для определения времени года,
 * к которому относится конкретный месяц.
 *
 * Эта программа выводит следующий результат:
 * Апрель относится к весне
 *
 * независимо от значения,
 * присвоенного переменной month,
 * в конструкции if-else-if
 * будет выполняться только одна операция присваивания.
 */
public class IfElse {
    public static void main(String[] args) {

        // Пример 1:
        // инициализируем массив названий месяцев года
        String[]months = {
                "Кукарябрь", "Январь",  "Февраль",
                "Март",      "Апрель",  "Май",
                "Июнь",      "Июль",    "Август",
                "Сентябрь",  "Октябрь", "Ноябрь",
                "Декабрь"
        };

        // выбор месяца
        int month = 4;

        //инициализируем переменную сезона
        String season;

        // блок if-else-if seasons соотнесен
        // с возможным числом месяца
        if (month == 12 || month == 1 || month == 2)
            season = "зиме";
        else if (month == 3 || month == 4 || month == 5)
            season = "весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "осени";
        else
            season = "вымышленным месяцам";

        // массив "months" соотносится с выбранным месяцем "month"
        // и помещается в переменную result
        String result = months[month];

        // выводим в консоль результат программы:
        System.out.println(result + " относится к " + season + ".");
    }
}