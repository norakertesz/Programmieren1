package Pruefung;

public class MusicApp {
    public static void main(String[] args) {

        Album firstAlbum= new Album(8,385.0,480.0);
        System.out.println("Durchschnittliche Songlänge: " + firstAlbum.averageSongLength() + " Sekunden");
        System.out.println("Gesamtdauer des Albums: " + firstAlbum.totalLength() + " Sekunden");
        System.out.println("Passt das Album auf ein Medium mit 45 Minuten Speicherplatz? " + firstAlbum.fitsOnMedium(45));
        System.out.println("Passt das Album auf ein Medium mit 80 Minuten Speicherplatz? " + firstAlbum.fitsOnMedium(80));

    }
}
