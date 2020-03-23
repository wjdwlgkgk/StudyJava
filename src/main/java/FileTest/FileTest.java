package FileTest;

import java.io.File;
import java.io.FileReader;

public class FileTest {
    public static void main(String[] args) {
        String str = "E:\\new.txt";
        File f = new File(str);
        System.out.println(f.length());
        FileReader fr = null;

        try {
            fr = new FileReader(f);
            fr = new FileReader(str);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
