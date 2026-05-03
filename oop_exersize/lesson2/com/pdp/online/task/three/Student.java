package oop_exersize.lesson2.com.pdp.online.task.three;

import oop_exersize.lesson2.com.pdp.online.task.two.UserClass;

public class Student extends UserClass{
    int studentGruop;
    public Student(String name, String secondName, int phoneNumber, int age, boolean isMale,int studentGruop) {
        super(name, secondName, phoneNumber, age, isMale);
        this.studentGruop = studentGruop;
    }
    
    public void setStudentGruop(int studentGruop) {
        this.studentGruop = studentGruop;
    }
    public int getStudentGruop() {
        return studentGruop;
    }
}
