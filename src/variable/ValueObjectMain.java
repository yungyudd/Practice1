package variable;

public class ValueObjectMain {
    public static void main(String[] args) {


        ValueObject vb = new ValueObject();
        vb.add();
        System.out.println("숫자: "+vb.value);
    }
}
