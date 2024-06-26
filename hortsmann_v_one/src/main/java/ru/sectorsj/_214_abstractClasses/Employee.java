package ru.sectorsj._214_abstractClasses;

import java.time.LocalDate;

class Employee extends Person {
    private double salary;
    private final LocalDate hireDay;


    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay =LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("работник с зарплатой в $%.2f", salary);
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
