package Core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arraycreate {
    public static void main(String[] args) {
        String College_name[]={"PSG","KCT","KCE","Sona","Saranathan","Mahalingaam"};
      //  System.out.println("College Name:"+College_name);
//        System.out.println(Arrays.toString(College_name));
//        System.out.println("Length Of Array"+College_name.length);
//        System.out.println(College_name[5]);

        //For LOOP
//        for(int start=0;start<College_name.length;start++)
//        {
//            System.out.println(College_name[start]);
//        }
        //Array FOr Each
        //Syntax:
//        for(variablename:Arrayname)
//        {
//
//        }
//        for(String clgname:College_name)
//        {
//            System.out.println(clgname);
//
//        }
        char[]initial=new char[5];
//        initial[0]='S';
//        initial[1]='V';
//        initial[4]='O';
//        System.out.println(Arrays.toString(initial));
        for(int i=0;i<initial.length;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Tell us one character value:");
            char initial1=scan.next().charAt(1);
            initial[i]=initial1;




        }
        System.out.println(Arrays.toString(initial));
    }
}
