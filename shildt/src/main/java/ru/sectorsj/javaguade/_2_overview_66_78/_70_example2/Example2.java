package ru.sectorsj.book.shild.javaguade._2_overview_66_78._70_xample2;

import java.io.UnsupportedEncodingException;


public class Example2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // объявляется переменная "num"
        int num;

        // переменной "num" присваивается значение = 100
        num = 100;

        System.out.println("Это переменная num: " + num);

        num = num * 2;

        System.out.print("Значение переменной num * 2 = ");
        System.out.println(num);


        if(num < 100) {
            System.out.println("num меньше 100");
        }
        else
            System.out.println("num больше 100");
    }
}
