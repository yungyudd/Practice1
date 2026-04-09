package variable;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력할 숫자의 개수 입력: ");
        int press = scanner.nextInt();

        int[] num = new int[press];
        int sum = 0;
        double average;

        System.out.println(press+"개의 정수 입력: ");
        for(int i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        average = (double)sum/press;
        System.out.println("sum: "+sum);
        System.out.println("average: "+average);
        

    }
}
