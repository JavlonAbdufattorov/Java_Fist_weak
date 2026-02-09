package Weak3.code;

public class Answer {
    public static void main(String[] args) {
        System.out.println(factorial(15));
    }

    private static int add(int a,int b){
        return a+b;
    }
    private static int multipli(int a,int b){
        return a*b;
    }
    private static int powOnThree(int number){
        return number*number*number; //or Math function 
    }
    private static void switchNumber(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    private static long factorial(int n){
        long result = 1;
        if(n == 0 || n ==1){
            return result;
        }
        result = n*factorial(n-1);
        return result;
    }
}
