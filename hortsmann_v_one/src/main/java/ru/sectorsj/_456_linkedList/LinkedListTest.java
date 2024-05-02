package ru.sectorsj._456_linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // объединить слова из связных списков b и a
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()) {
            if (aIter.hasNext()) {
                aIter.next();
            }
            aIter.add(bIter.next());
        }
        System.out.println(a);

        // удалить каждое второе слово из связного списка b
        bIter = b.iterator();
        while (bIter.hasNext()) {
            bIter.next();           // пропустить один элемент
            if (bIter.hasNext()) {
                bIter.next();       // пропустить следующий элемент
                bIter.remove();     // удалить данный элемент
            }
        }

        System.out.println(b);

        // групповая операция удаления из связного списка "a"
        // всех слов, составляющих связный список "b"
        a.removeAll(b);

        System.out.println(a);
    }
}
