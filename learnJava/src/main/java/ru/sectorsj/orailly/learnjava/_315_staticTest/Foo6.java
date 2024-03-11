package ru.sectorsj.orailly.learnjava._315_staticTest;

public class Foo6{
    int x = 12;
    public static void go(){
        // ОШИБКА! Non-static field 'x' cannot be referenced from a static context
        // System.out.println(x);
    }
}