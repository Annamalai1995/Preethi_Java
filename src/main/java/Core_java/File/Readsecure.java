package Core_java.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class Readsecure {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\Divya.txt");
        FileInputStream fr= new FileInputStream(ff);
        InflaterInputStream fi=new InflaterInputStream(fr);
        int size=fr.available();
        byte dd[]=new byte[size];
        fi.read(dd);
        System.out.println(new String(dd));
        fi.close();
        fr.close();






    }

}
