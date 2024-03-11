package ru.sectorsj.orailly.learnjava._340_staticSuper;

public class StaticSuper {
    static {
        System.out.println("Родительский статический блок");
    }

    StaticSuper(){
        System.out.println("Родительский конструктор");
    }
}
