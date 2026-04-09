package variable;

import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.print("숫자 개수 입력:");
        count = scanner.nextInt();
        int sum =0;
        double average;
        int[] num = new int[count];

        System.out.println(count+"개의 숫자 입력: ");
        for(int i=0; i<count; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        average = (double)sum/count;

        System.out.println("sum: "+sum);
        System.out.println("average: "+average);

    }
}
