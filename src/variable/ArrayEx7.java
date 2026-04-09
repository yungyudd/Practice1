package variable;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 정수: ");
        int count = scanner.nextInt();
        int[] num = new int[count];
        int min, max;

        System.out.println(count+"개의 정수 입력: ");
        for(int i=0; i<count; i++){
            num[i] = scanner.nextInt();
        }

        min = max = num[0];
        for(int i=1; i<count; i++){
            if(min>num[i]){
                min = num[i];
            }
            if(max<num[i]){
                max = num[i];
            }
        }

        System.out.println("big: "+max);
        System.out.println("small: "+min);


    }
}
