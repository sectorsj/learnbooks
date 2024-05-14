package ru.sectorsj._493_shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Демонстрация алгоритма
 произвольной перетасовки и сортировки
 */
public class ShuffleTest {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
