package weak2.code;

import java.util.Scanner;

public class NestedIfCS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        byte age = scan.nextByte();
        byte gender = scan.nextByte();
        if(gender == 0){
            //....
            if(age>=60){
                System.out.println("Enjoy your retirement");
            }else{
                int i = 60 - age;
                System.out.println(i+" years for your retirement");
            }
        }else if(gender == 1){

            if(age>=55){
                System.out.println("Enjoy your retirement");
            }else{
                int i = 60 - age;
                System.out.println(i+" years for your retirement");
            }
        }else{
            System.out.println("error");
        }
        
    }
}
