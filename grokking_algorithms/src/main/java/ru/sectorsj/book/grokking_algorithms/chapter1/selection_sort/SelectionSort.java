package ru.sectorsj.book.grokking_algorithms.chapter1.selection_sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] myArray = {5, 3, 6, 2, 10};
        System.out.println(Arrays.toString(selectionSort(myArray)));
    }

    private static int[] selectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if(array[i] < array[minInd]){
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        return array;
    }

    private static void swap(int[] arr, int ind1, int ind2) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
}
