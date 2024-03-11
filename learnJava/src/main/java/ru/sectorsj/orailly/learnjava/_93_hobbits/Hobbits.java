package ru.sectorsj.orailly.learnjava._93_hobbits;

public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] hobbit = new Hobbits[3];

        int z = -1;
        while (z < 2) {
            z = z + 1;
            hobbit[z] = new Hobbits();
            hobbit[z].name = "Бильбо";

            if (z == 1) {
                hobbit[z].name = "Фродо";
            }

            if (z == 2) {
                hobbit[z].name = "Сэм";
            }

            System.out.print(hobbit[z].name + " - ");
            System.out.println("имя хорошего хоббита ");
        }
    }
}