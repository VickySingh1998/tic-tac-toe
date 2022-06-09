package com.bridgelabz;

public class TicTacToeGame {
    public static void showBoard() {
        char[] BOARD = new char[10];

        System.out.println(BOARD[0] + " | " + BOARD[1] + " | " + BOARD[2]);
        System.out.println(BOARD[3] + " | " + BOARD[4] + " | " + BOARD[5]);
        System.out.println(BOARD[6] + " | " + BOARD[7] + " | " + BOARD[8]);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe game");
        showBoard();

    }
}