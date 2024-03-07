package ru.sectorsj.hortsmann_vol1._138_calendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

class CalTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   // Получаем текущую дату
        int month = date.getMonthValue();   // Получаем номер месяца
        int today = date.getDayOfMonth();   // Получаем текущий день месяца

        date = date.minusDays(today - 1);  // Устанавливаем дату на первый день текущего месяца
        DayOfWeek weekday = date.getDayOfWeek();         // Получаем день недели для этой даты.
        int value = weekday.getValue();                  // Получаем числовое значение дня недели (1 для понедельника, ..., 7 для воскресенья)
        System.out.println(" Mon  Tue  Wed  Thu  Fri  Sat  Sun");   // Выводим шапку календаря
        for (int i = 1; i < value; i++) {                // Выводим пробелы для выравнивания первой недели
            System.out.print("     ");
        }
        while (date.getMonthValue() == month){              // Выводим дни месяца и помечаем текущий день звездочкой (*)
            System.out.printf("%4d", date.getDayOfMonth()); // Выводим день месяца с выравниванием по 4 символа
            if (date.getDayOfMonth() == today) {            // Помечаем текущий день звездочкой
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);         // Переходим к следующему дню месяца
            if (date.getDayOfWeek().getValue() == 1){   // Переходим на новую строку, если началась новая неделя
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1){       // Если последний день месяца не воскресенье, переходим на новую строку
            System.out.println();
        }
    }
}
