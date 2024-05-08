package ru.sectorsj._471_map;

class Employee {
    private String name;
    private double salary;

    /**
     Создаем нового сотрудника с зарплатой 0
     * @param name Имя сотрудника
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public String toString() {
        return "[name = " + name +  ", salary = " + salary + "]";
    }
}
