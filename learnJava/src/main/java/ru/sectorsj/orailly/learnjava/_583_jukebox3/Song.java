package ru.sectorsj.orailly.learnjava._583_jukebox3;

class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return title+ ": " + artist;
    }

    @Override
    public int compareTo(Song s) {
        return title.compareTo(s.getTitle());
    }
}
