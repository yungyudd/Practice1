package set;

public class Member1Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        Member1 m1 = new Member1("A");
        Member1 m2 = new Member1("A");
        System.out.println("m1.hashCode(): "+m1.hashCode());
        System.out.println("m2"+m2.hashCode());
        System.out.println("m1.equals(m2): "+m1.equals(m2));


    }
}
