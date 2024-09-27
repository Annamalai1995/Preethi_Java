package Core_java.Collection;

import java.util.ArrayList;
import java.util.Vector;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList li=new ArrayList(); //generic
        li.add("Preethi");
        li.add("sivasankari");
        li.add(22);
        li.add(22);
        li.add(987458452145l);
       // System.out.println(li);
        Vector li1=new Vector();
        li1.addAll(li);
        li1.add("Divya");
        li1.add("Dhanushya");
        System.out.println("Array list"+li);
        System.out.println("Vector list"+li1);
        li1.remove("Dhanushya");
        System.out.println("Remove ARray or vector:"+li1);
        li1.removeAll(li);

        System.out.println("remove "+li1);

        li1.retainAll(li);
        System.out.println("Retain:"+li1);


    }
}
