package Week_5_6_7.fist_task.exercize;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.author);
        Book book2 = new Book("A","A",1);
        book2.printInfo();
        Calc calc = new Calc(1,2,'+');
        calc.printResult();
        calc.calculate();
        calc.printResult();

    }
}
