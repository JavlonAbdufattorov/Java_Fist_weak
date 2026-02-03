package weak2.code;

public class SwitchCaseCS {
    public static void main(String[] args) {
        byte number = 1;
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("tugadi");
                break;
        }
        //В java 8 присойденились к switch String case Enum case 
        String day = "Monday";
        switch (day) {
            case "Monday": // Если понедельник или вторник рабочий день не проверяет
            case "Tuesday":// каждую по однльностю
                System.out.println("Week day");
                break;
            case "Sunday":
                System.out.println("Weelend");
            default:
                break;
        }

        //java 14 lymda выражение ли как там было
        switch (number) {
            case 1-> System.out.println("One");
            case 2-> System.out.println("Two");
            default-> System.out.println("Tugadi");
                
        }
        // Еще одна фишка в том что возврошается значение на переменую с 14 версии
        String a = switch (number){
            case 1-> "One";
            case 2-> "Two";
            default-> "Tugadi";
                
        };
        //Java 17 Null можно передать в свитч написать для кеса нул
        // не можно передовать в свитч Long float double boolean
    }
}
