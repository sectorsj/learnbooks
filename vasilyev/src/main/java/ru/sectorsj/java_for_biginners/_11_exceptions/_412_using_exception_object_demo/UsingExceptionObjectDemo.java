package ru.sectorsj.java_for_biginners._11_exceptions._412_using_exception_object_demo;

public class UsingExceptionObjectDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Отрицательный размер");
            int[] a = new int[-1];
        }
        catch (NegativeArraySizeException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Неверный индекс");
            int[] b = {1};
            b[-1]=0;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Деление на ноль");
            int c = 10/0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
