package Core_java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("Preethi");
        ts.add("sivasankari");
        ts.add("Divya");
        ts.add("Dhanushya");
        ts.add("Preethi");
        ts.add("sivasankari");
        System.out.println(ts);
        HashSet<String >hs= new HashSet<String>();
        hs.addAll(ts);
        Iterator<String> it=hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next()+"Hash set values");
        }



    }
}
