package Dienstag;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

//menu erstellen
        do {
            System.out.println("Menu: ");
            System.out.println("0. Paket Hinzufügen");
            System.out.println("1. Paket Entfernen");
            System.out.println("2. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Paket wird hinzugefügt");
                    break;
                case 1:
                    System.out.println("Paket wird entfernen");
                    break;
                case 2:
                    System.out.println("Exit");
                    break;
            }
        } while(choice !=2);
    }
    }

