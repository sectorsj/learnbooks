package ru.sectorsj._11_exceptions._406_nested_try_catch_demo;

import java.util.*;

public class NestedTryCatchDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] symbs;
        int size, index;

        try {
            System.out.println("Укажите размер массива: ");
            size = input.nextInt();
            symbs = new char[size];
            System.out.print("| ");
            for (int k = 0; k < size; k++) {
                symbs[k] = (char) ('A' + k);
                System.out.print(symbs[k] + " | ");
            }

            try {
                System.out.print("\nУкажите индекс: ");
                index = input.nextInt();
                System.out.println("Символ - " + symbs[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Такого элемента нет");
            } finally {
                System.out.println("Массив создан успешно");
            }
            System.out.println("Для индекса указано числовое значение");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: вы не ввели число");
        } catch (NegativeArraySizeException e) {
            System.out.println("Неверный размер массива");
        }

        System.out.println("Выполнение программы успешно завершено");
    }
}
