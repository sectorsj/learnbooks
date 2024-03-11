package ru.sectorsj.orailly.learnjava._94_islands;

public class Islands {
    public static void main(String[] args) {

        int [] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String [] island = new String[4];
        island[0] = "Бермуды";
        island[1] = "Фиджи";
        island[2] = "Азорские острова";
        island[3] = "Косумель";

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            System.out.print("остров = ");
            System.out.println(island[ref]);
            y = y + 1;
        }
    }
}