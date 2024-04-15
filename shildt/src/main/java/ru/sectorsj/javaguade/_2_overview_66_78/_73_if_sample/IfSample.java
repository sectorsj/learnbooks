package ru.sectorsj.javaguade._2_overview_66_78._73_if_sample;


public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y){
            System.out.println("x меньше y");
        }

        x = x * 2;
        if (x == y) {
            System.out.println("x теперь равен y");
        }
        x = x * 2;
        if(x > y) {
            System.out.println("x теперь больше y");
        }
        // Этот оператор не будет ничего выводить
        if (x  == y) {
            System.out.println("вы не увидите это");
        }
    }
}
