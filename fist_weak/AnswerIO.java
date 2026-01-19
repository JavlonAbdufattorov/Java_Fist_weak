/*  This is answer code for task in file TaskForIO.md
*/

import java.util.Scanner;

public class AnswerIO {
    public static void main(String[] args) {
        //creat scan Object
        Scanner scan = new Scanner(System.in);

        //Task 1
        System.out.println("For fist task write your name please:");
        String name = scan.nextLine();
        System.out.println("Привет" + name);
        //Task 2
        System.out.println("For the second task write your age:");
        int age  = scan.nextInt();
        System.out.println("Тебе " + age +" лет");
        /*Task 3 наверное 3 задание было для проверки поняли я,
            после нехтинт или тамо подобные не надо сразу ставить только одну
            нехтЛине это ошибка и по этому не сделал
        */
        //Task 5
        System.out.println("Write two numbers");
        int a = scan.nextInt();//fist number a
        int b = scan.nextInt();//second number b
        int sum = a+b;//sum a+b
        System.out.println("Sum " + sum);
    }
}
