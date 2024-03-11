package ru.sectorsj.book.grokking_algorithms.chapter1.resursion.example2;

import static ru.sectorsj.book.grokking_algorithms.chapter1.resursion.example2.SumFromRecursion.Sum.*;

public class SumFromRecursion {
    public static void main(String[] args) {
        int[] newArray = {1, 2, 3, 4, 5};
        System.out.println(sum(newArray));
    }

    public class Sum{
        public static int sum(int[] arr){
            int total = 0;
            for (int i : arr) {
                total += i;
            }
            return total;
        }
    }
}
