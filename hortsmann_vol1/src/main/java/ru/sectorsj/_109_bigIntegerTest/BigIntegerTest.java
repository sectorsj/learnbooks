package ru.sectorsj._109_bigIntegerTest;

import java.math.BigInteger;
import java.util.Scanner;

class BigIntegerTest {
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
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for (int i = 1; i < k; i++) {
            lotteryOdds  = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1))
                    .divide(BigInteger.valueOf(i));
        }
        System.out.println("Ваш коэффициент выигрыша составляет 1 к " + lotteryOdds + ". Желаем удачи!");
    }
}