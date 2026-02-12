package Weak3.code;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WorkingArray {

    public static void main(String[] args) {
        int[] array; // reference
        array = new int[4];// new -> return memory address
        int index = 0;
        int nthElement  = array[index];
        System.out.println(nthElement);
        /*
        по умолчание в памяти сохроняется эти значения

        int -> 0
        short -> 0 
        long -> 0
        bolean -> false
        String -> null
        */

        // Элементы массива выводим с помошью цикла фор или тоСтринг простым sout дает только ссылку на память где хронится первый элемент массива
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array.toString());// тоСтринг тоже возврошеат ссыку оказыватеся)
        int[] array2 = {3,4,56,7,3,3};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }


        String str = Arrays.toString(array2);
        System.out.println(str);// а стоп тоСтринг с помошью класса Аррай нужно делать)
        Arrays.sort(array2);//сортировка массива
        System.out.println(Arrays.toString(array2));
        int index1 = Arrays.binarySearch(array2, 56);// находит индекс котором находится число
        System.out.println(index1);

        int [][] matrix = {
            {12,2,3},
            {5,5,5},
            {2,14,5},
            {11,3,1}
        };
        for(int[] row:matrix){
            for(int elements : row){
                System.out.print(elements + "\t");
            }
            System.out.println();
        }
    } 
}