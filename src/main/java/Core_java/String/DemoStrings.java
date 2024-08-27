package Core_java.String;

public class DemoStrings {
    public static void main(String[] args) {
        //literal
        String student_name="Sivasankari";
        //Non literal
        String stu_name=new String("Preethi");
        System.out.println(stu_name);
        System.out.println(student_name);
        char name[]={'p','r','e','e','t','h','i'};
        System.out.println(name);
        //CharAt()
        String fullname="Divya";
        System.out.println(fullname.charAt(2));
        //concat
        String lastname="bharathi";
        System.out.println(fullname+lastname);
        System.out.println(fullname.concat(lastname));
        //Equals
        String nickname="Dhanusya";
        String badname="Sivasankari";
        String bestfrndname="dhanusya";
        System.out.println(nickname.equals(badname));
        System.out.println(nickname.equalsIgnoreCase(bestfrndname));
        System.out.println(nickname==bestfrndname);
        //ToLowercase
        System.out.println(nickname.toLowerCase());
        //Touppercase
        System.out.println(badname.toUpperCase());
        System.out.println(badname.length());
        //Starwith
        System.out.println(nickname.startsWith("d"));
        //endwidths
        System.out.println(nickname.endsWith("a"));
        //Replace
        String proverb="Hardwork is better than smart work";
        String proverb1=proverb.replace("Hardwork","welldone");
        System.out.println(proverb1);
        //SubString
        String bestiee="Dhanusya";
        System.out.println(bestiee.substring(5));
        System.out.println(bestiee.substring(0,7));
        //Trim
        String bestiee1="Sivasankari preethi";
        System.out.println(bestiee1+"       Dhanusya");
        System.out.println(bestiee1.trim()+"Dhanusya");


    }
}
