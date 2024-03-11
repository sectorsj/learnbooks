package ru.sectorsj.orailly.learnjava._278_testDuck;

public class TestDuck {
    public static void main(String[] args) {
        int weight = 8;
        float density = 2.3F;
        String name = "Дональд";
        long[] feathers = {1, 2, 3, 4, 5, 6 };
        boolean canFly = true;
        int airspeed = 22;
        Duck[] d = new Duck[8];

        d[0] = new Duck();
        d[1] = new Duck(density, weight);
        d[2] = new Duck(name, feathers);
        d[3] = new Duck(canFly);
        d[4] = new Duck(3.3F, airspeed);
        d[5] = new Duck(false);
        d[6] = new Duck(airspeed, density);
        d[7] = new Duck(10, 2.3F, "Херши", feathers, false, 10);
    }
}