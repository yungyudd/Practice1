package variable;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int count = scanner.nextInt();
        int[][] scores = new int[count][3];
        String[] subject = {"국어","영어", "수학"};

        System.out.println("학생수: ");
        for(int i=0; i<count; i++){
            System.out.println((i+1)+"번 학생의 성적 입력: ");
            for(int j=0; j< subject.length; j++){
                System.out.println(subject[j]+"점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }
        for(int i=0; i<count; i++) {
            int sum=0;
            for(int j=0; j< subject.length; j++){
                sum += scores[i][j];
            }
            double average = (double)sum/3.0;
            System.out.println((i+1)+"번 학생의 총점: "+sum+", average: "+average);
        }
    }
}
