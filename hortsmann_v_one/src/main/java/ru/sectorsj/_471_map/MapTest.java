package ru.sectorsj._471_map;

import java.util.HashMap;

/**
    В этой программе демонстрируется применение отображения
    с ключами типа String и значениями типа Employee
 */
public class MapTest {
    public static void main(String[] args) {
        var staff = new HashMap<String, Employee>();
        staff.put("144-25-5464", new Employee("Эмми Ли"));
        staff.put("567-24-2546", new Employee("Гарри Хакер"));
        staff.put("157-62-7935", new Employee("Гэри Купер"));
        staff.put("456-62-5527", new Employee("Франческа Круз"));

        // вывести все элементы из отображения
        System.out.println(staff);

        // удалить элемент из отображения
        staff.remove("567-24-2546");

        // заменить элемент в отображении
        staff.put("456-62-5527", new Employee("Франческа Миллер"));

        // найти значение в отображении
        System.out.println(staff.get("157-62-7935"));

        //перебрать все элементы в отображении
        staff.forEach((k, v) ->
                System.out.println("key = " + k + ", value = " + v));
    }
}
