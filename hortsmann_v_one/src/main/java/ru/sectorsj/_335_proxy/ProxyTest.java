package ru.sectorsj._335_proxy;

import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

public class ProxyTest {
    public static void main(String[] args) {
        var elements = new Object[1000];

        // заполняем массив "elements" прокси-объектами
        // целых чисел от 0 до 1000
        for (int i = 0; i < elements.length; i++) {
            Integer value = i + 1;
            var handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(),
                    new Class[]{Comparable.class},
                    handler
            );
            elements[i] = proxy;
        }

        // формируем случайное целое число
        Integer key = new Random().nextInt(elements.length) + 1;

        // выполняем поиск по критерию "key"
        int result = Arrays.binarySearch(elements, key);

        // выводим совпадающий элемент, если таковой найден
        if (result >= 0) {
            System.out.println(elements[result]);
        }
    }
}
