package Codeforces;

import java.util.Arrays;

public class ProgramPro {
    public static void main(String[] args) {
        String str = "sdsa";
        System.out.println(str.contains("a"));
        
    }
    public static String[] filterStrings(String[] arr, int arrSize) {
        String[] arr2 = Arrays.stream(arr)
            .filter(str -> !str.contains("a"))
            .toArray(String[]::new);
        return arr2;
    }
}
