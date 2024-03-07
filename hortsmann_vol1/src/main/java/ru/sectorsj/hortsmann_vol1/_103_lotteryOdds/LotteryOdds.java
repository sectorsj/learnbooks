package ru.sectorsj.hortsmann_vol1._103_lotteryOdds;

import java.util.Scanner;

class LotteryOdds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел Вам нужно угадать?");

        int k = in.nextInt();

        System.out.println("Какое из них самое большое число?");
        int n = in.nextInt();

        /*
         * Вычислить биномиальный коэффициент по формуле:
         * n*(n-l)*(n-2)* ... *(n-k+l)/(1*2*3* ... *k)
         */
        long lotteryOdds = 1;
        for (int i = 1; i < k; i++) {
            lotteryOdds  = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Ваш коэффициент выигрыша составляет 1 к " + lotteryOdds + ". Желаем удачи!");
    }
}