package Weak4.code;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int[] arr2 = {1,2,3};
        arr2[1] = 8;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println(Arrays.toString(arr2));
        
    }


}
