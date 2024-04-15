package ru.sectorsj.javaguade._2_overview_66_78._66_example;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Example {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println("Java");
        System.setOut(new PrintStream(System.out, true, "cp866"));
    }
}