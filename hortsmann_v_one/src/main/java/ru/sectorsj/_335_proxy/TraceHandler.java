package ru.sectorsj._335_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
    Обработчик вызовов, выводящий сначала имя метода и его параметры,
    а затем вызывающий исходный метод
 */
public class TraceHandler implements InvocationHandler {
    private Object target;

    /**
        Конструктор типа TraceHandler
     * @param t Неявный параметр вызова метода
     */
    public TraceHandler(Object t) {
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
        // выводим неявный аргумент
        System.out.print(target);
        // выводим имя метода
        System.out.print("." + m.getName() + " (");

        // выводим явные аргументы
        if (args != null){
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1){
                    System.out.println(", ");
                }
            }
        }
        System.out.println(") ");

        // вызвать конкретный метод
        return m.invoke(target, args);
    }
}
