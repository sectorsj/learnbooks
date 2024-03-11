package ru.sectorsj.orailly.learnjava._597_testMap;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scope = new HashMap<String, Integer>();
        scope.put("Кэти", 42);
        scope.put("Бэрт", 343);
        scope.put("Скайвокер", 420);

        System.out.println(scope);
        System.out.println(scope.get("Скайвокер"));
    }
}
