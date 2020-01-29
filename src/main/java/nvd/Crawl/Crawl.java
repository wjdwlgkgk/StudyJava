package nvd.Crawl;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Crawl {
    public void fileDown(String FILE_URL, File FILE_NAME) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        InputStream in = new URL(FILE_URL).openStream();
        Files.copy(in, FILE_NAME.toPath(), StandardCopyOption.REPLACE_EXISTING);
        in.close();
    }

    public File unzip(File zipFile, File unZipFile) throws Exception {
        byte[] buffer = new byte[1024];
        File newFile = null;
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile))){
            ZipEntry zipEntry = zis.getNextEntry();
            while (zipEntry != null) {
                newFile = unZipFile;
                try(FileOutputStream fos = new FileOutputStream(newFile)){
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                }
                zipEntry = zis.getNextEntry();
            }
        }
        return newFile;
    }
}
