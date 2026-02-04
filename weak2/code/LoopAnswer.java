package weak2.code;

public class LoopAnswer {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1/i;
        }
        int price = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i+" кг конфети нархи "+ i*price);
        }
        int a = 1;
        int b = 7;
        int sum2=0;
        for (int i = a; i <=b; i++) {
            sum2 = sum2 + i;
        }
        int w = 2;
        int N = 5;
        for (int i = 0; i <=N; i++) {
            System.out.println(Math.pow(2,i));
        }

    }
}
