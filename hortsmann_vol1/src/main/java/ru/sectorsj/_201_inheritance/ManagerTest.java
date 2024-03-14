package ru.sectorsj._201_inheritance;

public class ManagerTest {
    public static void main(String[] args) {
        // Строим объект типа Manager
        Manager boss = new Manager("Bob Boswell", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        // Заполняем массив staff-объектами
        // типа Manager или Employee
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // Выводим данные обо всех объектах типа Employee
        for (Employee e : staff) {
            System.out.println("name: " + e.getName() + ", salary: " + e.getSalary());
        }
    }
}