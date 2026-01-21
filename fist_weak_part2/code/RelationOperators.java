package fist_weak_part2.code;

public class RelationOperators {

    public static void main(String[] args) {
        int x = 12;
        int y = 12;
        // == оператор сравнение на равенства
        boolean r1 = (x == y);//true
        boolean r2 = (x > y);// false
        boolean r3 = (x >= y);// true

        int age = 20;
        int gender = 0;
        boolean exprestion1 = age>18;
        boolean exprestion2 = gender == 0;
        boolean r11 = exprestion1 && exprestion2;
        /*  корочи говоря дискретная математика
            && - логическая И
            || - логическая ИЛИ
            !  - логическая НЕ
            остальные вычесление как в старые добрые времена
        */

    }
}