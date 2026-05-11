package oop_exersize.lesson3.com.pdp.online.task.number;

public class iPhone extends Phone {
    private double bonus;
    public double getSalary(){
        
        return super.getSalary() + bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
