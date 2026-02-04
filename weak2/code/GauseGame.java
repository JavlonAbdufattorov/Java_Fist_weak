package weak2.code;

import java.util.Scanner;

public class GauseGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int computer = (int)Math.round(Math.random()*(max-min))+min;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number");
        int guessNumber = scan.nextInt();
        if (guessNumber == computer){
            System.out.println("You win");
        }else{
            System.out.println("Sorry you loose");
        }
    }
}
