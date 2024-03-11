package ru.sectorsj.orailly.learnjava._595_testTree;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    private void go() {
        // 1 часть 2го варианта использования TreeSet
        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<>(bCompare);
        tree.add(new Book("Как устроены кошки"));
        tree.add(new Book("Постройте заново свое тело"));
        tree.add(new Book("В поисках Эмо"));
        System.out.println(tree);
    }
}