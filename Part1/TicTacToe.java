package Part1;

import java.util.Scanner;

public class TicTacToe {

    static final int rows = 3;
    static final int columns = 3;
    static final char empty = '_';
    static final char X = 'X';
    static final char O = 'O';
    static char[][] board;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        board = new char [rows][columns];
        initializeBoard();

        char currentPlayer = X;
        boolean gameOver = false;
        int moves = 0;

        while (!gameOver && moves <rows * columns) {
            displayBoard();
            System.out.println("Spieler " + currentPlayer + " am Zug");
            System.out.print("Bitte Zeile (1-3) eingeben: ");
            int row = input.nextInt() - 1;
            System.out.print("Bitte Spalte (1-3) eingeben: ");
            int column = input.nextInt() - 1;

            if (isValidMove(row, column)) {
                board[row][column] = currentPlayer;
                moves++;
                if (isWinner(currentPlayer)) {
                    displayBoard();
                    System.out.println("Spieler " + currentPlayer + " hat gewonnen!");
                    gameOver = true;
                } else {
                    currentPlayer = (currentPlayer == X) ? O : X; //if (currentPlayer == X) {currentPlayer = O;} else {currentPlayer = X;}
                }
            } else {
                System.out.println("Ungültiger Zug, bitte erneut eingeben");
            }
        }

        if (!gameOver) {
            displayBoard();
            System.out.println("Unentschieden!");
        }
    }
//______________________________METHODS____________________________________
    private static void initializeBoard() {
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = empty;
            }
        }
    }

    private static void displayBoard() {
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int column) {
        if (row < 0 || row >=rows || column < 0 || column >= columns) {
            return false;
        }
        if (board[row][column] != empty) {
            return false;
        }
        return true;
    }

    private static boolean isWinner(char player) {
        // Überprüfen der Zeilen
        for (int i = 0; i <rows; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Überprüfen der Spalten
        for (int j = 0; j < columns; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Überprüfen der Diagonalen
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
