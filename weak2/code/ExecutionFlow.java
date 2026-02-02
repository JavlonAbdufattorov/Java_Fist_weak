package weak2.code;

import java.util.Scanner;
// Sequention execution
public class ExecutionFlow {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int userInput = scan.nextInt();
        int userInput2;
        //Condition execution
        if (userInput == 4){
            System.out.println("Your right");
        }else{
            System.out.println("Nope :(");
        }
        //Repitition execution
        do{
            
            userInput2 = scan.nextInt();
            if (userInput == 4){
                System.out.println("Your right");
            }else{
                System.out.println("Nope :(");
            }
        }while(userInput2 == 4);

    }
}
