package ru.sectorsj.hortsmann_v1._116_cruelWorld;

class Message {
    public static void main(String[] args) {
        if (args[0].equals("-h"))
            System.out.print("Hello, ");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye, ");

        for (int i = 1; i < args.length; i++)
            System.out.print("" + args[i]);
            System.out.println("!");
    }
}