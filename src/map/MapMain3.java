package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("s1", 80);
        map.put("s1", 70);
        System.out.println(map);

        if(!map.containsKey("s2")){
            map.put("s2", 100);
        }
        System.out.println(map);
        map.putIfAbsent("s3", 80);
        map.putIfAbsent("s2",90);
        System.out.println(map);
    }
}
