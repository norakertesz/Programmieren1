package Part1;


public class Grundsteuer {
    int[][] myArray = {
            {1, 30, 40},
            {2, 20, 50},
            {3, 10, 30}
    };


    public double grundsteuerBerechnen(int[][] myArray) {
        double steuerSumme = 0.0;
        for (int i = 0; i < myArray.length; i++) {
            int typ = myArray[i][0];
            int laenge = myArray[i][1];
            int breite = myArray[i][2];
            int flaeche = laenge * breite;
            double steuersatz = 0.0;
            switch (typ) {
                case 1:
                    steuersatz = 3.20;
                    break;
                case 2:
                    steuersatz = 2.10;
                    break;
                case 3:
                    steuersatz = 0.90;
                    break;
                default:
                    // Fehlerbehandlung für ungültige Typen
                    break;
            }
            double steuer = flaeche * steuersatz;
            steuerSumme += steuer;
        }
        return steuerSumme;
    }
}



