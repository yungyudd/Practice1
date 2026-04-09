package set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart6 {

    private static final int CAPACITY = 10;
    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        for(int i=0; i<CAPACITY; i++){ //배열은 무조건 0부터
            buckets[i] = new LinkedList<>();
        }
        add(buckets,10);
        add(buckets,21);
        add(buckets, 1);
        add(buckets, 5);
        add(buckets, 6);

        System.out.println("buckets = "+ Arrays.toString(buckets));
        int searchValue = 1;
        boolean contains = contains(buckets, searchValue);
        System.out.println("bucket.contains("+searchValue+") ="+contains);

    }
    private static void add(LinkedList<Integer>[] budget, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> budgets = budget[hashIndex];
        if(!budgets.contains(value)){
            budgets.add(value);
        }
    }
    private static boolean contains(LinkedList<Integer>[] budget, int searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> budgets = budget[hashIndex];
        return budgets.contains(searchValue);
    }
    private static int hashIndex(int value){
        return value % CAPACITY;
    }
}
