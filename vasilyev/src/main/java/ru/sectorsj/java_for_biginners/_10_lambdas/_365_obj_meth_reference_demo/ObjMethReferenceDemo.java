package ru.sectorsj.java_for_biginners._10_lambdas._365_obj_meth_reference_demo;

public class ObjMethReferenceDemo {

    public static void main(String[] args) {
        MyClass obj = new MyClass(100);
        System.out.println("Создан объект с полем 100");

        MyGetter G = obj::get;
        MySetter S = obj::set;

        System.out.println("Переменная G: " + G.myget());
        System.out.println("Переменная obj: " + obj.get());

        obj.set(200);
        System.out.println("Полю присвоено значение 200");
        System.out.println("Переменная G: " + G.myget());

        S.myset(300);
        System.out.println("Выполнена команда S.myset(300)");
        System.out.println("Переменная G: " + G.myget());
        System.out.println("Переменная obj: " + obj.get());

        obj = new MyClass(400);
        System.out.println("Создан объект с полем 400");
        System.out.println("Переменная G: " + G.myget());
        System.out.println("Переменная obj: " + obj.get());

        S.myset(500);
        System.out.println("Выполнена команда S.myset(500)");
        System.out.println("Переменная G: " + G.myget());
        System.out.println("Переменная obj: " + obj.get());
    }
}
