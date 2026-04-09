package variable;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[5];

        System.out.println("정수");
        for(int i=0; i< num.length; i++){
            num[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for(int i=4; i>=0; i--){
            System.out.print(num[i]);
            if(i>0){
                System.out.print(",");
            }
        }
    }
}
