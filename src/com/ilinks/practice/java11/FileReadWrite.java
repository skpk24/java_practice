package com.ilinks.practice.java11;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileReadWrite {

    public static void main(String[] args) {
        
        try {
            
            String tempDir = System.getProperty("java.io.tmpdir");
            System.out.println("Temp file path : "+ tempDir);
            
            File directory = new File("C:\\Development\\java\\java_practice\\temp");
            
            directory.mkdir();
            
            System.out.println("Directory path : "+ directory.getAbsolutePath());
            
            File tempFile = File.createTempFile("testFile", ".txt", directory);
            
            Path filePath = Path.of(tempFile.toURI());
            
            Path fileOutPutPath = Files.writeString(filePath, "This is my first temp file", Charset.defaultCharset(), 
                    StandardOpenOption.WRITE);
            
            String fileContent = Files.readString(fileOutPutPath);
            
            System.out.println("Created file content : "+ fileContent);
            
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
