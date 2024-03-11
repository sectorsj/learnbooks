package ru.sectorsj.orailly.learnjava._118_xCopy;

public class XCopy {
    public static void main(String[] args) {
        int original = 42;
        XCopy copy = new XCopy();
        int y = copy.go(original);
        System.out.println(original + "." + y);
    }

    int go (int arg) {
        arg = arg * 2;
        return arg;
    }
}
