package com.georgiaEdx.part1.HW03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Warship {
    private static final int numRows = 10;
    private static final int numCols = 10;
    private static final int NB_SHIPS = 5;

    private static int playerShips = NB_SHIPS;
    private static int computerShips = NB_SHIPS;
    private static final int[][] missedGuesses = new int[numRows][numCols];

    private static final Random random = new Random();

    public static final int FIELD_SIZE = 10;
    private static final int[][] playerField = new int[FIELD_SIZE][FIELD_SIZE];
    private static final int[][] computerField = new int[FIELD_SIZE][FIELD_SIZE];

    public static void main(String[] args) {
        System.out.println("Welcome to Amiral Batti game");

        System.out.println("\nComputer: ");
        deployPlayersShips(computerField);
        System.out.println("\n");
        System.out.println("\nHuman: ");
        deployPlayersShips(playerField);

        Scanner scn = new Scanner(System.in);

        do {
            battle(scn);
        } while (playerShips != 0 && computerShips != 0);

        gameOver();
    }

    public static void deployPlayersShips(int[][] field) {
        for (int i = NB_SHIPS; i > 0; i--) {
            int x = random.nextInt(field.length);
            int y = random.nextInt(field.length);
            boolean vertical = random.nextBoolean();

            if (vertical) {
                if (y + i > FIELD_SIZE) {
                    y -= i;
                }
            } else if (x + i > FIELD_SIZE) {
                x -= i;
            }
            boolean isFree = true;

            if (vertical) {
                for (int m = y; m < y + i; m++) {
                    if (field[m][x] != 0) {
                        isFree = false;
                        break;
                    }
                }
            } else {
                for (int n = x; n < x + i; n++) {
                    if (field[y][n] != 0) {
                        isFree = false;
                        break;
                    }
                }
            }
            if (!isFree) {
                i++;
                continue;
            }

            if (vertical) {
                for (int m = Math.max(0, x - 1); m < Math.min(FIELD_SIZE, x + 2); m++) {
                    for (int n = Math.max(0, y - 1); n < Math.min(FIELD_SIZE, y + i + 1); n++) {
                        field[n][m] = 9;
                    }
                }
            } else {
                for (int m = Math.max(0, y - 1); m < Math.min(FIELD_SIZE, y + 2); m++) {
                    for (int n = Math.max(0, x - 1); n < Math.min(FIELD_SIZE, x + i + 1); n++) {
                        field[m][n] = 9;
                    }
                }
            }

            for (int j = 0; j < i; j++) {
                field[y][x] = i;
                if (vertical) {
                    y++;
                } else {
                    x++;
                }
            }
        }

        printBoard2(field);
    }

    public static void battle(Scanner scn) {
        playerTurn(scn);
        computerTurn();

        System.out.println("\nComputer: ");
        printBoard2(computerField);
        System.out.println("\nHuman: ");
        printBoard2(playerField);

        System.out.println();
        System.out.println("Your ships: " + playerShips + " | Computer ships: " + computerShips);
        System.out.println();
    }

    public static void playerTurn(Scanner scn) {
        System.out.println("\nHuman's turn: ");
        int x = -1, y = -1;
        do {
            System.out.print("Enter row number: ");
            x = scn.nextInt();
            System.out.print("Enter column number: ");
            y = scn.nextInt();
        } while ((x < 0 || x >= numRows) || (y < 0 || y >= numCols));

        if (computerField[x][y] != 0 && computerField[x][y] != 9) {
            System.out.println("You sunk the ship!");
            computerField[x][y] = 1;//"s";
            computerShips--;
        } else if (".".equals(computerField[x][y])) {
            System.out.println("You missed");
            computerField[x][y] = 2; //"x";
        }
    }

    public static void computerTurn() {
        System.out.println("\nComputer's turn: ");

        int x = random.nextInt(FIELD_SIZE);
        int y = random.nextInt(FIELD_SIZE);
        System.out.println("Enter row number: " + x);
        System.out.println("Enter column number: " + y);

        if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols)) {
            if (playerField[x][y] != 0 && playerField[x][y] != 9) {
                System.out.println("The Computer sunk one of your ships!");
                playerField[x][y] = 1;//"s";
                playerShips--;
            } else if (".".equals(playerField[x][y])) {
                System.out.println("Computer missed");
                playerField[x][y] = 2; //"x";
                if (missedGuesses[x][y] != 1) {
                    missedGuesses[x][y] = 1;
                }
            }
        }
    }

    public static void gameOver() {
        System.out.println("Your ships: " + playerShips + " | Computer ships: " + computerShips);
        if (playerShips > 0 && computerShips <= 0) {
            System.out.println("You won the battle! ");
        } else {
            System.out.println("You lost the battle! ");
        }
        System.out.println();
    }

    public static void printBoard2(int[][] field) {
        System.out.print(" ");
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        char[][] map = new char[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                switch(field[i][j]) {
                    case 0:
                    case 9: map[i][j] = '.';
                        break;
                    case 1: map[i][j] = 's';
                        break;
                    case 2: map[i][j] = 'x';
                        break;
                    default: map[i][j] = 'o';
                        break;
                }
            }
        }

        Arrays.stream(map)
                .forEach(m -> System.out.println(Arrays.toString(m).replace(",", "")));
    }
}
