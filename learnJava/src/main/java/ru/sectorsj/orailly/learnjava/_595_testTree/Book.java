package ru.sectorsj.orailly.learnjava._595_testTree;

class Book {
    String title;

    public Book(String t) {
        title = t;
    }
}

// 1й вариант для использования TreeSet
// class Book implements Comparable {
//     String title;
//
//     public Book(String t) {
//         title = t;
//     }
//
//     @Override
//     public int compareTo(Object b) {
//         Book book = (Book) b;
//         return (title.compareTo(book.title));
//     }
// }