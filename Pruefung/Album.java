package Pruefung;

public class Album {
    int nrSongs;
    double shortestSong; //in Sekunden
    double longestSong; //in Sekunden

    public Album(int nrSongs, double shortestSong, double longestSong) {
        this.nrSongs = nrSongs;
        this.shortestSong = shortestSong;
        this.longestSong = longestSong;
    }


    public double averageSongLength() {
        return (longestSong + shortestSong) / 2;
    }

    public int totalLength() {
        return (int) Math.round(nrSongs * averageSongLength());
    }

    public boolean fitsOnMedium(int minutes) {
        int seconds = minutes * 60;
        return totalLength() <= seconds;
    }


}
