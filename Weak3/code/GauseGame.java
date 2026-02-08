package Weak3.code;

import java.util.Scanner;

public class GauseGame {

    public static void main(String[] args) {
        int number = generateNumber(1, 20);
        System.out.println("Chouse number betwen 1 and 20");
        for (int i = 0; i < 3; i++) {
            int guess = readInputsAsInt("Guess number :");
            if(guess == number){
                System.out.println("you win");
                return;
            }else{
                System.out.println("try again");
            }
        }
        System.out.println("You lose");
    }

    private static int readInputsAsInt(String message){
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextInt();
    };
    private static int generateNumber(int min,int max){
        if (max<min){
            int temp = min;
            min = max;
            max = temp;
        }

        return (int) Math.round(Math.random()*(max-min))+1; //0< Math.random()*(max-min)< max-min
    }
}