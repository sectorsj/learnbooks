package ru.sectorsj.orailly.learnjava._565_jukebox1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Jukebox1 {
     ArrayList<String> songList = new ArrayList<>();
    String path = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\learnJava\\src\\main\\resources\\_561_jukebox1\\";
    String fileName = "SongList.txt";

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    private void getSongs() {
        try {
            File file = new File(path + fileName);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                addSong(line);
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    }
}