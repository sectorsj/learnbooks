package ru.sectorsj._1_begin_programming._47_console_input_demo;

import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String day,month;

        System.out.print("какой сегодня день?");
        day = input.nextLine();

        System.out.print("Какой месяц?");
        month = input.nextLine();

        String text;
        text = "Сегодня " + day + ", месяц - " + month;

        System.out.println(text);

    }
}
