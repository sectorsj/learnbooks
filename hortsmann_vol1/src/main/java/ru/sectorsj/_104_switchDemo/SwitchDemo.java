package ru.sectorsj._104_switchDemo;

import java.util.Scanner;

class SwitchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите опцию (1, 2, 3, 4): ");
        int choise = in.nextInt();

        switch (choise) {
            case 1 -> System.out.println("Вы выбрали 1-ю опцию");
            case 2 -> System.out.println("Вы выбрали 2-ю опцию");
            case 3 -> System.out.println("Вы выбрали 3-ю опцию");
            case 4 -> System.out.println("Вы выбрали 4-ю опцию");
            default -> System.out.println("Неверный ввод");
        }
    }
}