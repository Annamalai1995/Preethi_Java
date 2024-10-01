package Core_java.Collection;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer>tm = new TreeMap<String,Integer>();
        tm.put("Preethi",501);
        tm.put("Sivasankari",502);
        tm.put("Priya",503);
        tm.put("Deepika",504);
        System.out.println(tm);
        System.out.println(tm.get("Deepika"));
        System.out.println(tm.containsKey("Priya"));
        System.out.println(tm.containsValue(503));

    }
}
