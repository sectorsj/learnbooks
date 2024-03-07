package ru.sectorsj.hortsmann_vol1._100_retirement2;

import java.util.Scanner;

class Retirement2 {
    public static void main(String[] args) {

        Balance myBalance = new Balance();
        System.out.println("На Вашем счету: " + myBalance.getCount() + " рублей.");

        Scanner in = new Scanner(System.in);
        System.out.println("Сколько денег Вы зарабатываете каждый год?");
        double totalPayment = in.nextDouble();

        System.out.println("Какой % Вы готовы откладывать? ");
        double interestRate = in.nextDouble();

        double balance = myBalance.getCount();
        int year = 0;

        String input;
        double moneybox;

        do {
            if (year == 0) {
                balance += totalPayment;
            }
            double interest = balance * interestRate / 100;
            balance += interest;
            moneybox = balance - totalPayment;
            year++;
            System.out.printf("После %d года(лет), в Вашей копилке будет: %,.2f рублей.%n", year, moneybox);
            System.out.print("Вы готовы уйти на пенсию? (Y/N) ");

            input = in.next();
        }
        while (input.equals("N"));
        System.out.printf("В Вашей копилке: %,.2f рублей.%n", moneybox);
        System.out.println("Поздравляем с выходом на пенсию!");
    }
}