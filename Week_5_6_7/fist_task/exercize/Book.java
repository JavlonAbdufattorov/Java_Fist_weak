package Week_5_6_7.fist_task.exercize;

public class Book {
    String name;
    String author;
    int pageCount;
    //no-args constructor
    public Book(){

    };
    //Parameterized Constructor
    public Book(String name,String author,int pageCount){
        this.name = name;
        this.author =author;
        this.pageCount = pageCount;
    }
    //Constructor Overloading
    public Book(String name,int pageCount){
        this.name = name;
        this.pageCount = pageCount;
    }
    public void printInfo(){
        System.out.printf("THE name of the Book is %s, author is %s and there are %d page",this.name,this.author,this.pageCount);
    }
}
