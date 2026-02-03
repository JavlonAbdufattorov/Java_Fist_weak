package weak2.code;

import java.util.Scanner;

public class IfElseCS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short age = scan.nextShort();
        if(age<10){
            System.out.println("You must go school");
        } else if(age>10 && age<16){
            System.out.println("You also must go School");
        }else if (age > 16 && age <20) {
            System.out.println("You should go to university");
        }else{
            System.out.println("Work hard");
        }
    }
}
