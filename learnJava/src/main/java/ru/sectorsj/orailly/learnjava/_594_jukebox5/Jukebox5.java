package ru.sectorsj.orailly.learnjava._594_jukebox5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Jukebox5 {
     ArrayList<Song> songList = new ArrayList<>();
    String path = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\learnJava\\src\\main\\resources\\_594_jukebox5\\";
    String fileName = "SongListMore.txt";

    public static void main(String[] args) {
        new Jukebox5().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

        TreeSet<Song> songSet = new TreeSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);
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
        Song nextSong = new Song(tokens[0], tokens[1],tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}