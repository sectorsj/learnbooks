package ru.sectorsj.java_for_biginners._2_base_types_and_operators._65_input_variables_console_demo;

import java.util.Scanner;

public class InputVariablesConsoleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentYear = 2021;
        String userName;
        int userAge;
        double height;
        double mass;
        System.out.println("Ваше имя: ");
        userName = scanner.nextLine();

        System.out.println("Ваш возраст: ");
        userAge = scanner.nextInt();

        System.out.println("Ваш рост(в метрах): ");
        height = scanner.nextDouble();

        System.out.println("Масса тела (в килограммах): ");
        mass = scanner.nextDouble();

        double bmi = mass/height/height;

        System.out.println("Здравствуйте, " + userName + "!");
        System.out.println("Вы родились " + (currentYear - userAge) + " году.");
        System.out.printf("Ваш индекс массы тела: %5.2f\n", bmi);


    }
}
