package list;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("b");
        list.add("C");

        System.out.println(list);
        String value = list.get(1);
        System.out.println(value);

        for(String s: list){
            System.out.println(s);
        }

        list.add(1, "x");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
