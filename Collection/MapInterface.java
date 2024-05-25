package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String> obj=new HashMap<>();
        obj.put("name","okay");
        obj.put("age","100");
        obj.put("address","1-2024");
        obj.put("kingu",null);
        obj.put(null,null);
        System.out.println(obj);
        Map<String,String> obj1=new HashMap<>();
        obj.put("na","okay");
        obj.put("a1","100");
        obj.putAll(obj1);
        System.out.println(obj);
        obj.putIfAbsent("kk","1234567890");
        System.out.println(obj.get("a1"));
        System.out.println(obj);
        System.out.println(obj.containsKey("kk"));
        System.out.println(obj.containsValue("kk"));
        obj.replace("kk","1234");
        System.out.println(obj);
        obj.remove("kk");
        System.out.println(obj);

        Collection<String> coll = obj.values();
        System.out.println(coll);
        List<String> s = coll.stream().collect(Collectors.toList());
        System.out.println(s);
        System.out.println(s instanceof List);
        System.out.println(coll instanceof List);

        Set<String> s1 = obj.keySet();
        System.out.println(s1);

        Set<Map.Entry<String, String>> objEntries = obj.entrySet();
        System.out.println(objEntries); 

    }
}
