package fist_weak_part2.code;

public class AssigmentOperators {

    public static void main(String[] args) {
        int x = 12;
        
        x += 2;// x = x + 2;
        x *= 2;// x = x * 2;
        int y = 28+2.4F;// Error :  int + float = float Type mismatch: cannot convert from float to int 
        // x = x * 2;
        x += 2.4F; // No error : x = (int)(x + 2.4F) narrowing casting
        int c =2;
        c ^= 2;// XOR
        c |= 2;// OR
        c &= 2;// AND
        
        System.out.println(c);
    }
}