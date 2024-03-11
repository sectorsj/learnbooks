package ru.sectorsj.orailly.learnjava._484_readAFileDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadAFile {
    String directory = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\learnJava\\src\\main\\resources\\_484_readAFile";
    String filename = "MyText.txt";

    public static void main(String[] args) {
        ReadAFile app = new ReadAFile();
        app.setUp();
    }

    private void setUp() {
        try {
            File myFile = new File(directory, filename);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = null;

            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}