package fist_weak_part2.code;

public class ConditionOperator {
    public static void main(String[] args) {
        int x = 12;
        int y = 90;
        int max;
        boolean exprestion = x>y;
        // Ex1
        if(exprestion){
            max = x;
        }else{
            max = y;
        }
        max = exprestion ? x:y; // Еквивалентна с Ex1
        // как это работает у нас есть переменая exprestion если она истина то
        // возврошает x в противном случае y
        
    }
}
