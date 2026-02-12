package Weak3.code;

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
        int[] array2 = new int[] {3,4,56,7,3,3};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    } 
}