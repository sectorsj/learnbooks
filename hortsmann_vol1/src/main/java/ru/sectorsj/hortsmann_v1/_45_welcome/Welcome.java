package ru.sectorsj.hortsmann_v1._45_welcome;

class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Java Core!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
