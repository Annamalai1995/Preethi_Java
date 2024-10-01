package Core_java.Collection;

import java.util.LinkedList;
import java.util.Stack;

public class Stackandlinked {
    public static void main(String[] args) {
        //stack : last in first out
        //push,pop,empty,peek,search

//        Stack st= new Stack(); // generic
//        Stack<Integer>st1= new Stack<Integer>(); //non generic
//        st.push("Preethi");
//        st.push("sivasankari");
//        st.push(78458412214l);
//        st.push(11);
//        st.push("Gowthamipriya");
//        System.out.println(st);
//        st.pop();
//        System.out.println("Pop Element:"+st);
//        if(st1.empty()==true)
//        {
//            System.out.println("Stack empty");
//        }
//        else {
//            System.out.println("Stack not empty");
//        }
//        System.out.println(st.search("sivasankari"));
//        System.out.println(st.peek());

        LinkedList<Integer> LL= new LinkedList<Integer>();
        LL.add(154);
        LL.add(4578);
        LL.add(4785);
        LL.add(785552);
        System.out.println("Linked list data:"+LL);

    }
}
