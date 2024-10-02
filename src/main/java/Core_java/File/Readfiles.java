package Core_java.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readfiles {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\Preethiandsiva.txt");
        FileInputStream fi=new FileInputStream(ff);
        int size= fi.available();
       // System.out.println(size);
        byte [] getting=new byte[fi.available()];
        fi.read(getting);
        System.out.println(getting);
        String ob= new String(getting);
        System.out.println(ob);


    }
}
