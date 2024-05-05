package ru.sectorsj._461_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class SetTest {
    public static void main(String[] args) {
        var words = new HashSet<String>();
        long totalTime = 0;
        int counter = 20;
        int totalWords = 0;

        try (var in = new Scanner(System.in)) {
            System.out.print("Введите текст: ");
            while (in.hasNext()) {
                String word = in.next();
                if (word.equals("exit")) {
                    break; // завершить цикл, если введено "exit"
                }
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
                totalWords++;
            }
        }
        Iterator<String> iter = words.iterator();
        System.out.println("\nанализ...\n");
        System.out.println("Список первых " + counter + " уникальных слов:");
        for (int i = 1; i <= counter && iter.hasNext(); i++) {
            System.out.println(iter.next());
        }
        System.out.println("\nанализ завершен\n");
        System.out.println("Всего слов в тексте: " + totalWords);
        System.out.println("Уникальных слов: " + words.size());
        System.out.println("Время затраченное на анализ текста: " + totalTime + " миллисекунд.");
    }
}