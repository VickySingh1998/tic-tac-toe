package com.bridgelabz;

import java.util.Scanner;
public class TicTacToeGame {

    public static void showBard() {
        char[] BOARD = new char[10];
        char player;
        char computer;

        System.out.println(BOARD[0] + " | " + BOARD[1] + " | " + BOARD[2]);
        System.out.println(BOARD[3] + " | " + BOARD[4] + " | " + BOARD[5]);
        System.out.println(BOARD[6] + " | " + BOARD[7] + " | " + BOARD[8]);
    }

    public static char player() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice x or 0 only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Toc Toe game");
        showBard();
        player();
    }
}