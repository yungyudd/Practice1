package set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSerV1 set = new MyHashSerV1();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // hashIndex 중복 발생
        System.out.println(set);

        int searchValue = 9;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+")= "+result);

        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = "+removeResult);
        System.out.println(set);
    }
}
