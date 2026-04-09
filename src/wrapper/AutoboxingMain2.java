package wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value; //오토 박싱
        Integer box = Integer.valueOf(value);

        int unboxedValue = boxedValue; //언박싱
        int unbox = box.intValue();


        System.out.println("boxedValue= "+boxedValue);
        System.out.println("unboxedValue= "+unboxedValue);
    }
}
