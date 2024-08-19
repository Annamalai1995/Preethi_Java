package Core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        String Details[]={"Preethi","Sivasankari","priya","Deepika","Janani"};
        Details[4]="Gowthami";
        //System.out.println(Arrays.toString(Details));
        UpdateArray up=new UpdateArray();
        System.out.println("Before Update data:"+Arrays.toString(Details));
        Scanner scan=new Scanner(System.in);
        System.out.println("which index position:"+(Details.length-1));
        int index= scan.nextInt();
        System.out.println("You are selected position"+index +"Position values"+Details[index]);
        System.out.println("Please enter new name:");
        String name=scan.next();
        Details[index]=name;
        System.out.println("After upadate values is:"+Arrays.toString(Details));


    }

}
