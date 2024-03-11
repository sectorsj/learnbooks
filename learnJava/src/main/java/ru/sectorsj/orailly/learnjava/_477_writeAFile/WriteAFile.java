package ru.sectorsj.orailly.learnjava._477_writeAFile;

import java.io.FileWriter;

public class WriteAFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Foo.txt");
            writer.write("Привет, Фу!");
            writer.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
