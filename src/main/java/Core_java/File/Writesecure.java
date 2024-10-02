package Core_java.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class Writesecure {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\Divya.txt");
        FileOutputStream fo= new FileOutputStream(ff);
        DeflaterOutputStream dos= new DeflaterOutputStream(fo);
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the text");
        String  data= scan.nextLine();
        dos.write(data.getBytes());
        System.out.println(ff.getName()+"WRITE THE SECURE FILE SUCCESS");
        dos.close();
        fo.close();



    }
}
