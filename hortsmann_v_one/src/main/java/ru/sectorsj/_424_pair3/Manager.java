package ru.sectorsj._424_pair3;

public class Manager extends Employee {
    private double bonus;

    /**
     * @param name      имя работника
     * @param salary    зарплата
     * @param year      год приема на работу
     * @param month     месяц приема на работу
     * @param day       день приема на работу
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public double getBonus() {
        return bonus;
    }
}
