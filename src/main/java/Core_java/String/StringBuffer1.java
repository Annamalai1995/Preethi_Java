package Core_java.String;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer ss= new StringBuffer("Preethi");
        //Append
        System.out.println(ss);
        System.out.println(ss.append("sivasankari"));
        //insert
        System.out.println(ss.insert(7,"Dhanusya"));
        //replace
        ss.replace(1,3,"priya");
        System.out.println(ss);
        //delete
        ss.delete(1,3);
        System.out.println(ss);
        ss.reverse();
        System.out.println(ss);

    }
}
