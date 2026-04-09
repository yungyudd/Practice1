package compare;

public class Compare1 {
    public static void main(String[] args) {
        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(2);

        int i1 = int1.compareTo(3);
        int i2 = int2.compareTo(1);

        System.out.println("i1 = "+ i1);
        System.out.println("i2 = "+ i2);
    }
}
