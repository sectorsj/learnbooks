package ru.sectorsj.orailly.learnjava._331_stringsAndDataDemo;

import java.util.Date;

public class StringAndDataTest {
    public static void main(String[] args) {

        // Пример форматированной строки
        int one = 204566654;
        double two = 100567890.248907;
        String stringFormatted = String.format("Уровень %,d или %,.2f", one, two);
        System.out.println(stringFormatted);

        // Пример форматированной даты
        Date today = new Date();
        String dateFormatted = String.format("%tA, %tB %td", today, today, today);
        System.out.println(dateFormatted);

        // Тоже самое что и вы предыдущей строке
        // без дублирования "today" с помощью "<"
        String dateFormatted2 = String.format("%tA, %<td %<tB %<tY", today);
        System.out.println(dateFormatted2);
    }
}