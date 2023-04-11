package Dienstag;

public class RegionalePost {

    public static void main(String[] args) {

        FilialePost fp1 = new FilialePost(10, "Filiale Kalsdorf");
        FilialePost fp2 = new FilialePost(15, "Filiale Graz");
        Paket p1 = new Paket(2, "Hauptstrasse 113");

        fp1.paketHinzufuegen(p1);
        fp2.paketHinzufuegen(new Paket(34, "Grazer Strasse 27"));
        fp2.paketHinzufuegen(new Paket(54, "Koerblergasse 126"));

        System.out.println("\nDas Array mit allen darin befindlichen !!Objekten!! bzw. !Referenzen! anzeigen");
        fp1.paketeAnzeigen();
        fp2.paketeAnzeigen();

        System.out.println("\nAlle Paketdetails anzeigen");
        fp1.paketDetails(0);
        fp2.paketDetails(1);

        System.out.println("\nPaket mit ID 2 im Array suchen und loeschen");
        fp1.paketEntfernen(2);
        fp1.paketeAnzeigen();






    }

}
