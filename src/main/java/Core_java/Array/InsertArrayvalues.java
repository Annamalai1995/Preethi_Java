package Core_java.Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArrayvalues {
    public static void main(String[] args) {
        int []array_name=new int[6];
        array_name[0]=56;
        array_name[4]=58;
        System.out.println(Arrays.toString(array_name));

        Scanner scan = new Scanner(System.in);
        for(int arr=0;arr<array_name.length;arr++)
        {
            System.out.println("Enter array value");
            array_name[arr]=scan.nextInt();

        }
        for(int preethi:array_name)
        {
            System.out.println(preethi);
        }




    }
}
