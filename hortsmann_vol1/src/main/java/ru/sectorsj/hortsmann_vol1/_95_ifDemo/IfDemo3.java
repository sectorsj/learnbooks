package ru.sectorsj.hortsmann_vol1._95_ifDemo;

import java.util.Scanner;

class IfDemo3 {
    public static final int TARGET = 50;
    public static void main(String[] args) {
        int yourSales;
        String performance;
        int bonus;

        Scanner in = new Scanner(System.in);

        System.out.println("Какие у Вас продажи?");
        yourSales = in.nextInt();

        if (yourSales >= 2 * TARGET) {
            performance = "Великолепно";
            bonus = 1000;
            System.out.println("Ваш показатель = " + performance + ", а Ваш бонус составляет = " + bonus);
        } else if (yourSales >= TARGET){
            performance = "Хорошо";
            bonus = 100;
            System.out.println("Ваш показатель = " + performance + ", а Ваш бонус составляет = " + bonus);
        } else {
            System.out.println("Вы уволены!!");
        }
    }
}