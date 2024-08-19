package Core_java.Array;

import java.util.Arrays;

public class Two2DArray {
    //datatype [][]arrayname{{},{},{},{}}
    public static void main(String[] args) {
        int [][]matrix={{10,20,30},{40,50,60},{70,80,90},{100,110,120}};
        for(int row=0;row<4;row++)
        {
            for(int column = 0; column<3; column++)
            {
                System.out.println(matrix[row][column]+"");


            }
            System.out.println();
        }
    }

}
 // a[0][0]
//10 20 30
//40 50 60
//70 80 90
//100 110 120