package ru.sectorsj.java_for_biginners._11_exceptions._423_using_my_exception_demo;

class MyMistake extends RuntimeException{
    private int code;

    MyMistake(int n) {
        super();
        code = n;
    }

    @Override
    public String toString() {
        String txt = "Исключение класса MyMistake\n";
        txt += "Код ошибки: " + code + "\n";
        txt += "***************-";
        return txt;
    }
}
