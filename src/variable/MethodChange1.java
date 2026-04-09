package variable;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("호출 전: " +a);
        change(a);
        System.out.println("호출 후: "+a);
    }

    static void change(int x) {
        x = 20;
    }
}
