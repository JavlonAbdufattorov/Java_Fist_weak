public record Answer (String text,boolean corect) implements Quiz{
    
    public void show(){
        System.out.println(text());
    }
}
