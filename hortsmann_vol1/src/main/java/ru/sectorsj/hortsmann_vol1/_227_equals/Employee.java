package ru.sectorsj.hortsmann_vol1._227_equals;

import java.time.LocalDate;
import java.util.Objects;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        // быстро проверить объекты на идентичность
        if (this == otherObject) return true;

        // если явный параметр имеет пустое значение null,
        // должно быть возвращено логическое значение false
        if (otherObject == null) return false;

        // если классы не совпадают, они не равны
        if (getClass() != otherObject.getClass()) return false;

        // теперь известно, что otherObject - это
        // непустой объект типа Employee
        var other = (Employee) otherObject;

        // проверить, содержат ли поля одинаковые значения
        return Objects.equals(name, other.name)
                && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "[name=" + name +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                "]";
    }
}
