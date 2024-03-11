package ru.sectorsj.orailly.learnjava._638_foo;

public class Foo {
    public static void main(String[] args) {
        Foo f = new Foo();
        f.go();
    }
    private void go() {
        Bar b = new Bar();
        b.doStuff();
    }
}