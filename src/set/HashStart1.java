package set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray = "+ Arrays.toString(inputArray));
        // System.out.println(inputArray); 주소값이 출력됨 arrays는 배열을 쉽게 다루기 위한 유틸리티 클래스



        int searchValue = 0;

        for(int inputValue : inputArray){
            if(inputValue == searchValue){
                System.out.println(inputValue);
            }
        }
    }
}
