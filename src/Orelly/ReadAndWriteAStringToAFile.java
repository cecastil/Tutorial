package Orelly;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.File;
import java.io.IOException;

public class ReadAndWriteAStringToAFile {
    public static void main(String[] args) {

        writeFile();
        readFile();

    }

    private static void writeFile() {
        try {
            File helloWorldFile = new File("helloworld.txt");
            if (!helloWorldFile.isFile()) {
                helloWorldFile.createNewFile();
            }
            Files.writeString(helloWorldFile.toPath(), "Hello World!", Charset.defaultCharset(), StandardOpenOption.WRITE);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write file", e);
        }
    }

    private static void readFile() {
        try {
            File helloWorldFile = new File("helloworld.txt");
            String content = Files.readString(helloWorldFile.toPath(), Charset.defaultCharset());
            System.out.print(content);
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file", e);

        }
    }
}

/*
 private static void writeFile(){
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(String.valueOf(new FileOutputStream("hellworld.txt"))))){
            String fileContent = "Hello World!";
            bufferedOutputStream.write(fileContent.getBytes());
        }catch (IOException e){
            throw new RuntimeException("Failed to write file", e);
        }
    }

    private static void readFile(){
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("hellworld.txt"))){
            int ch = bufferedInputStream.read();
            while(ch != -1){
                System.out.println((char) ch);
                ch = bufferedInputStream.read();
            }
        }catch (IOException e){
            throw new RuntimeException("Failed to read file", e);
        }
    }
 */