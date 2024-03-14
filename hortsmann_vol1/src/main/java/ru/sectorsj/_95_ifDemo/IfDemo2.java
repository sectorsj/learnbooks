package ru.sectorsj._95_ifDemo;

import java.util.Scanner;

class IfDemo2 {
    public static final int TARGET = 50;

    public static void main(String[] args) {
        int yourSales;
        String performance;
        double bonus;
        Scanner in = new Scanner(System.in);

        System.out.println("Какие у Вас продажи?");
        yourSales = in.nextInt();

        if (yourSales >= TARGET) {
            performance = "Удовлетворительно";
            bonus = 100 + 0.01 * (yourSales - TARGET);
            System.out.println("Ваш показатель = " + performance + ", а Ваш бонус составляет = " + bonus);
        } else {
            performance = "Неудовлетворительно";
            bonus = 0;
            System.out.println("Ваш показатель = " + performance + ", а Ваш бонус составляет = " + bonus);
        }
    }
}