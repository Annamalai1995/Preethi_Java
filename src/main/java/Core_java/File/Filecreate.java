package Core_java.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filecreate {
    public static void main(String[] args) throws IOException {
        File ff= new File("F:\\Preethiandsiva.txt");
//        ff.createNewFile();
//        System.out.println(ff.getName()+"Successfull created the file");

        FileOutputStream  fs= new FileOutputStream(ff);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text of the file");
        String writefile=scan.nextLine();
        fs.write(writefile.getBytes());
        System.out.println(ff.getName()+"write files");





    }
}
