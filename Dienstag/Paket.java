package Dienstag;

public class Paket {
    private int id;
    private String adresse;
static int[] zahlen;

    public Paket(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public int getPaketID() {
        return id;
    }

    public int setPaketID(int newID) {
        this.id = newID;
        return newID;
    }

    public String getPaketAdresse() {
        return adresse;
    }

    public String setPaketAdresse(String newAdresse) {
        this.adresse = newAdresse;
        return newAdresse;
    }


}
