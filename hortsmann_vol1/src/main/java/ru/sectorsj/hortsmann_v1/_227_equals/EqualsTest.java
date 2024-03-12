package ru.sectorsj.hortsmann_v1._227_equals;

import java.util.ArrayList;

public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;

        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice2));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        System.out.println("bob.toString(): " + bob.toString());

        Manager carl = new Manager("Carl Cracker", 80000, 1987,12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString(): "+ boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss) );
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());

        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());


        ArrayList<Employee> staff = new ArrayList<>(100);
        var staff2 = new ArrayList<Employee>();

        staff.add(new Employee("Harry Hacker", 50000, 1988, 7, 3));
        staff.add(new Employee("Tony Tester", 45000, 1993, 2, 25));
        staff.add(carl);
        staff.add(boss);

        staff.ensureCapacity(100);
        System.out.println(staff.size());

        Employee e = staff.get(3);
        System.out.println(e);
    }
}
