package ru.sectorsj.hortsmann_v1._85_inputTest;

import java.util.Scanner;

class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Как твое имя? ");
        String name = in.nextLine();

        System.out.println("Сколько тебе лет? ");
        int age = in.nextInt();

        System.out.println("Привет, " + name + ". В следующем году тебе будет " + (age + 1) + " лет.");
    }
}