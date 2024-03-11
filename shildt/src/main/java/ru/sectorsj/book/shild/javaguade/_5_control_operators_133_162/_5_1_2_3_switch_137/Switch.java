package ru.sectorsj.book.shild.javaguade._5_control_operators_133_162._5_1_2_3_switch_137;

/**
 * Пример 1:
 *
 * переделанная версия программы (5.1.1.3),
 * в которой определяется
 * принадлежность месяца времени года.
 *
 * В этой версии использован оператор switch,
 * что позволило добиться
 * более эффективной реализации данной программы.
 */
public class Switch {
    public static void main(String[] args) {
        String[]months = {
                "Кукарябрь", "Январь",  "Февраль",
                "Март",      "Апрель",  "Май",
                "Июнь",      "Июль",    "Август",
                "Сентябрь",  "Октябрь", "Ноябрь",
                "Декабрь"
        };

        // выбор месяца
        int month = 4;
        String season;
        switch (month) {
            case 12: case 1: case 2:
                season = "зиме";
                break;
            case 3: case 4: case 5:
                season = "весне";
                break;
            case 6: case 7: case 8:
                season = "лету";
                break;
            case 9: case 10: case 11:
                season = "осени";
                break;
            default:
                season = "вымышленным месяцам";
        }
        System.out.println(months[month] + " относится к " + season + ".");
    }
}