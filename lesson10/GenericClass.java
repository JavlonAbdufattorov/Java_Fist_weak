import java.util.UUID;

public abstract class GenericClass implements BaseClass {

    protected UUID id;
    GenericClass(){
        this.id = UUID.randomUUID();
    }
}