package weak2.code;

import java.util.Scanner;

public class MathClassMethods {

    public static void main(String[] args) {
        double random = Math.random();//возварашает случайное число 0 до 1
        System.out.println(random);
        int a = 12;
        int b = 9;
        int max = Math.max(a, b);// возврошает самая большое из чисел
        int min = Math.min(a, b);// возврошеат минимум из чисел
        System.out.println(Math.abs(-100));// модуль числа |-100|
        System.out.println(Math.pow(2, 3));// 2 в степени 3
        System.out.println(Math.E+" "+Math.PI);// 2.71 и 3.14
        System.out.println(Math.sin(Math.PI));
        //23 va 45 sonlar teng yoki yo'qligini tekshirish dasturini yozing.
        int x = 23;
        int y = 45;

        if(x != y){
            System.out.println("Тенг емас");
        }
        else{
            System.out.println("Тенг");
        }

        //7 ni 5chi darajasini ekran chaqizuvchi dasturini yozing.
        System.out.println(Math.pow(7, 5));
        //a va b o'zgaruvchilarni qaysi biri katta ekanligini aniqlovchi dastur. Agar qaysi biri katta usha o'zgaruvchini ekranga chiqaring.
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(Math.max(m, n));
        
    }
}