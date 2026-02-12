package Weak3.code;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    
    public static void main(String[] args) {
        String[] board =   fillBoard();
        String turn = chooseTurn();
        printBoard(board);
        System.out.println(turn + " Player fist ");
        Scanner scan = new Scanner(System.in);

        while (!isBoardFull(board)) {
            printBoard(board);
            System.out.println(turn + " enter slot number: ");
            int slotNumber = scan.nextInt();
            if(!board[slotNumber].equals(String.valueOf(slotNumber))){
                System.out.println("Slot already taken");
                continue;
            };
            board[slotNumber] = turn;
            if(checkWin(board,turn)){
                System.out.println("Player "+ turn + " win ))");
                return;
            }
            
            turn = turn.equals("X") ? "O":"X";

        }
    }
    static boolean checkWin(String[] board, String turn){
        String [] winCases = {
                board[1] + board[2] + board[3],
                board[4] + board[5] + board[6],
                board[7] + board[8] + board[9],

                board[1] + board[4] + board[7],
                board[2] + board[5] + board[8],
                board[3] + board[6] + board[9],

                board[1] + board[5] + board[9],
                board[3] + board[5] + board[7]
        };

        for (String winCase : winCases) {
            if (winCase.equals(turn.repeat(3)))
                return true;
        }
        return false;
    };
    private static boolean isBoardFull(String[] board) {
        // TODO Auto-generated method stub
        for (int i = 1; i < board.length; i++) {
            if(board[i].equals(String.valueOf(i))){
                return false;
            }
        }
        return true;
    }
    static void printBoard(String[] board) {
        // TODO Auto-generated method stub
        System.out.println(getSlot(board,1)+" | "+getSlot(board,2)+" | "+getSlot(board,3));
        System.out.println("---------");
        System.out.println(getSlot(board,4)+" | "+getSlot(board,5)+" | "+getSlot(board,6));
        System.out.println("---------");
        System.out.println(getSlot(board,7)+" | "+getSlot(board,8)+" | "+getSlot(board,9));
        
    }
    private static String getSlot(String[] board, int i) {
        // TODO Auto-generated method stub
        return board[i];
    }
    static String[] fillBoard() {
        // TODO Auto-generated method stub
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = String.valueOf(i);
        }
        return strings;
    }
    private static String chooseTurn() {
        // TODO Auto-generated method stub
        Random random = new Random();
        return random.nextBoolean() ? "X":"O";
    }
}
