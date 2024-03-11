package ru.sectorsj.orailly.learnjava._118_clock;

public class ClockTestDrive {

    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setTime("12:45");

        String tod = clock.getTime();
        System.out.println("время: " + tod);
    }
}
