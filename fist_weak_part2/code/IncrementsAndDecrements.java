package fist_weak_part2.code;

public class IncrementsAndDecrements {
    public static void main(String[] args) {
        int counter  = 0;

        counter ++;// icrement(postfix form)
        System.err.println(counter);
        counter --;// decrement (postfix form)
        --counter; // dectement (prefix form)
        int n = 4;
        int m = 4;
        int x = 5;
        int y = 5;
        x = x * n++;// 20
        // сперва выполняетчя другие операции и к n добавляется 1
        // x = 5 * 4 -> потом n становится n = 5
        y = y * ++m;// 25
        /*во втором случае к n прибовляется 1 и потом выполняется умножение 
        y = 5 * 5
        */

        System.out.println(counter);
        4++;//is not a legal statment

    }
}
