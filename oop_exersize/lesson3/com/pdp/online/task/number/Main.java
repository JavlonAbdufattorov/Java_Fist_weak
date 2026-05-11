package oop_exersize.lesson3.com.pdp.online.task.number;

public class Main {
    public static void main(String[] args) {
        iPhone i11 = new iPhone();
        i11.setSalary(10000);
        i11.setBonus(500);
        Phone i111 = new Phone();
        i111.setSalary(22);
        Phone[] p = {i11,i111};
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getSalary());
        }
    }
}
