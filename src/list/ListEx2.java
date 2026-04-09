package list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        System.out.println("n개의 정수 입력 (종료 0)");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();

        while (true){
            Integer input = scanner.nextInt();
            if(input.equals(0)){
                break;
            }
            number.add(input);
        }
        System.out.println("출력");
        for(int i=0; i<number.size(); i++){
            System.out.print(number.get(i));
            if(i<number.size() -1){
                System.out.println(", ");
            }
        }
    }
}
