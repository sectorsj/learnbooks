package ru.sectorsj._424_pair3;

public class PairTest3 {
    public static void main(String[] args) {
        var ceo = new Manager("Гус Гридди", 800000, 2003, 12, 15);
        var cfo = new Manager("Сид Снэки", 600000, 2003, 12, 15);
        var buddies = new Pair<Manager>(ceo, cfo);
        printBuddies(buddies);

        ceo.setBonus(1000000);
        cfo.setBonus(500000);

        Manager[] managers = {ceo, cfo};
        var result = new Pair<Employee>();

        minmaxBonus(managers, result);
        System.out.println("первый: " + result.getFirst().getName() + ", второй: " + result.getSecond().getName());

        maxminBonus(managers, result);
        System.out.println("первый: " + result.getFirst().getName() + ", второй: " + result.getSecond().getName());
    }

    private static void printBuddies(Pair<? extends Employee> p) {
        Employee first = p.getFirst();
        Employee second =p.getSecond();
        System.out.println(first.getName() + " и " + second.getName() + " - приятели.");
    }

    private static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
        if (a.length == 0) return;
        Manager min = a[0];
        Manager max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.getBonus() > a[i].getBonus()) min = a[i];
            if (max.getBonus() < a[i].getBonus()) max = a[i];
        }
        result.setFirst(min);
        result.setSecond(max);
    }

    private static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
        minmaxBonus(a, result);
        PairAlg.swapHelper(result);  // OK-- swapHelper фиксирует(captures) подстановочный тип
    }
    // нельзя написать public static <T super manager> ...
}
