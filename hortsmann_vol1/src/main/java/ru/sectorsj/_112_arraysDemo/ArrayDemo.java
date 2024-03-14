package ru.sectorsj._112_arraysDemo;

import java.util.Arrays;

class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[100];
        var b = new int[100];

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};

        String[] authors = {
                "James Gosling",
                "Bill Joy",
                "Guy Steele",
        };

        int[] anonimous =  {16, 19, 23, 29, 31, 37};
        smallPrimes = anonimous;

        int[] c = new int[100];
        for (int i = 0; i < 100; i++) {
            c[i] = i;
        }

        String[] names = new String[10];
        for (int i = 0; i < 10; i++) {
            names[i] = "";
        }


        int[] luckyNumbers = {2, 2, 4, 5, 6};
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
        System.out.println(Arrays.toString(luckyNumbers));
    }
}