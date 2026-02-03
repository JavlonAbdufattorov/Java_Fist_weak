package weak2.code;

import java.util.Scanner;

public class IfElseAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        if(number>0){
            number++;
        }else if(number == 0){
            number = 10;
        }else{
            number = number-2;
        }
        System.out.println(number);
        int a,b,c;
        int counter = 0;//счетчик
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        if(a>0){
            counter++;
        }
        if(b>0){
            counter++;
        }
        if(c>0){
            counter++;
        }
        System.out.println("Положительные числа:"+counter);
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, Math.min(b, c)));
        int sum1 = a+b;
        int sum2 = a+c;
        int sum3 = b+c;
        //nested IF
        if(sum1 > sum2){
            if(sum1>sum3){
                System.out.println(a+" "+b);
            }
            System.out.println(b+" "+c);
        }else{
            if (sum2>sum3) {
                System.out.println(a+" "+c);
            }
            System.out.println(b+" "+c);
        }
    }
}
