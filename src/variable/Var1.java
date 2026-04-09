package variable;

import java.util.Scanner;

public class Var1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1");
        int num1 = scanner.nextInt();
        System.out.println("2");
        int num2 = scanner.nextInt();
        if(num1>num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }else if(num1==num2){
            System.out.println("total"+num1);
        }
        for(int i=num1; i<=num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }
    }
}
