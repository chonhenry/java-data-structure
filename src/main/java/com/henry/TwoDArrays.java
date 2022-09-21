package com.henry;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        System.out.println(Arrays.deepToString(board));
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(j==2) {
                    System.out.println(board[i][j]);
                } else {
                    System.out.print(board[i][j]);
                }
            }
        }

        char[][] boardTwo = new char[][] {
                new char[] {'O', '-', '-'},
                new char[] {'O', '-', '-'},
                new char[] {'O', '-', '-'}
        };

        System.out.println(Arrays.deepToString(boardTwo));
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(j==2) {
                    System.out.println(boardTwo[i][j]);
                } else {
                    System.out.print(boardTwo[i][j]);
                }
            }
        }
    }
}
