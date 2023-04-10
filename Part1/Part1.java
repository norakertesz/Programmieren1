package Part1;

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        System.out.println("1 or 2?");
        eingeben();

    }

    public static void eingeben() {
        Scanner scanner = new Scanner(System.in);

        int myNumber = scanner.nextInt();
        if (myNumber == 1 || myNumber == 2) {


            switch (myNumber) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;

            }
        } else if (myNumber < 0 || myNumber > 2) {
            System.out.println("Nem jo szam, adj be masikat, 1 vagy 2:");
            eingeben();
        }

    }
}
