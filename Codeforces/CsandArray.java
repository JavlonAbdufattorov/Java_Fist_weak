package Codeforces;

import java.util.Scanner;

public class CsandArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextLong();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++){
            flag = true;
            for (int j = 0; j < n; j++) {
                if(numbers[j]%numbers[i] != 0){
                    flag = false;
                    break; // можно ускорить цикл
                }
            }
            if (flag) {
                System.out.println(numbers[i]);
                return; // завершить программу сразу
            }
        }
        System.out.println(-1);
    }
}