package ru.sectorsj._268_methods;

import java.lang.reflect.Method;
/**
    Рефлексия для вызова методов
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception {
        // получить указатели на методы square() и sqrt()
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = MethodTableTest.class.getMethod("sqrt", double.class);

        // вывести значения х и у в табличном виде
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     Возвращает квадрат числа
     * @param x Число
     * @return Квадрат числа
     */
    public static double square(double x){
        return x * x;
    }

    public static double sqrt(double x){
        return x * x;
    }

    /**
     Выводит в табличном виде значения х и у указанного метода
     * @param from  Нижняя граница значений х
     * @param to    Верхняя граница значений х
     * @param n     Количество строк в таблице
     * @param f     Метод, получающий и возвращающий значение типа double
     */
    private static void printTable(double from, double to, int n, Method f) {
        // вывести сигнатуру метода в заголовке таблицы
        System.out.println(f);
        double dx = (to - from) / (n - 1);
        for (double x = from; x <= to; x +=dx){
            try {
                double y = (double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
