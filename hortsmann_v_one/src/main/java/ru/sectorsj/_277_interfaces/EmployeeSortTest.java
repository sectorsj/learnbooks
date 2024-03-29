package ru.sectorsj._277_interfaces;

import java.util.Arrays;

/**
 Демонстрация применения интерфейса Comparable
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Гарри Хакер", 35000);
        staff[1] = new Employee("Карл Крякер", 75000);
        staff[2] = new Employee("Тони Тестер", 38000);

        Arrays.sort(staff);

        // выводим данные обо всех объектах типа Employee
        for (Employee e : staff) {
            System.out.printf("name=" + e.getName() + ", salary=" + e.getSalary() + " ");
        }
    }
}
