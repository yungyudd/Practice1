package set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] input = new Integer[10];
        input[1] = 1;
        input[2] = 2;
        input[5] = 5;
        input[8] = 8;   // 데이터를 조회할 때 데이터의 값을 같은 인덱스를 사용해서 조회함

        //index == value
        // input = [null, 1, 2, null, null, 5, null, null, 8, null]
        System.out.println("input= "+ Arrays.toString(input));

        int searchValue = 8;
        Integer result = input[searchValue];
        System.out.println(result);
    }
}
