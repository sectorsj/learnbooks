package ru.sectorsj.hortsmann_vol1._161_paramTest;


public class ParamTest {

    public static void main(String[] args) {

        //Тест 1: методы не могут видоизменять числовые параметры
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);

        // Тест 2: методы могут изменять состояние объектов, передаваемых в качестве параметров
        System.out.println("\nTesting tripleSalary:");
        var harry = new Employee("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary = " + harry.getSalary());

        // Тест 3: методы не могут присоединять новые *объекты к объектным параметрам
        System.out.println("\nTesting swap:");
        var a = new Employee("Alice", 70000);
        var b = new Employee("Bob", 60000);
        System.out.println("Before: а = "+ a.getName());
        System.out.println("Before: b = "+ b.getName());
        swap(a, b);
        System.out.println("After: а = "+ a.getName());
        System.out.println("After: b = "+ b.getName());
    }


    private static void tripleValue(double x) {     // не сработает!
        x = 3 * x;
        System.out.println("End of method: х= " + x);
    }

    private static void tripleSalary(Employee x) {    // сработает!
        x.raiseSalary(200);
        System.out.println("End of method: salary = " + x.getSalary());
    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x = " + x.getName());
        System.out.println("End of method: y = " + y.getName());
    }
}
class Employee {    // Упрощенный класс

    public static int nextId = 1;
    private String name;
    private double salary;

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    /**
        Увеличивает зарплату работников
        @param byPercent содержит величину в процентах,
                          на которую повышается зарплата
                          (например, 10 = 10%).
        @return raise (величина), на которую повышается зарплата

        @author C.Hotrsmann
        @see <a href= "https://horstmann.com/corejava/index.html">Wеb-страница книги Core Java</a>
     */
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}