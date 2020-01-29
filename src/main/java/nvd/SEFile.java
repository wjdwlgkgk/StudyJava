package nvd;

import java.io.File;
import java.net.URI;

public class SEFile extends File {
    final String pattern[] = {"/","\\",".","&"};
    private SEFile(String pathname) {
        super(pathname);
    }

    // 파일 이름에 경로를 유추 할 수 있는 문자열이 존재 할 경우 예외를 발생 시킴.
    public SEFile(String parent, String child, String extension) throws Exception {
        super(parent, child + "." + extension);
        for(String str : pattern){
            if(child.contains(str)){
                Exception e = new Exception("do not comaint file name : "+ str);
                throw e;
            }
        }
    }
    public SEFile(File parent, String child) {
        super(parent, child);
    }

    private SEFile(URI uri) {
        super(uri);
    }
}