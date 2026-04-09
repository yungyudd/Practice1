package car;

public class K3Car implements Car{

    @Override
    public void startEngine(){
        System.out.println("k3 start");
    }
    @Override
    public void offEngine(){
        System.out.println("ke off");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("k3.acc");
    }
}
