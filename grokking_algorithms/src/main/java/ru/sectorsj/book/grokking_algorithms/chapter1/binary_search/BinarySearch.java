package ru.sectorsj.book.grokking_algorithms.chapter1.binary_search;

import java.lang.constant.Constable;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arrayList = {1, 2, 4, 6, 87, 7};
        int item = 44;
        Object result = binarySearch(arrayList, item);
        System.out.println(result);
    }

    private static Constable binarySearch(int[] list, int item){
        int low = 0;
        int high = (list.length) - 1;

        while (low <= high){
            int mid = (low + high);
            int guess = list[mid];
            if (guess == item){
                return mid;
            }
            else if (guess > item){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return null;
    }
}
