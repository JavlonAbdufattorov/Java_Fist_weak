package oop_exersize.lesson2.com.pdp.online.task.two;

public class UserClass {
    private String name;
    private String secondName;
    private int phoneNumber;
    private int age;
    private boolean isMale;

    public UserClass(String name,String secondName,int phoneNumber,int age,boolean isMale){
        this.name = name;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.isMale = isMale;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getSecondName() {
        return secondName;
    }
    @Override
    public String toString() {
        return "Ism sharif "+secondName+" "+name+" yoshi "+age+" telefon raqami "+phoneNumber+" Erkakmi ?"+isMale;
    }
    
}