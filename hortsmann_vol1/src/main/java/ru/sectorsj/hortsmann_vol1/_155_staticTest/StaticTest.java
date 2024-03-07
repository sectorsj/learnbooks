package ru.sectorsj.hortsmann_vol1._155_staticTest;

import static ru.sectorsj.hortsmann_vol1._155_staticTest.Employee.tripleSalary;

public class StaticTest {

    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Rick", 60000);
        staff[2] = new Employee("Harry", 65000);

        for (Employee emp : staff) {
            emp.raiseSalary(5);
        }

        for (Employee emp : staff) {
            emp.setId();
            System.out.println("name: " + emp.getName() + ", id: " + emp.getId() + ", salary: " + emp.getSalary());
            int n = Employee.getNextId();
            System.out.println("Следующий доступный id = " + n);
        }

        Employee henry = new Employee("Henry", 100000);
        tripleSalary(henry);
        System.out.println("name: " + henry.getName() + ", id: " + henry.getId() + ", salary: " + henry.getSalary());
    }
}


class Employee {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
    }

    public static void main(String[] args) {
        var e = new Employee("Richard", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}