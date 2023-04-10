package Part1;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {


        transaktion();

    }
        public static int accountBalance () {
            System.out.println("Enter your account balance:");
            Scanner scanner = new Scanner(System.in);
            int accountBalance = scanner.nextInt();
            return accountBalance;
        }


        public static void transaktion ( ){
            int accountBalance = accountBalance();
            System.out.println("---Menu---");
            System.out.println("1. Deposit\n" +
                    "2. Withdraw\n" +
                    "3. Check balance\n" +
                    "4. Exit\n");
            System.out.println();
            System.out.println("Enter your choice:");
            Scanner scanner = new Scanner(System.in);
            int myChoice = scanner.nextInt();

            if (myChoice == 1 || myChoice == 2) {
                System.out.println("Bitte den Betrag der Transaktion einzugeben:");
                Scanner scanner2 = new Scanner(System.in);
                int betrag = scanner2.nextInt();
                int newBetrag = accountBalance - betrag;
                System.out.println("Erfolgreiche Transaktion! Ihr aktuelle Kontostand ist:" + newBetrag + " €");
                transaktion();
            } else if (myChoice == 3) {
                System.out.println("Ihr aktuelle Kontostand ist: " + accountBalance + " €");
                transaktion();

            } else if (myChoice == 4) {
                System.out.println("Auf Wiedersehen!");
            } else {
                System.out.println("ERROR!");

            }

        }


    }



