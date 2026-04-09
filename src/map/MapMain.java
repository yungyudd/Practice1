package map;

import string.ValueAdder;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("s1", 80);
        map.put("s2", 90);
        System.out.println(map);

        Integer integer = map.get("s1");
        System.out.println("s1= " +integer);
        map.put("s1", 100);
        map.remove("s2");
        System.out.println("사용자 목록");
        for(String s : map.keySet()){
            System.out.println("id: "+s+", score: "+map.get(s));
        }
        System.out.println("전체 사용자: "+map.size());
        System.out.println("s2 is alive? "+ map.containsKey("s2"));

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 70);
        System.out.println(studentMap);

        Integer result = studentMap.get("studentC");
        System.out.println("result= " + result);

        System.out.println("keySet 활용");
        Set<String> strings = studentMap.keySet();
        for (String key: strings){
            Integer value = studentMap.get(key);
            System.out.println("key = "+key+", value = "+value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key= "+key+", value= "+value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for(Integer value : values){
            System.out.println("values = "+value);
        }
    }
}
