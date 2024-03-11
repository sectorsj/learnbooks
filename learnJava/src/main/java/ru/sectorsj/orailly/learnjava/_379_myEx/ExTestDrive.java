package ru.sectorsj.orailly.learnjava._379_myEx;

public class ExTestDrive {
    public static void main(String[] args) {
        String test = args[0]; // да
        try {
            System.out.print("t"); // 1
            doRisky(test);
            System.out.print("o"); // 4.  если не через Exception
        } catch (MyEx e) {
        System.out.print("a"); // 3. если через Exception
        } finally {
            System.out.print("w"); // 4. если через Exception и 5. если не через Exception
        }
        System.out.println("s"); // 5. если через Exception, 6. если не через Exception
    }

    static void doRisky(String t) throws MyEx {
        System.out.print("h"); // 2
        if ("yes".equals(t)) {
            throw new MyEx();
        }
        System.out.print("r"); // 3. если нет Exception
        return;
    }
}
