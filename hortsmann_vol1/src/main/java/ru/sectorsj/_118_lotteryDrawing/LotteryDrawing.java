package ru.sectorsj._118_lotteryDrawing;

import java.util.Arrays;
import java.util.Scanner;

class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел Вам нужно угадать?");

        int k = in.nextInt();

        System.out.println("Какое из них самое большое число?");
        int n = in.nextInt();

        // Заполнить 1-й массив числами 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // выбрать k номеров и ввести из во 2-й массив
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            // Получить случайный индекс в пределах 0 до n - 1
            int r = (int) (Math.random() * n);

            // Выбрать элемент из произвольного места
            result[i] = numbers[r];

            // Переместить последний элемент в произвольное место
            numbers[r] = numbers[n - 1];
            n--;
        }
        // Вывести отсортированный массив
        Arrays.sort(result);
        System.out.println("Ставьте следующую комбинацию. Это сделает вас богатым!");
        for (int r : result) {
            System.out.println(r);
        }

        //// Вычислить биномиальный коэффициент по формуле:
        //// n*(n-l)*(n-2)* ... *(n-k+l)/(1*2*3* ... *k)

        // long lotteryOdds = 1;
        // for (int i = 1; i < k; i++) {
        //     lotteryOdds  = lotteryOdds * (n - i + 1) / i;
        // }
        // System.out.println("Ваш коэффициент выигрыша составляет 1 к " + lotteryOdds + ". Желаем удачи!");
    }
}