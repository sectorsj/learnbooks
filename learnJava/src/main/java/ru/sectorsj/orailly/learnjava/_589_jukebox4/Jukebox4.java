package ru.sectorsj.orailly.learnjava._589_jukebox4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox4 {
     ArrayList<Song> songList = new ArrayList<>();
    String path = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\learnJava\\src\\main\\resources\\_586_jukebox4\\";
    String fileName = "SongList4.txt";

    public static void main(String[] args) {
        new Jukebox4().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

        HashSet<Song> songSet = new HashSet<>();
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