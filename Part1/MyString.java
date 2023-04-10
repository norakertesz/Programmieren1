package Part1;

import java.util.Scanner;

public class MyString {

    public static void main(String[] args) {
        System.out.println("Geben Sie etwas ein:");
        Scanner stringScanner = new Scanner(System.in);
        String etwas = stringScanner.next();


        for (int i = etwas.length() - 1; i >= 0; i--) {
            System.out.print(etwas.charAt(i));
        }
        System.out.println();

        //-------------------------

        System.out.println("Geben Sie einen Satz ein:");
        Scanner stringScanner2 = new Scanner(System.in);
        String satz = stringScanner2.next();
        int count = 0;
        for (int i = 0; i < satz.length(); i++) {
            char c = Character.toLowerCase(satz.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in phrase: " + count);

        String password = "geheim";
        Scanner input = new Scanner(System.in);
        String userPassword;

        System.out.print("Bitte Passwort eingeben: ");
        userPassword = input.nextLine();

        while (!userPassword.equals(password)) {
            System.out.println("Falsches Passwort!");
            System.out.print("Bitte Passwort eingeben: ");
            userPassword = input.nextLine();
        }

        System.out.println("Richtiges Passwort eingegeben!");
    }
}

