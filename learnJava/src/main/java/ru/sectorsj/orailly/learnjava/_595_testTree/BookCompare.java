package ru.sectorsj.orailly.learnjava._595_testTree;

import java.util.Comparator;

// 2 часть 2го варианта использования TreeSet
public class BookCompare implements Comparator<Book> {
    @Override
    public int compare(Book one, Book two) {
        return (one.title.compareTo(two.title));
    }
}