package ru.sectorsj._295_clone;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee implements Cloneable {
    private final String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee clone() throws CloneNotSupportedException {

        // вызываем метод Object.clone()
        Employee cloned = (Employee) super.clone();

        // клонируем изменяемы поля
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    /**
     Устанавливаем дату приема на работу
     * @param year Год приема на работу
     * @param month Месяц приема на работу
     * @param day День приема на работу
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        //Пример изменения поля экземпляра
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 10;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee[ name: " + name + ", salary: " + salary + ", hireDay: " + hireDay + " ]";
    }
}
