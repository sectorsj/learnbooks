package ru.sectorsj._95_ifDemo;

import java.util.Scanner;

class IfDemo {
    public static final int TARGET = 50;

    public static void main(String[] args) {
        int yourSales;
        String performance;
        int bonus;
        Scanner in = new Scanner(System.in);

        System.out.println("Какие у Вас продажи?");
        yourSales = in.nextInt();

        if (yourSales >= TARGET ){
            performance = "Удовлетворительно";
            bonus = 100;
            System.out.println("Ваш показатель = " + performance + ", а Ваш бонус составляет = " + bonus);
        }
    }
}