package FileTest;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) throws IOException {

        // Temp 파일 생성하기.
        File enviTemp = File.createTempFile("result_enviTemp_", "_temp", new File("D:\\abc"));


    }
}
