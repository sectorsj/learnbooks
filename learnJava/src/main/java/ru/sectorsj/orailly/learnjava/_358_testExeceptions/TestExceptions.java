package ru.sectorsj.orailly.learnjava._358_testExeceptions;

public class TestExceptions {

    public static void main(String[] args) {
        String test = "да";
        // String test = "нет";

        try {
            System.out.println("Начало try");
            doRisky(test);
            System.out.println("Конец try");
        } catch (ScaryException se) {
            System.out.println("Жуткое исключение");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Конец main");
    }

    private static void doRisky(String test) throws ScaryException {
        System.out.println("Начало опасного метода");
        if ("да".equals(test)){
            throw new ScaryException();
        }
        System.out.println("Конец опасного метода");
        return;
    }
}