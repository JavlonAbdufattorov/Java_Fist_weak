package online.src;

public class User {
    private int id;
    private String name;
    private int age;

    public User(int id,String name,int age){
        this.id = id;
        this.age = age;
        this.name = name;
    }
    public User(){
    }

    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else{
            System.out.println("Yosh 0 kichig bolmashlihi kerak");
        }
        
    }
    private void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

}
