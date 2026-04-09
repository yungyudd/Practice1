package parent;

public class Child1 extends Parent1{
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this.value = "+ this.value);
        System.out.println("super.value = "+ super.value);

        this.hello();
        super.hello();
    }
}
