package Weak3.code;

public class MethodDefinitionExample {
    public static void main(String[] args) {
        int addMethodsResponse = add(12,122);
        System.out.println(addMethodsResponse);
        hello();
    }

    static int add(int a,int b){
        int result = a+b;
        return result;
    }
    static void hello(){
        System.out.println("Hello");
    };
}
