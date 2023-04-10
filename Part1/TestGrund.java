package Part1;

public class TestGrund {

    public static void main(String[] args) {
        Grundsteuer first=new Grundsteuer();
        double firstSteuer=first.grundsteuerBerechnen(first.myArray);
        System.out.println(firstSteuer);
    }
}
