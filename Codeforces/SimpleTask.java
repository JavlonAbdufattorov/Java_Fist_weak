package Codeforces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SimpleTask {
    public static void main(String[] args) {
        //Дан массив чисел. Найти сумму всех элементов.
        int arr1[] = {1,2,3,4};
        
        // System.out.println(sumArr(arr1));
        // System.out.println(findMaxNumber(arr1));
        // System.out.println(countOddNumber(arr1));
        // System.out.println(avgArr(arr1));
        // int[] arr2 = sdvigArr(arr1);
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.println(arr2[i]);
        // }
        int[] arr3 = deleteByIndex(arr1, 1);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
    private static int[] deleteByIndex(int[] arr,int index){
        int arrCopy[] = new int[arr.length-1];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if(index == i){
                continue;
            }
            arrCopy[counter] = arr[i];
            counter++;
        }
        return arrCopy;

    }

    

    private static int[] sdvigArr(int[] arr){
        int lastNumber = arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastNumber;
        return arr;
    }
    private static int countOddNumber(int[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }

    private static int findMaxNumber(int[] arr){
        int maxNumber = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if(maxNumber<arr[j]){
                maxNumber = arr[j];
            }
        }
        return maxNumber;
    }


    private static double avgArr(int[] arr){
        int arrLength = arr.length;
        double s = (double)sumArr(arr)/(double)arr.length;
        return s;
    }
    private static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
