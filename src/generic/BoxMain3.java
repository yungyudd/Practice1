package generic;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> intgerBox = new GenericBox<>();

        intgerBox.set(10);
        Integer integer = intgerBox.get();
        System.out.println("integer ="+integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("asdd");
        String str = stringBox.get();
        System.out.println("str ="+str);
    }
}
