package Weak3.code;

public class StringTest {
    public static void main(String[] args) {
        String word = "Hello word";
        
        String  newstr = word.substring(6);
        System.out.println(newstr);
        System.out.println(word.subSequence(6,8));// [6 ;8)

        String str1 = "QWER";
        String str2 = ".www";
        String concat = str1 + str2;// есть метод конкат str1.concat(str2)
        System.out.println(concat);
        // в джаве нету оверлодинга операторов то есть не можем поменять функционал +,- и так далее
        // про стринг пул я слышал как она работает и что String    
        
    }
    
}
