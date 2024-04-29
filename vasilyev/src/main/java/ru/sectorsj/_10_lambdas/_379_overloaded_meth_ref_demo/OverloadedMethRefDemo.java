package ru.sectorsj._10_lambdas._379_overloaded_meth_ref_demo;

class OverloadedMethRefDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        Alpha A = obj::set;
        Bravo B = obj::set;

        B.one(100);
        System.out.println("Значение поля: " + obj.number);

        A.none();
        System.out.println("Значение поля: " + obj.number);
    }
}
