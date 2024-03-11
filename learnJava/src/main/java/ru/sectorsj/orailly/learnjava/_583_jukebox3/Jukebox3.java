package ru.sectorsj.orailly.learnjava._583_jukebox3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox3 {
     ArrayList<Song> songList = new ArrayList<>();
    String path = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\learnJava\\src\\main\\resources\\_583_jukebox3\\";
    String fileName = "SongList3.txt";

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();

        Collections.sort(songList, artistCompare);
        System.out.println(songList);
    }
    private class ArtistCompare implements Comparator<Song> {

        @Override
        public int compare(Song one, Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
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