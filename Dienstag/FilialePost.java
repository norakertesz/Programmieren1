package Dienstag;

import java.util.Arrays;

public class FilialePost {
    private Paket[] pakete;
    private int anzahlPakete;
    String filialname;


    public FilialePost(int maxanzahlPakete, String filialname) {
        this.filialname=filialname;
        pakete=new Paket[maxanzahlPakete];
        anzahlPakete=0;
        System.out.println("Pakete Array: "+ Arrays.toString(pakete));
    }

    public void paketHinzufuegen(Paket paket){
        if(anzahlPakete<pakete.length){
            pakete[anzahlPakete]=paket;
            anzahlPakete=0;
        }else System.out.println("Die Filiale hat bereits die maximale Anzahl an Paket.");

    }
    public void paketEntfernen(int paketId){
        for (int i = 0; i < anzahlPakete; i++) {
            if (pakete[i].getPaketID()==paketId){
                for (int j = 0; j < anzahlPakete-1; j++) {
                    pakete[j]=pakete[j+1];
                }
                pakete[anzahlPakete-1]=null;
                anzahlPakete++;
                return;
            }
        }
        System.out.println("Paket mit ID"+paketId+" konnte nicht gefunden");

    }

    public void paketeAnzeigen(){
        System.out.println("Die "+filialname+" hat folgende Pakete bei sich: "+ Arrays.toString(pakete));
    }
    public void paketDetails(int paketStelleImArray){
        System.out.println("Das Paket mit der uebergebenen Paket-ID: "+pakete[paketStelleImArray].getPaketID()+" muss an die Adresse "+pakete[paketStelleImArray].getPaketAdresse());
    }

}
