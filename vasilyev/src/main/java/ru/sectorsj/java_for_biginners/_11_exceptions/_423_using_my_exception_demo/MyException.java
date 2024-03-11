package ru.sectorsj.java_for_biginners._11_exceptions._423_using_my_exception_demo;

class MyException extends Exception {
    private  int code;

    MyException(int n) {
        super();
        code = n;
    }

    @Override
    public String toString() {
        String txt = "Исключение класса MyException\n";
        txt += "Код ошибки: " + code + "\n";
        txt += "--------------";
        return txt;
    }
}
