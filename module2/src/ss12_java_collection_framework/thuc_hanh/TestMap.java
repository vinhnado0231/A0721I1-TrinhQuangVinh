package ss12_java_collection_framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Smith", 30);
        hashMap1.put("Anderson", 31);
        hashMap1.put("Lewis", 29);
        hashMap1.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap1 + "\n");

        Map<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("Smith", 30);
        hashMap2.put("Anderson", 31);
        hashMap2.put("Lewis", 29);
        hashMap2.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap2 + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap2);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
