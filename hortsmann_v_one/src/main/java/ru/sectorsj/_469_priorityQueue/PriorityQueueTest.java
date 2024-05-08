package ru.sectorsj._469_priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 Очередь по приоритету
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        // *pq - priority queue
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906, 12, 9));  // Г. Хоппер
        pq.add(LocalDate.of(1815, 12, 10)); // Э. Лоуренс
        pq.add(LocalDate.of(1903, 12, 3));  // Дж. фон Ньюманн
        pq.add(LocalDate.of(1910, 6, 22));  // К. Зюс

        System.out.println("Перебор всех элементов ...");
        for (LocalDate date : pq) {
            System.out.println(date);
        }
        System.out.println("Удаление элементов ...");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
