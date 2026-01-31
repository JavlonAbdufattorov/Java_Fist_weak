package weak2.code;

import java.util.Scanner;

public class Codeforces427A {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();//число операции
        int count = 0;
        int police = 0;
        for(int i = 0;i<n;i++){
            int ev = scan.nextInt(); // какой дейстивя совершается ограбление -1 принятие полецейского 1
            if(ev>0)police = police + ev;
            if(ev==-1){
                if(police>0){
                    police--;
                    continue;
                }
                count++;
            }
            
        }
        System.out.println(count);
    }
}
