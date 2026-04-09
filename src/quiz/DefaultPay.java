package quiz;

public class DefaultPay implements Pay{

    @Override
    public boolean pay(int amount){
        System.out.println("없는 결제수단입니다");
        return false;
    }
}
