public class User extends GenericClass {
    private String name;
    private int phone;
    private Role role;
    
    User(String name,int phone,Role role){
        this.name = name;
        this.phone = phone;
        this.role = role;
        System.out.println(this.id);
    }

    

}
