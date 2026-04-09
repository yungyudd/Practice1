package map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<String, Integer>());
        run(new LinkedHashMap<String, Integer>());
        run(new TreeMap<String, Integer>());

    }

    private static void run(Map<String, Integer> map){
        System.out.println("map = "+ map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
