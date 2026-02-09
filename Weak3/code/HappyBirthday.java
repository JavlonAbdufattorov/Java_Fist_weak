package Weak3.code;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HappyBirthday {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        for ( int i = 0; i < 100; i++ ) {
            TimeUnit.MILLISECONDS.sleep(400); //
            int leftSideDotesCount = randomNumberBetween1And30();
            int rightSideDotesCount = 30 - leftSideDotesCount;
            String leftSide = "\uD83C\uDF82".repeat(leftSideDotesCount);
            String rightSide = "\uD83C\uDF81".repeat(rightSideDotesCount);
            String message = leftSide + "Happy birthday " + name + rightSide;
            System.out.println(message);
        }

    }

    static int randomNumberBetween1And30() {
        return (int) Math.round(Math.random() * ( 30 - 1 )) + 1;
    }
}