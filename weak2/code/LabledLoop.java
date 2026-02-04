package weak2.code;

public class LabledLoop {

    public static void main(String[] args) {
        Javlon:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i+" ");
                System.out.print(j+ " ");
                if(j==4){
                    break Javlon;//labelled in Javlon 
                }
            }
            System.out.println("");
        }
    }
}