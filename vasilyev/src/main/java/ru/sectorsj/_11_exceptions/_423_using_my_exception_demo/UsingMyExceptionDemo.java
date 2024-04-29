package ru.sectorsj._11_exceptions._423_using_my_exception_demo;

class UsingMyExceptionDemo {

    static void alpha(int n) throws MyException {
        throw new MyException(n);
    }

    static void bravo(int n) {
        throw new MyMistake(n);
    }

    public static void main(String[] args) {
        try {
            try {
                alpha(123);
            }
            catch (MyException e) {
                System.out.println(e);
                bravo(321);
            }
        }
        catch (MyMistake e) {
            System.out.println(e);
        }
    }
}
