package variable;

public class VarChange2 {
    public static void main(String[] args) {
        Data data1 = new Data();

        data1.value = 10;

        Data data2 = data1;

        System.out.println("value 값: "+data1.value);
        System.out.println("value 값: "+data2.value);

        data1.value = 20;
        System.out.println("value 값: "+data1.value);
        System.out.println("value 값: "+data2.value);


    }
}
