package list;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("java");
        list.add("spring");
        list.add("db");

        System.out.println("전체: "+list);

        System.out.println("첫 번째: "+list.get(0));

        String oldValue = list.set(1,"boot");
        System.out.println("그전 값: "+oldValue);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());


        for(String s: list){
            System.out.println("값: "+s);
        }
    }
}
