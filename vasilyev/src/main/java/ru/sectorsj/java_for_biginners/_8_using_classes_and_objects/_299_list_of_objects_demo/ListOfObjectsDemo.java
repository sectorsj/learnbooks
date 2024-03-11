package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._299_list_of_objects_demo;

public class ListOfObjectsDemo {
    static MyClass createList(int n) {
        MyClass obj = new MyClass();
        obj.number = 1;
        MyClass t = obj;
        for (int i = 1; i <= n; i++) {
            t.next = new MyClass();
            t.next.number = t.number*(n-i+1)/i;
            t = t.next;
        }
        t.next = null;
        return  obj;
    }

    static void showList(MyClass obj) {
        String txt = "| ";
        MyClass t = obj;

        do {
            txt += t.number + " | ";
            t = t.next;
        } while (t != null);
        System.out.println(txt);
    }

    public static void main(String[] args) {
        MyClass A =  createList(5);
        MyClass B =  createList(10);

        showList(A);
        showList(B);
    }
}
