package Core_java.Array;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
//        int [][]demo={{1,2,3},{4,5,6,7,8},{9,10,11,12,13,14,16,17}};
//        for(int demo1[]:demo){
//            for(int demo2:demo1){
//                System.out.println("Array values"+demo2);
//            }
//            System.out.println();
//
//        }
        String ofc_details[][]=new String[2][];
        ofc_details[0]=new String[4];
        ofc_details[1]=new String[2];
        for(int floor=0;floor<ofc_details.length;floor++)
        {
            for(int room=0;room<ofc_details[floor].length;room++)
            {
                System.out.println("Cognizant ");
                Scanner scan = new Scanner(System.in);
                System.out.println("floor no:"+floor+"\n room no:"+(room+1)+"\t enter employee name");
                ofc_details[floor][room]=scan.next();


            }
        }
        for(String ofc_details1[]:ofc_details){
            for(String ofc_deatils2:ofc_details1)
            {
                System.out.println(ofc_deatils2+"\t");
            }
            System.out.println();
        }
    }

}
