package ru.sectorsj.orailly.learnjava._482_classFileDemo;

import java.io.File;

public class ClassFileDemo {
    public static void main(String[] args) {
        ClassFileDemo gui = new ClassFileDemo();
        gui.go();
    }

    private void go() {
        File f = new File("MyCode.txt");
        File dir = new File("Chapter14");
        dir.mkdir();
        if (dir.isDirectory()){
            String[] dirComponents = dir.list();
            for (int i = 0; i < dirComponents.length; i++) {
                System.out.println(dirComponents[i]);
            }
        }
        System.out.println(dir.getAbsolutePath());
        boolean isDeleted = f.delete();
    }
}
