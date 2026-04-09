package set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("b");
        set.add("C");
        System.out.println("String set"+set);
        MySet<Integer> set1 = new MyHashSetV3<>();
        set1.add(12);
        set1.add(2);
        set1.add(8);
        System.out.println("Integer set1"+set1);

        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("set.contains= "+ contains);

        Integer search = 2;
        boolean con = set1.contains(search);
        System.out.println("set1.con= "+con);
    }
}
