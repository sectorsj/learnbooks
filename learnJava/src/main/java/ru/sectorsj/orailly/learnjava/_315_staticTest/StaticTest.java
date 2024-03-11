package ru.sectorsj.orailly.learnjava._315_staticTest;

public class StaticTest {

    public static void main(String[] args) {
        Foo1 foo1 = new Foo1();
        Foo4 foo4 = new Foo4();
        Foo5 foo5 = new Foo5();

        foo1.go();
        foo4.go();
        foo5.go(10);
    }
}