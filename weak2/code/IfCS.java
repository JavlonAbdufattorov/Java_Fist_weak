package weak2.code;

import java.util.Scanner;

public class IfCS {

    public static void main(String[] args) {
        System.out.println("Telegram");
        System.out.println("You will have simple emojis");
        System.out.println("Is your telegram premium (yes/no -> 0/1)");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        if (userInput == 0) {
            System.out.println("you will have awesome emojis too");
        }
        System.out.println("..........");
    }
}