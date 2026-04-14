package Weak3.code;

import java.util.Arrays;
import java.util.Scanner;

public class AnswerArray {
    //task 1
    public static void main(String[] args) {
        int n = 10;
        int[] Array1 = new int[n];
        for (int i = 0; i < Array1.length; i++) {
            Array1[i] = (int)Math.pow(2, i);
        }
        for (int i = 0; i < Array1.length; i++) {
            System.out.println(Array1[i]);
        }
        reverseArray(Array1);
        


    }

    static void reverseArray(int[] array1){
        for(int i = 0;i<array1.length;i++){
            System.out.println(array1[array1.length - i-1]);
        }
    }
    

}
