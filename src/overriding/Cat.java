package overriding;

public class Cat extends AbstractAnimal{

    @Override
    public void sound(){
        System.out.println("meow");
    }

    @Override
    public void move(){
        System.out.println("dddd");
    }
}
