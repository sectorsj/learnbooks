package ru.sectorsj.orailly.learnjava._164_arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> myArraylist = new ArrayList<>();

        String first = new String("Ура");
        myArraylist.add(first);

        String second = new String("Лягушка");
        myArraylist.add(second);

        int theSize = myArraylist.size();

        Object obj = myArraylist.get(1);

       // myArraylist.remove(1);

        boolean isIn = myArraylist.contains(second);

        for (String list: myArraylist) {
            System.out.println(list);
        }
    }
}
