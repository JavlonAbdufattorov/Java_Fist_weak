package weak2.code;

import java.util.Scanner;

public class SwitchAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numebrs = scan.nextInt();
        switch (numebrs) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятницу");
            case 6 -> System.out.println("Субота");
            case 7 -> System.out.println("Воскресения");
        }
        switch (numebrs) {
            case 1 -> System.out.println("Йомон");
            case 2 -> System.out.println("Коникарсиз");
            case 3 -> System.out.println("Коникарли");
            case 4 -> System.out.println("Яхши");
            case 5 -> System.out.println("Ало");
        }
        switch (numebrs) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
        switch (numebrs) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 кун");
                break;
            case 2:
                System.out.println("28 или 29");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 кун");
                break;
        }

        


    }
}
