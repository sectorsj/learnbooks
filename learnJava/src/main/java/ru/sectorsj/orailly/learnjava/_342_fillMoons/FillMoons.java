package ru.sectorsj.orailly.learnjava._342_fillMoons;

import java.util.Calendar;

import static java.lang.String.*;
import static java.lang.System.*;
import static java.util.Calendar.*;

public class FillMoons {
    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        Calendar c = getInstance();
        c.set(2020, 0, 7, 15, 40);

        long day1 = c.getTimeInMillis();

        for (int x = 0; x < 60; x++) {
            day1 += (DAY_IM * 29.52);
            c.setTimeInMillis(day1);
            out.println(format("Полнолуние было в %tc", c));
        }
    }
}