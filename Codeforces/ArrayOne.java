package Codeforces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class ArrayOne implements Readable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        
        while (t-- > 0) {
            int n = scan.nextInt();
            int sum = 0;
            int negCount = 0;
            
            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                sum += x;
                if (x == -1) negCount++;
            }
            
            int ops = 0;
            if (sum < 0) {
                ops += (-sum + 1) / 2; // нужно перевернуть enough -1 → 1 чтобы сумма ≥ 0
                negCount = negCount - ops;
            }
            // Сначала исправляем произведение
            if (negCount % 2 != 0) {
                ops += 1;        // переворачиваем один элемент, чтобы сделать произведение = 1
                sum += 2;       // каждый переворот -1 → 1 увеличивает сумму на 2
            }
            
            // Затем исправляем сумму
            
            
            
            System.out.println(ops);
        }
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }
}