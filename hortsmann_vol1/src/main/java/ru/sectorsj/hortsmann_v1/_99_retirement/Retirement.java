package ru.sectorsj.hortsmann_v1._99_retirement;

import java.util.Scanner;

class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько денег Вам нужно что уйти на пенсию?");
        double goal = in.nextDouble();

        System.out.println("Сколько денег Вы зарабатываете каждый год?");
        double payment = in.nextDouble();

        System.out.println("На какой % Вы ориентируетесь? ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal){
            balance += payment;
            double interest = balance + interestRate / 100;
            balance += interest;
            years++;
        }
        System.out.println("Вы можете уйти на пенсию через " + years + " лет.");
    }
}