package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {  //E 제네릭 타입 어떤 타입이든 저장 가능
    private static final int CAPACITY = 10;
    private LinkedList<E>[] buckets;

    private int size = 0;  //저장된 데이터 개수
    private int capacity = CAPACITY; //버킷 개수

    public MyHashSetV3(){ //기본 생성자  capacity = 10개
        initBuckets();
    }
    public MyHashSetV3(int capacity){   // 사용자 지정 생성자 capacity 사용자가 원하는 대로 생성
        this.capacity = capacity;
        initBuckets();
    }
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for(int i =0; i<capacity; i++){
            buckets[i] = new LinkedList<>();
        }
    }
    public boolean remove(E value){
        int hasIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hasIndex];
        boolean removed = bucket.remove(value);
        if(removed){
            size--;
            return true;
        }else{
            return false;
        }
    }
    public boolean contains(E searchValue){
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
    public boolean add(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        if(bucket.contains(value)){
            return false;
        }else{
            bucket.add(value);
            size++;
            return true;
        }
    }
    private int hashIndex(E value){
        int hashCode = value.hashCode();          //해시 코드
        return Math.abs(hashCode) % capacity;
    }

    @Override
    public String toString(){
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
    public int getSize(){
        return size;
    }
}
