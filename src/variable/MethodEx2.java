package variable;

public class MethodEx2 {
    public static void main(String[] args) {
           printMessage("hello",3);
           printMessage("hi",6);
           printMessage("oh", 5);
    }
    public static void printMessage(String message, int times){
        for(int i=0; i<times; i++){
            System.out.println(message);
        }
    }
}
